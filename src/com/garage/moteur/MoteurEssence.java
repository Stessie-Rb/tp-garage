package com.garage.moteur;

public class MoteurEssence extends Moteur{
	public MoteurEssence(String cylindreMoteurVoiture, double prixMoteurVoiture) {
		super(cylindreMoteurVoiture, prixMoteurVoiture);
		this.setTypeMoteur(TypeMoteur.ESEENCE);
		
	}
	
	public String toString() {
		return this.typeMoteur + " " +  this.cylindreMoteur + "(" + this.prixMoteur + "€)"; 
	}
}