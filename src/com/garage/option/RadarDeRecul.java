package com.garage.option;

public class RadarDeRecul implements Option{
	
	@Override
	public Double getPrix() {
		return 350.0d; 
	}
	
	@Override
	public String toString() {
		return "Radar de recul";
	}
}
