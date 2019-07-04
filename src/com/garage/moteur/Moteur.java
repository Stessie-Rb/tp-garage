package com.garage.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable {
	
	protected TypeMoteur typeMoteur;
	protected String cylindreMoteur;
	protected Double prixMoteur; 
	
	public Moteur(){
		this.cylindreMoteur= "Inconnu";
		this.prixMoteur= 0.00;
	}
	
	public Moteur(String vCylindreMoteur, Double vPrixMoteur) {
		this.cylindreMoteur= vCylindreMoteur;
		this.prixMoteur= vPrixMoteur;
	}
	
	public TypeMoteur getTypeMoteur() {
		return typeMoteur;
	}
	
	public String getCylindreMoteur() {
		return cylindreMoteur;
	}
	public Double getPrixMoteur() {
		return prixMoteur;
	}
	
	public void setTypeMoteur(TypeMoteur vTypeDeMoteur) {
		this.typeMoteur= vTypeDeMoteur; 
	}
	
	public String toString() {
		return this.getCylindreMoteur() +" (" +
				this.getPrixMoteur() + " €)";
	}
}
