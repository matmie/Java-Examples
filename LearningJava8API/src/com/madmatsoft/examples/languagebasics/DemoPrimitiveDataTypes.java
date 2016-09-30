package com.madmatsoft.examples.languagebasics;

import java.io.IOException;
import java.lang.management.ManagementFactory;

public class DemoPrimitiveDataTypes {

	/**
	 * 8-bit [-128,127(inclusive)]
	 */
	static byte byteType;
	/**
	 * 16-bit [-32.768, 32.767(inclusive)]
	 */
	static short shortType;
	/**
	 * 32-bit [-2^31,2^31-1] Use the Integer class to use unsigned integer
	 * [0,2^32-1]
	 */
	static int intType;
	/**
	 * 64-bit [-2^63, 2^63-1] Use the Long class to use unsigned long[0,2^64-1]
	 */
	static long longType;
	/**
	 * single-precision 32-bit
	 */
	static float floatType;
	/**
	 * double-precision 64-bit
	 */
	static double doubleType;
	/**
	 * only two values true or false
	 */
	static boolean booleanType;
	/**
	 * single 16-bit Unicode character ['\u0000'(0), '\uffff'(65535(inclusive))]
	 */
	static char charType;

	/**
	 * Defaults values of primitives types. Only class fields can be
	 * uninitialized. Every local variable need to be initialize otherwise
	 * compiler show compile-time error.
	 */
	public static void primitiveTypesDefaultValues() {

		System.out.println("----------------DEFAULT VALUES OF PRIMITIVE TYPES------------------");

		System.out.println("Default value of byteType is: " + byteType);
		System.out.println("Default value of shortType is: " + shortType);
		System.out.println("Default value of intType is: " + intType);
		System.out.println("Default value of longType is: " + longType);
		System.out.println("Default value of floatType is: " + floatType);
		System.out.println("Default value of doubleType is: " + doubleType);
		System.out.println("Default value of booleanType is: " + booleanType);
		System.out.println("Default value of charType is: " + charType);
	}

	public static void main(String[] args) {

		primitiveTypesDefaultValues();
		System.out.println("");
		byteTypeOverview();
		System.out.println("");
		primitiveTypesCasting();

	}

	/**
	 * Checking the byte type and trying understand casting from int to byte.
	 * Why (int)1000 is (byte)-24
	 */
	public static void byteTypeOverview() {
		System.out.println("----------------BYTE TYPE OVERWIEV------------------");

		System.out.println("Min:" + Byte.MIN_VALUE + " Max:" + Byte.MAX_VALUE);

		byte byteType = 0;

		System.out.println("Value: " + byteType);
		byteType = (byte) (Byte.MAX_VALUE + 1);

		System.out.println("Max value of byte + 1 is:" + byteType);

		byteType = (byte) (Byte.MIN_VALUE - 1);
		System.out.println("Min value of byte - 1 is:" + byteType);

		int intType = 1000;
		byteType = (byte) intType;
		System.out.println("Int type stores:" + intType);
		System.out.println("But int type as byte type is:" + byteType);
		System.out.println("Why? " + Byte.MIN_VALUE + "(Min) need to by 0 by " + Byte.MIN_VALUE + " + "
				+ (-Byte.MIN_VALUE) + " and " + Byte.MAX_VALUE + "(Max) need to by shifted to " + Byte.MAX_VALUE + " + "
				+ (-Byte.MIN_VALUE) + " to " + (Byte.MAX_VALUE + (-Byte.MIN_VALUE)));
		System.out.println("Now we have [0," + (Byte.MAX_VALUE + (-Byte.MIN_VALUE)) + ") so 256 is 0 in this circle.");
		System.out.println("So wee need to shift " + intType + " with " + (-Byte.MIN_VALUE));
		intType = intType + (-Byte.MIN_VALUE);
		System.out.println("Now we have intType:" + intType);
		System.out.println("We need to do " + intType + " mod 256 and is:" + (intType % 256));
		System.out.println("And do " + Byte.MIN_VALUE + " + " + (intType % 256) + " and it is:"
				+ (Byte.MIN_VALUE + (intType % 256)));

	}

	/**
	 * Try to casting all primitives types to all primitive types and compare
	 * results to types ranges. You can change initial local values and look at
	 * the results.
	 */
	public static void primitiveTypesCasting() {
		System.out.println("----------------PRIMITIVE TYPE OVERWIEV------------------");
		int tmp = 0;
		boolean debug = ManagementFactory.getRuntimeMXBean().getInputArguments().toString().indexOf("jdwp") >= 0;

		byte byteType = Byte.MIN_VALUE;
		;
		short shortType = Short.MIN_VALUE;
		int intType = Integer.MIN_VALUE;
		long longType = Long.MIN_VALUE;
		float floatType = Float.MIN_VALUE;
		double doubleType = Double.MIN_VALUE;
		boolean booleanType = true;
		char charType = Character.MAX_VALUE;

		String byteTypeRange = "[" + Byte.MIN_VALUE + "," + Byte.MAX_VALUE + ")";
		String shortTypeRange = "[" + Short.MIN_VALUE + "," + Short.MAX_VALUE + ")";
		String intTypeRange = "[" + Integer.MIN_VALUE + "," + Integer.MAX_VALUE + ")";
		String longTypeRange = "[" + Long.MIN_VALUE + "," + Long.MAX_VALUE + ")";
		String floatTypeRange = "[" + Float.MIN_VALUE + "," + Float.MAX_VALUE + ")";
		String doubleTypeRange = "[" + Double.MIN_VALUE + "," + Double.MAX_VALUE + ")";
		String booleanTypeRange = "{true,false}";
		String charTypeRange = "[" + (int) Character.MIN_VALUE + "," + (int) Character.MAX_VALUE + ")";

		System.out.println("-------------------------BYTE TO ...----------------");
		System.out.println("byteType = " + byteType + " to short is " + (short) byteType
				+ " beacause byteType is in shortType range. " + shortTypeRange);

		System.out.println("byteType = " + byteType + " to int is " + (int) byteType
				+ " beacause byteType is in intType range. " + intTypeRange);
		System.out.println("byteType = " + byteType + " to long is " + (long) byteType
				+ " beacause byteType is in longType range. " + longTypeRange);
		System.out.println("byteType = " + byteType + " to float is " + (float) byteType
				+ " beacause byteType is in floatType range. " + floatTypeRange);
		System.out.println("byteType = " + byteType + " to double is " + (double) byteType
				+ " beacause byteType is in doubleType range. " + doubleTypeRange);
		System.out.println("Cannot cast byte to boolean. " + booleanTypeRange);
		System.out.println("byteType = " + byteType + " to char is " + (int) ((char) byteType)
				+ " beacause byteType is out of charType range. " + charTypeRange + " [char is unsigned]");

		System.out.println("\n");

		if (!debug) {
			System.out.println("SHORT type next ......");
			System.out.println("PRESS KEY");
			try {
				tmp = System.in.read();
			} catch (IOException e) {
				System.out.println("Error when typing key from keyboard...");
			}
		}

		System.out.println("------------------------SHORT to...-----------------");
		System.out.println("shortType = " + shortType + " to byte is " + (byte) shortType + " because " + shortType
				+ " is out of byteType range. " + byteTypeRange);
		System.out.println("shortType = " + shortType + " to integer is " + (int) (shortType) + " because " + shortType
				+ " is in intType range. " + intTypeRange);
		System.out.println("shortType = " + shortType + " to long is " + (long) (shortType) + " because " + shortType
				+ " is in longType range. " + longTypeRange);
		System.out.println("shortType = " + shortType + " to float is " + (float) (shortType) + " because " + shortType
				+ " is in floatType range. " + floatTypeRange);
		System.out.println("shortType = " + shortType + " to double is " + (double) (shortType) + " because "
				+ shortType + " is in doubleType range. " + doubleTypeRange);
		System.out.println("Cannot cast short to boolean. " + booleanTypeRange);
		System.out.println("shortType = " + shortType + " to char is " + (int) ((char) (shortType)) + " because "
				+ shortType + " is out of charType range. " + charTypeRange + " [char is unsigned]");

		System.out.println("\n");
		if (!debug) {
			System.out.println("INT type next ......");
			System.out.println("PRESS KEY");
			try {
				tmp = System.in.read();
			} catch (IOException e) {
				System.out.println("Error when typing key from keyboard...");
			}
		}

		System.out.println("------------------------INT to...-----------------");
		System.out.println("intType = " + intType + " to byte is " + (byte) intType + " because " + intType
				+ " is out of byteType range. " + byteTypeRange);
		System.out.println("intType = " + intType + " to short is " + (int) (intType) + " because " + intType
				+ " is out of shortType range. " + shortTypeRange);
		System.out.println("intType = " + intType + " to long is " + (long) (intType) + " because " + intType
				+ " is in longType range. " + longTypeRange);
		System.out.println("intType = " + intType + " to float is " + (float) (intType) + " because " + intType
				+ " is in floatType range. " + floatTypeRange);
		System.out.println("intType = " + intType + " to double is " + (double) (intType) + " because " + intType
				+ " is in doubleType range. " + doubleTypeRange);
		System.out.println("Cannot cast int to boolean. " + booleanTypeRange);
		System.out.println("intType = " + intType + " to char is " + (int) ((char) (intType)) + " because " + intType
				+ " is out of charType range. " + charTypeRange + " [char is unsigned]");

		System.out.println("\n");
		if (!debug) {
			System.out.println("LONG type next ......");
			System.out.println("PRESS KEY");
			try {
				tmp = System.in.read();
			} catch (IOException e) {
				System.out.println("Error when typing key from keyboard...");
			}
		}

		System.out.println("------------------------LONG to...-----------------");
		System.out.println("longType = " + longType + " to byte is " + (byte) longType + " because " + longType
				+ " is out of byteType range. " + byteTypeRange);
		System.out.println("longType = " + longType + " to short is " + (short) (longType) + " because " + longType
				+ " is out of shortType range. " + shortTypeRange);
		System.out.println("longType = " + longType + " to int is " + (int) (longType) + " because " + longType
				+ " is out of intType range. " + intTypeRange);
		System.out.println("longType = " + longType + " to float is " + (float) (longType) + " because " + longType
				+ " is in floatType range. " + floatTypeRange);
		System.out.println("longType = " + longType + " to double is " + (double) (longType) + " because " + longType
				+ " is in doubleType range. " + doubleTypeRange);
		System.out.println("Cannot cast long to boolean. " + booleanTypeRange);
		System.out.println("longType = " + longType + " to char is " + (int) ((char) (longType)) + " because "
				+ longType + " is out of charType range. " + charTypeRange + " [char is unsigned]");

		System.out.println("\n");
		if (!debug) {
			System.out.println("FLOAT type next ......");
			System.out.println("PRESS KEY");
			try {
				tmp = System.in.read();
			} catch (IOException e) {
				System.out.println("Error when typing key from keyboard...");
			}
		}

		System.out.println("------------------------FLOAT to...-----------------");
		System.out.println("floatType = " + floatType + " to byte is " + (byte) floatType + " because " + floatType
				+ " is out of byteType range. " + byteTypeRange);
		System.out.println("floatType = " + floatType + " to short is " + (short) (floatType) + " because " + floatType
				+ " is out of shortType range. " + shortTypeRange);
		System.out.println("floatType = " + floatType + " to int is " + (int) (floatType) + " because " + floatType
				+ " is out of intType range. " + intTypeRange);
		System.out.println("floatType = " + floatType + " to long is " + (long) (floatType) + " because " + floatType
				+ " is out of longType range. " + longTypeRange);
		System.out.println("floatType = " + floatType + " to double is " + (double) (floatType) + " because "
				+ floatType + " is in doubleType range. " + doubleTypeRange);
		System.out.println("Cannot cast float to boolean. " + booleanTypeRange);
		System.out.println("floatType = " + floatType + " to char is " + (int) ((char) (floatType)) + " because "
				+ floatType + " is out of charType range. " + charTypeRange + " [char is unsigned]");
		System.out.println("Max float type = " + Float.MAX_VALUE + " casted to int is:" + (int) Float.MAX_VALUE);

		System.out.println("\n");
		if (!debug) {
			System.out.println("DOUBLE type next ......");
			System.out.println("PRESS KEY");
			try {
				tmp = System.in.read();
			} catch (IOException e) {
				System.out.println("Error when typing key from keyboard...");
			}
		}

		System.out.println("------------------------DOUBLE to...-----------------");
		System.out.println("doubleType = " + doubleType + " to byte is " + (byte) doubleType + " because " + doubleType
				+ " is out of byteType range. " + byteTypeRange);
		System.out.println("doubleType = " + doubleType + " to short is " + (short) (doubleType) + " because "
				+ doubleType + " is out of shortType range. " + shortTypeRange);
		System.out.println("doubleType = " + doubleType + " to int is " + (int) (doubleType) + " because " + doubleType
				+ " is out of intType range. " + intTypeRange);
		System.out.println("doubleType = " + doubleType + " to long is " + (long) (doubleType) + " because "
				+ doubleType + " is out of longType range. " + longTypeRange);
		System.out.println("doubleType = " + doubleType + " to float is " + (float) (doubleType) + " because "
				+ doubleType + " is in floatType range. " + floatTypeRange);
		System.out.println("Cannot cast double to boolean. " + booleanTypeRange);
		System.out.println("doubleType = " + doubleType + " to char is " + (int) ((char) (doubleType)) + " because "
				+ doubleType + " is out of charType range. " + charTypeRange + " [char is unsigned]");

		System.out.println("\n");
		if (!debug) {
			System.out.println("BOOLEAN type next ......");
			System.out.println("PRESS KEY");
			try {
				tmp = System.in.read();
			} catch (IOException e) {
				System.out.println("Error when typing key from keyboard...");
			}
		}

		System.out.println("------------------------BOOLEAN to...-----------------");
		System.out.println("Cannot cast booleanType to any another primitives types.");

		System.out.println("\n");
		if (!debug) {
			System.out.println("BOOLEAN type next ......");
			System.out.println("PRESS KEY");
			try {
				tmp = System.in.read();
			} catch (IOException e) {
				System.out.println("Error when typing key from keyboard...");
			}
		}

		System.out.println("------------------------CHAR to...-----------------");
		System.out.println("Max charType as number = " + (int) charType + " to byte is " + (byte) charType + " because "
				+ (int) charType + " is out of byteType range. " + byteTypeRange);
		System.out.println("Max charType as number = " + (int) charType + " to short is " + (short) charType
				+ " because " + (int) charType + " is out of shortType range. " + shortTypeRange);
		System.out.println("Max charType as number = " + (int) charType + " to int is " + (int) (charType) + " because "
				+ (int) charType + " is in intType range. " + intTypeRange);
		System.out.println("Max charType as number = " + (int) charType + " to long is " + (long) (charType)
				+ " because " + (int) charType + " is in longType range. " + longTypeRange);
		System.out.println("Max charType as number = " + (int) charType + " to float is " + (float) (charType)
				+ " because " + (int) charType + " is in floatType range. " + floatTypeRange);
		System.out.println("Cannot cast Max charType as number to boolean. " + booleanTypeRange);
		System.out.println("Max charType as number = " + (int) charType + " to double is " + (double) charType
				+ " because " + (int) charType + " is in doubleType range. " + doubleTypeRange);

	}

}
