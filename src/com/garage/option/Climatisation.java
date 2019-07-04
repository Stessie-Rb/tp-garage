package com.garage.option;

public class Climatisation implements Option {
	
	@Override
	public Double getPrix() {
		return 400.0d; 
	}
	
	@Override
	public String toString() {
		return "Climatisation";
	}
	
}
