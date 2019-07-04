package com.garage.option;

public class SiegeChauffant implements Option {
	
	@Override
	public Double getPrix() {
		return 450.0d; 
		
	}
	
	@Override
	public String toString() {
		return "Sièges chauffants";
	}
}
