package com.garage.option;

public class VitresElectriques implements Option{
	
	@Override
	public Double getPrix() {
		
		return 250.0d; 
	}
	
	@Override
	public String toString() {
		return "Vitres éléctriques";
	}
}
