package com.evaluateyourself.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

/**
 * 
 */

/**
 * @author Mateusz Miernik [mateusz.miernik86@gmail.com]
 *
 */
public class App {
	
	public static void main(String args[]){
		String test = "test";
		Date data = new Date();
		UtilsReflections.showAllInfo(test);
		UtilsReflections.showAllInfo(data);
	}
}
