package com.garage.voiture;

public enum Marque{
	PLYMOUTH("Plymouth"),
	KOENIGSEGG("Koenigsegg"),
	FORD("Ford"),
	DODGE("Dodge"),
	CHEVROLET("Chevrolet"),
	PONTIAC("Pontiac");
	
	private String marque;
	
	Marque(String marque){
		this.marque= marque;
	}
	
	public String toString() {
		return marque;
	}

}
