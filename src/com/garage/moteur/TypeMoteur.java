package com.garage.moteur;

public enum TypeMoteur {
	
	DIESEL("Diesel"),
	ESEENCE("Essence"),
	ELECTRIQUE("Electrique"),
	HYBRIDE("Hybride");
	
	private String typeMoteur;
	
	TypeMoteur(String typeMoteur){
		this.typeMoteur = typeMoteur;
	}
	
	public String toString() {
		return typeMoteur;
	}

}
