package com.behavioural.template;

public class HouseMain {

	public static void main(String[] args) {
		
		
		HouseTemplate ht = new WoodenHouse();
		
		ht.buildHouse();
		
		System.out.println("..............");
		
		ht = new GlassHouse();
		ht.buildHouse();

	}

}
