 package com.garage.moteur;

public class MoteurElectrique extends Moteur{
		public MoteurElectrique(String cylindreMoteurVoiture, double prixMoteurVoiture) {
			super(cylindreMoteurVoiture, prixMoteurVoiture);
			this.setTypeMoteur(TypeMoteur.ELECTRIQUE);
			
		}
		
		public String toString() {
			return this.cylindreMoteur + " au prix de: " + this.prixMoteur + "€"; 
		}
	}
