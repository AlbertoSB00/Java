/*
 * Proyecto:		12DateClass
 * Clase:			DateClass.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			18/01/2023 
 * Descripción:		Example of use the classes for date and time.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateClass {

	public static void main(String[] args) {
		// Date class
		Date dToday1 = new Date();
		Date dToday2 = new Date (System.currentTimeMillis() + 10000);
		
		System.out.println("1.- Date 1 " + dToday1);
		System.out.println("1.- Date 2 " + dToday2);
		
		// Comparing dates
		if ( dToday1.after(dToday2) ) {
			System.out.println("2.- " + dToday1 + " is after than " + dToday2);
		}
		else {
			System.out.println("2.- " + dToday1 + " is before than " + dToday2);
		}
		
		if ( dToday2.before(dToday1)) {
			System.out.println("2.- " + dToday2 + " is before than " + dToday1);
		}
		else {
			System.out.println("2.- " + dToday2 + " is after than " + dToday1);
		}
		
		if ( dToday1.compareTo(dToday2) < 0 ) {
			System.out.println("2.- " + dToday1 + " is before than " + dToday2);
		}
		else if ( dToday1.compareTo(dToday2) == 0 ){
			System.out.println("2.- Both dates are alike");
		}
		else {
			System.out.println("2.- " + dToday1 + " is after than " + dToday2);
		}
		
		//Getting the date in long value.
		System.out.println("3.- Milliseconds of a date object: " + dToday1.getTime());
		
		// Caldendar class
		Calendar cToday3 = Calendar.getInstance();
		int day = cToday3.get(Calendar.DAY_OF_MONTH);
		int month = cToday3.get(Calendar.MONTH);
		int year = cToday3.get(Calendar.YEAR);
		System.out.println("4.- " + cToday3);
		System.out.println("4.- " + day + "/" + month + "/" + year);
		
		//We can change the individual fields in the Calendar object
		cToday3.set(Calendar.MONTH, Calendar.JULY);
		cToday3.set(Calendar.DAY_OF_MONTH, 23);
		cToday3.set(Calendar.YEAR, 2024);
		day = cToday3.get(Calendar.DAY_OF_MONTH);
		month = cToday3.get(Calendar.MONTH);
		year = cToday3.get(Calendar.YEAR);
		System.out.println("5.- " + cToday3);
		System.out.println("5.- " + day + "/" + month + "/" + year);
		
		switch ( cToday3.get(Calendar.DAY_OF_WEEK) ) {
			case Calendar.MONDAY:{
				System.out.println("6.- " + "It's monday.");
				break;
			}
			case Calendar.TUESDAY:{
				System.out.println("6.- " + "It's tuesday.");
				break;
			}
			case Calendar.WEDNESDAY:{
				System.out.println("6.- " + "It's wednesday.");
				break;
			}
			case Calendar.THURSDAY:{
				System.out.println("6.- " + "It's thursday.");
				break;
			}
			case Calendar.FRIDAY:{
				System.out.println("6.- " + "It's friday.");
				break;
			}
			case Calendar.SATURDAY:{
				System.out.println("6.- " + "It's saturday.");
				break;
			}
			case Calendar.SUNDAY:{
				System.out.println("6.- " + "It's sunday.");
				break;
			}
		}
		
		//Getting a Date object with getTime() method.
		dToday1 = cToday3.getTime();
		System.out.println("7.- " + dToday1);
		
		//Setting a the time with a Date object.
		cToday3.setTime(dToday2);
		day = cToday3.get(Calendar.DAY_OF_MONTH);
		month = cToday3.get(Calendar.MONTH);
		year = cToday3.get(Calendar.YEAR);
		System.out.println("5.- " + cToday3);
		System.out.println("5.- " + day + "/" + month + "/" + year);
		
		//Gregorian calendar class.
		GregorianCalendar gcBirthDay = new GregorianCalendar(1990, Calendar.JANUARY, 19);
		GregorianCalendar gcToday = new GregorianCalendar();
		
		int yearToday = gcToday.get(Calendar.YEAR);
		int monthToday = gcToday.get(Calendar.MONTH);
		int dayToday = gcToday.get(Calendar.DAY_OF_MONTH);
		
		int yearBD = gcBirthDay.get(Calendar.YEAR);
		int monthBD = gcBirthDay.get(Calendar.MONTH);
		int dayBD = gcBirthDay.get(Calendar.DAY_OF_MONTH);
		
		int age = yearToday - yearBD;
		if ( monthToday < monthBD || monthToday == monthBD && dayToday < dayBD) {
			age--;
		}
		System.out.println("8.- My age is " + age);
		
		if ( gcBirthDay.isLeapYear(yearBD) ) {
			System.out.println("9.- Your birth year is leap");
		}
		
		//Adding
		gcToday.add(Calendar.YEAR, 3);
		gcToday.add(Calendar.MONTH, -2);
		yearToday = gcToday.get(Calendar.YEAR);
		monthToday = gcToday.get(Calendar.MONTH);
		dayToday = gcToday.get(Calendar.DAY_OF_MONTH);
		System.out.println("10.- " + dayToday + "/" + monthToday + "/" + yearToday);
		
		//Format Date and Time
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("11.- " + df.format(gcBirthDay.getTime()));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("11.- " + df.format(gcBirthDay.getTime()));
		
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("11.- " + df.format(gcBirthDay.getTime()));
		
		df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("11.- " + df.format(gcBirthDay.getTime()));
		
		gcToday = new GregorianCalendar();
		df = DateFormat.getTimeInstance(DateFormat.SHORT);
		System.out.println("12.- " + df.format(gcToday.getTime()));
		
		df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		System.out.println("12.- " + df.format(gcToday.getTime()));
		
		df = DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println("12.- " + df.format(gcToday.getTime()));
		
		df = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println("12.- " + df.format(gcToday.getTime()));
		
		//Convert a String to Date.
		Scanner sc = new Scanner (System.in);
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.print("13.- Enter your birthday: ");
		String strBirthDay = sc.nextLine();
		Date myBirthDay = null;
		
		try {
			myBirthDay = df.parse(strBirthDay);
			System.out.println("13.- Your birthday is " + df.format(myBirthDay));
		}
		catch( ParseException pe ) {
			System.out.println("13.- The string " + strBirthDay + " don't have a valid Date format.");
			System.out.println(pe.getMessage());
		}
		
		//Simple day format.
		String strDateFormat = "dd-MMM-yyyy h:mm";
		gcBirthDay = new GregorianCalendar();
		gcBirthDay.setTime(myBirthDay);
		gcBirthDay.set(Calendar.HOUR_OF_DAY, 21);
		gcBirthDay.set(Calendar.MINUTE, 35);
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("14.- My birthday is " + sdf.format(gcBirthDay.getTime()));
		
		System.out.print("15.- Enter the date and time: ");
		String strDateTime = sc.nextLine();
		Date newDateTime = null;
		try {
			newDateTime = sdf.parse(strDateTime);
			System.out.println("15.- " + sdf.format(newDateTime));
		}
		catch ( ParseException pe ) {
			System.out.println(pe.getMessage());
		}
	}
}