package com.garage.moteur;

public class MoteurHybride extends Moteur{
		public MoteurHybride(String cylindreMoteurVoiture, double prixMoteurVoiture) {
			super(cylindreMoteurVoiture, prixMoteurVoiture);
			this.setTypeMoteur(TypeMoteur.HYBRIDE);
		}
		
		public String toString() {
			return this.typeMoteur + " " +  this.cylindreMoteur + "(" + this.prixMoteur + "€)"; 
		}
	}
