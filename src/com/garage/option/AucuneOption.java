package com.garage.option;

public class AucuneOption implements Option{
	
	@Override
	public Double getPrix() {
		return 0d; 
	}
	
	@Override
	public String toString() {
		return "Aucune option pour ce véhicule";
	}

}
