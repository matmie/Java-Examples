package com.madmatsoft.examples.oopconcepts;

public class ACMEBicycle implements BicycleInterface {
	
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	@Override
	public void changeCadence(int newValue) {
		this.cadence = newValue;

	}

	@Override
	public void changeGear(int newValue) {
		this.gear = newValue;

	}

	@Override
	public void speedUp(int increment) {
		this.speed = this.speed + increment;

	}

	@Override
	public void applyBrakes(int decrement) {
		this.speed = this.speed - decrement;

	}
	
	public void printStates(){
		System.out.println("cadence: " + this.cadence + " speed:" + this.speed + " gear:" + this.gear);
	}

}
