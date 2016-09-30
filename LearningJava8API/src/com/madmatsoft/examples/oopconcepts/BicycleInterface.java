/**
 * 
 */
package com.madmatsoft.examples.oopconcepts;

/**
 * @author mateusz
 *
 */
public interface BicycleInterface {
	void changeCadence(int newValue);
	void changeGear(int newValue);
	void speedUp(int increment);
	void applyBrakes(int decrement);
}
