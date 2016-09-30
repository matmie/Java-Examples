/**
 * 
 */
package com.madmatsoft.examples.oopconcepts;

/**
 * @author mateusz
 *
 */
public class BicycleClass {
	private int cadence = 0;
	private int speed = 0;
	private int gear = 0;

	public void changeCadence(int newValue) {
		this.cadence = newValue;
	}

	public void changeGear(int newValue) {
		this.gear = newValue;
	}

	public void speedUp(int increment) {
		this.speed = this.speed + increment;
	}

	public void applyBrakes(int decrement) {
		this.speed = this.speed - decrement;
	}

	public void printStates() {
		System.out.println("cadence: " + this.cadence + " speed: " + this.speed + " gear:" + this.gear);
	}
}
