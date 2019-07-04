package com.garage.voiture;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.garage.moteur.*;
import com.garage.option.*;

public abstract class Vehicule implements Serializable {
	
	protected String nom;
	protected Marque marque;
	protected List<Option> options = new ArrayList <Option>();
	protected Double prixVehicule;
	protected Moteur moteur;
	protected Double prixOptions = new Double(0.00);
	protected Double prixTotal= new Double(0.00);
	
	//constructeur par défaut
	public Vehicule() {
		this.nom= "Indéfini";
		this.marque= null;	
		this.options= new ArrayList <Option>();
		this.prixVehicule= new Double(0.00);

		
	}
	
	//constructeur avec params
	public Vehicule(String vNom, Marque vMarque, List<Option> vOptions, Double vPrixVehicule) {
		this.nom= vNom;
		this.marque= vMarque;
		this.options= vOptions;
		this.prixVehicule= new Double(0.00);
	}
	
	public void addOption(Option o) {
		options.add(o);
	}
	
	//Getter
	public String getNom() {
		return this.nom;
	}
	
	public String getMarque() {
	     return marque.name();
	}
	
	public List<Option> getOption(){
		return this.options;
	}
	public Double getPrixVehicule() {
		return this.prixVehicule;
	}
	
	
	public Moteur getMoteur() {
		return this.moteur;
	}
	
	//Setter
	public void setMoteur(Moteur moteur) {
		this.moteur= moteur;
	}
	public void setNom(String vNom) {
		this.nom= vNom;
		
	}
	protected void setMarque(Marque vMarque) {
		this.marque= vMarque;
	}
	public void setPrix(Double vPrixVehicule) {
		this.prixVehicule= vPrixVehicule;
	}

	//définir le nouveau prix du véhicule avec ses options et son moteur
	public double getPrixOptions() {
		for(int i = 0; i < this.options.size(); i++){
			this.prixOptions += this.options.get(i).getPrix();
			}
            return this.prixOptions;
                 
    }
	public double getPrixTotal() {
		return this.prixVehicule + this.moteur.getPrixMoteur() + this.getPrixOptions();
	}


	public String toString() {
		
		return this.getMarque() + ": " + this.getNom() + ", avec un moteur "
	 + this.moteur.toString()  + "\n Options" + this.getOption().toString() +"\n"
		+ "Prix véhicule seul: " + this.getPrixVehicule() + "€ \n"     
		+ "Prix véhicule avec options: " + this.getPrixTotal() + "€ \n";
		
		
	}
	
	
}
