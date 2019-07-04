package com.garage.option;


public class BarreDeToit implements Option{
	
	@Override
	public Double getPrix(){
		return 100.0d; 
	}
	
	@Override
	public String toString() {
		return "Barres de toit";
	}
}
