package com.garage.option;


public class GPS implements Option{
	
	@Override
	public Double getPrix() {
		return 140.0d;
	}
	
	@Override
	public String toString() {
		return "Gps";
	}

}
