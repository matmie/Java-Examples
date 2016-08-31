/**
 * 
 */
package com.evaluateyourself.utils;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Mateusz Miernik [mateusz.miernik86@gmail.com]
 *
 */
public class UtilsReflections {
	
	public static void showAllInfo(Object obj){
		String interfaces = "";
		String supclass = "";
		AnnotatedType[] intface = obj.getClass().getAnnotatedInterfaces();
		AnnotatedType supcla = obj.getClass().getAnnotatedSuperclass();
		
		interfaces = intface.length > 0 ? " implements " : "";
		supclass = supcla.getType() != null ? " extends " + supcla.getType().toString() : "";
		
		if(!interfaces.equals("")){
			for(AnnotatedType iface:intface){
				interfaces = interfaces + iface.getType().toString() + ", ";
			}
			interfaces = interfaces.substring(0, interfaces.length()-2);
		}
		System.out.println("----------------"+ Modifier.toString(obj.getClass().getModifiers()) + " " 
	                                          + obj.getClass().getSimpleName().toUpperCase() + " " 
	                                          + supclass + interfaces +
																	"--------------------------");
		showAllMethod(obj);
		showAllProperties(obj);
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	public static void showAllMethod(Object obj){
		Method[] methods = obj.getClass().getDeclaredMethods();
		System.out.println("-          -----------METHODS-------------");
		for(Method met:methods)
		{
			System.out.print(Modifier.toString(met.getModifiers()) + " " + met.getName()+"(" + showAllMethodParameters(met) + ") : " + showMethodResult(met));
			System.out.print("\n");
		}
	}
	
	public static void showAllProperties(Object obj){
		Field[] fields = obj.getClass().getFields();
		System.out.println("-         -----------FIELDS--------------");
		for(Field fld:fields)
		{
			System.out.println(Modifier.toString(fld.getModifiers()) + " " + fld.getType().getName() +" " + fld.getName());
		}
	}
	
	public static String showAllMethodParameters(Method meth)
	{
		String ret = "";
		Method methEquals = null;
		try {
			methEquals = ret.getClass().getMethod("equals", new Class[]{Object.class});
		} catch (NoSuchMethodException e2) {
			e2.printStackTrace();
		} catch (SecurityException e2) {
			e2.printStackTrace();
		}
		Method methSubString = null;
		try {
			methSubString = ret.getClass().getMethod("substring", new Class[]{int.class, int.class});
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		}
		Method methLength = null;
		try {
			methLength = ret.getClass().getMethod("length", new Class[]{});
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		}
		Class<?>[] params = meth.getParameterTypes();
		
		for(Class<?> par:params){
			ret = ret + " " + par.getName() + ", ";
		}
		try {
			if((boolean) methEquals.invoke(ret, "")){
				ret = "void";
			}
			else
			{
				ret = (String) methSubString.invoke(ret, 0, ((int)methLength.invoke(ret))-2);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return ret;
	}
	public static String showMethodResult(Method meth){
		String ret = "";
		Method equalsMeth = null;
		try {
		    equalsMeth = ret.getClass().getMethod("equals", new Class[]{Object.class});
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		Class<?> returns = meth.getReturnType();
		ret = returns.getName();
		try {
			if((boolean) equalsMeth.invoke(ret, "")){
				ret = "void";
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return ret;
	}
}
