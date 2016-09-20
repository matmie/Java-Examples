/**
 * 
 */
package com.evaluateyourself.javalocaleoverview;

import java.text.BreakIterator;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

import com.evaluateyourself.utils.LocaleUtils;

/**
 * @author Mateusz Miernik [mateusz.miernik86@gmail.com]
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale defLoc = Locale.getDefault();
		printAllLocales(Locale.getAvailableLocales());
		System.out.println("Domyœlny Locale dla tego komputera: ");
		System.out.println(Locale.getDefault().getDisplayName());
		System.out.println("Zmiana Locale na CANADA");
		Locale.setDefault(Locale.CANADA);
		System.out.println("Sprawdzenie jaki Locale jest teraz ustawiony");
		System.out.println(Locale.getDefault().getDisplayName());
		printAllAboutLocale(Locale.CANADA);
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\n\n");
		printAllAvailableLocalesFromNumberFormatClass();
		LocaleUtils.checkLocaleExistInClass(Locale.getDefault(), NumberFormat.class);
		LocaleUtils.checkLocaleExistInClass(Locale.ENGLISH, NumberFormat.class);
		Locale loc = new Locale("ja","JP");
		System.out.println(loc.toString());
		
		System.out.println("\n\nTesting NumberFormat on diferents locales");
		System.out.println("Default locale");
		Locale.setDefault(defLoc);
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(2342423432424234.434) + " " + nf.getCurrency().getCurrencyCode() + "["+ nf.getCurrency().getDisplayName()+"]");
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(nf.format(2342423432424234.535) + " " + nf.getCurrency().getCurrencyCode() + "["+ nf.getCurrency().getDisplayName()+"]");
		localeDisplayInLocale();
		thaiVariantExample();
		System.out.println(defLoc.getISO3Language());
		
		
	}
	public static void printAllLocales(Locale[] locales){
		for(Locale loc : locales){
			printAllAboutLocale(loc);
		}
	}
	public static void printAllAboutLocale(Locale loc){
		System.out.println(loc.getDisplayLanguage() + " " + loc.getDisplayCountry() + " " + loc.getLanguage()+"_"+loc.getCountry());
	}
	
	public static void printAllAvailableLocalesFromNumberFormatClass(){
		System.out.println("---------------------NumberFormat-----------------------");
		printAllLocales(NumberFormat.getAvailableLocales());
		System.out.println("--------------------------------------------------------");
		System.out.println("\n\n\n");
	}
	public static void printAllAvailableLocalesFromCalendarClass()
	{
		System.out.println("---------------------Calendar---------------------------");
		printAllLocales(Calendar.getAvailableLocales());
		System.out.println("--------------------------------------------------------");
		System.out.println("\n\n\n");
	}
	public static void printAllAvailableLocalesFromDateFormatClass(){
		System.out.println("---------------------DateFormat-------------------------");
		printAllLocales(DateFormat.getAvailableLocales());
		System.out.println("--------------------------------------------------------");
		System.out.println("\n\n\n");
	}
	public static void printAllAvailableLocalesFromBreakIteratorClass(){
		System.out.println("---------------------BreakIterator----------------------");
		printAllLocales(BreakIterator.getAvailableLocales());
		System.out.println("--------------------------------------------------------");
		System.out.println("\n\n\n");
	}
	public static void localeDisplayInLocale(){
		Locale[] locales = {new Locale("en", "US"), new Locale("pl","PL"),new Locale("ja","JP"), new Locale("es","ES"), new Locale("it","IT")};
		for(Locale loc:locales){
			String displayLanguage = loc.getDisplayLanguage(loc);
			System.out.println(loc.toString() +": " + displayLanguage);
		}
	}
	public static void thaiVariantExample()
	{
		Locale[] thaiLocale = {new Locale("th"), new Locale("th", "TH"), new Locale("th","TH","TH")};
		for(Locale loc:thaiLocale){
			NumberFormat nf = NumberFormat.getNumberInstance(loc);
			StringBuffer msgBuff = new StringBuffer();
			msgBuff.append(loc.toString() + ": ");
			msgBuff.append(nf.format(573.34));
			System.out.println(msgBuff.toString());
		}
	}
}
