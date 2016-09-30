package com.madmatsoft.examples.oopconcepts;

public class SimpleCalculator implements Calculator {
	
	
	boolean isOn = true;
	int batteryState = 100;
	
	@Override
	public double add(double a, double b) {
		return a+b;
	}

	@Override
	public double diff(double a, double b) {
		return a-b;
	}

	@Override
	public double multi(double a, double b) {
		return a*b;
	}

	@Override
	public double div(double a, double b) {
		return a/b;
	}

	@Override
	public double sqrt(double a) {
		return Math.sqrt(a);
	}

	@Override
	public double pow(double a) {
		return Math.pow(a, 2);
	}

	@Override
	public void setOn() {
		this.isOn = true;

	}

	@Override
	public void setOff() {
		this.isOn = false;
	}

	@Override
	public int getBatteryState() {
		return this.batteryState;
	}

	@Override
	public void setBatteryState(int batteryState) {
		this.batteryState = batteryState;

	}

	@Override
	public String toString() {
		return "SimpleCalculator [isOn=" + isOn + ", batteryState=" + batteryState + "]";
	}

}
