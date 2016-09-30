package com.madmatsoft.examples.oopconcepts;


public class DemoCalculator {

	public static void main(String[] args) {
		
		Calculator calc = new SimpleCalculator();
		ScientifiCalculator calcSc = new ScientificCalculator();
		
		double result = 0;
		
		result = calc.add(10, 20);
		
		System.out.println("Result of adding 10 and 20 is:" + result);
		
		result = calc.pow(3.1415);
		
		System.out.println("Result of power 3.1415 is:" + result);
		
		result = calcSc.pow(23, 5);
		
		System.out.println("Result of power 23 to 5 is:" + result);
		
		

	}

}
