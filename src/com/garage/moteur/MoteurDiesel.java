package com.garage.moteur;

public class MoteurDiesel extends Moteur {
	public MoteurDiesel(String cylindreMoteurVoiture, double prixMoteurVoiture) {
		super(cylindreMoteurVoiture, prixMoteurVoiture);
		this.setTypeMoteur(TypeMoteur.DIESEL);

	}
	
	public String toString() {
		return this.cylindreMoteur + "au prix de: " + this.prixMoteur + "€";
	}

}
