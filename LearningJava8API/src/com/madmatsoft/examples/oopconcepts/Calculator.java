package com.madmatsoft.examples.oopconcepts;

public interface Calculator {
	
	double add(double a,double b);
	
	double diff(double a, double b);
	
	double multi(double a, double b);
	
	double div(double a, double b);
	
	double sqrt(double a);
	
	double pow(double a);
	
	
	void setOn();
	
	void setOff();
	
	int getBatteryState();
	
	void setBatteryState(int batteryState);
}
