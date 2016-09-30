/**
 * 
 */
package com.madmatsoft.examples.oopconcepts;

/**
 * @author mateusz
 *
 */
public class DemoBicycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BicycleClass bike1 = new BicycleClass();
		BicycleClass bike2 = new BicycleClass();
		
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();
		
		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.printStates();
		
	}

}
