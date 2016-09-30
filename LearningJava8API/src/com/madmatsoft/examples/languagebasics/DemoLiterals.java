/**
 * 
 */
package com.madmatsoft.examples.languagebasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoLiterals {

	public static void main(String[] args) {
		integerLiterals();
		System.out.println("");
		floatingPointLiterals();
		System.out.println("");
		characterAndStringLiterals();
		System.out.println("");
		specualEscapeSequences();
		System.out.println("");
		nullAndClassLiterals();
		//System.out.println("");
		//underScoreCharacterInNumericLiteral();
	}
	/**
	 * Int literals overview.
	 */
	public static void integerLiterals(){
		System.out.println("--------------INT LITERALS---------------");
		
		int decVal = 26;
		int hexVal = 0x1a;
		int binVal = 0b110110;
		long longVal = 26L;
		
		System.out.println("Long can be created from int with L letter on the end. Ex 26L");
		System.out.println("Integer as decimal (Base 10) 'int decVal = 26;'");
		System.out.println("Integer as hexadecimal (Base 16) 'int hexVal = 0x1a;'" );
		System.out.println("Integer as binary (Base 2) 'int binVal = 0b110110;'");
		
		System.out.println("decVal = " + decVal + " hexVal = " + hexVal + " binVal = " + binVal + " longVal = " + longVal);
		
		if((decVal == hexVal) && (hexVal == binVal) && (binVal == longVal)){
			System.out.println("Every valuses are the same.");
		}
	}
	
	/**
	 * Floating-Point literals overview.
	 */
	public static void floatingPointLiterals(){
		System.out.println("---------------FLOATING-POINT LITERALS-----------------");
		
		float floatVal = 10F; //or f
		double doubleVal = 10D; // or d
		
		float floatExp = 1E1f;
		double doubleExp = 1E1d;
		
		System.out.println("Float as default notation is " + floatExp);
		System.out.format("Float as scientific notation is %e \n",floatExp);
		System.out.println("Double as default notation is " + doubleExp);
		System.out.format("Float as scientific notation is %e \n",doubleExp);
	}
	/**
	 * Character and String Literals.
	 */
	public static void characterAndStringLiterals(){
		
		System.out.println("------------------CHARACTER AND STRING LITERALS------------------------");
		char charVal = '\u0108';
		String stringVal = "S\u00ED Se\u00F1or";
		
		System.out.println("charVal is: " + charVal);
		System.out.println("stringVal is: " + stringVal);
	}
	
	/**
	 * Special escape sequences overview.
	 */
	public static void specualEscapeSequences(){
		
		System.out.println("--------------SPECIAL ESCAPE SEQUENCES FRO CHAR AND STRING-----------------");
		
		System.out.println("BackSpace: ABCDEF\b");
		
		System.out.println("With tabulators: \n\t\t Some text with tabs." );
		
		System.out.println("New line: \n");
		
		System.out.println("Form feed: Some\f text");
		
		System.out.println("Carriage return: Some \rtext");
		
		System.out.println("4 double quotes: \"\"\"\"");
		
		System.out.println("4 quotes: \'\'\'\'");
		
		System.out.println("4 Backslashes: \\\\\\\\");
		
	}
	/**
	 * Null and class literals overview.
	 */
	public static void nullAndClassLiterals(){
		System.out.println("--------------NULL AND CLASS LITERALS-------------------");
		String stringVal = null; //Cannot used with primitives types
		System.out.println("stringVal is " + String.class + " type.");
	}
	
	/**
	 * Underscore Characters in Numeric Literals
	 */
	public static void underScoreCharacterInNumericLiteral(){
		//System.out.println("---------------UNDERSCORE CHARACTER IN NUMERIC LITERAL---------------------------");
		long creditCartnumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi = 3.14_15F;
		long hexBytes = 0xFF_CC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
	}
		
}
