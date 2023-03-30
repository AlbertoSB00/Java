/*
 * Proyecto:		13TimeClass
 * Clase:			JavaTimeApi.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			19/01/2023 
 * Descripción:		Date and time data with classes in java.time
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;

public class JavaTimeApi {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println("1.- The date is " + ld);
		System.out.println("1.- The time is " + lt);
		System.out.println("1.- The date and time is " + ldt);
		
		ld = LocalDate.of(2022, Calendar.SEPTEMBER, 23);
		lt = LocalTime.of(23, 15);
		ldt = LocalDateTime.of(ld, lt);
		
		System.out.println("2.- The date is " + ld);
		System.out.println("2.- The time is " + lt);
		System.out.println("2.- The date and time is " + ldt);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		
		System.out.println("3.- " + ld.format(dtf1));
		System.out.println("3.- " + lt.format(dtf2));
		System.out.println("3.- " + ldt.format(dtf3));
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("4.- " + ldt.format(dtf4));
		
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String christmasEveDate = "24/12/2023";
		String christmasEveTime = "22;15";
		String newYearEve = "31/12/2022 23:55";
		
		LocalDate ldChristmasEveDate = LocalDate.parse(christmasEveDate, dtf5);
		LocalTime ltChristmasEveTime = LocalTime.parse(christmasEveTime, dtf4);
		LocalDateTime ldtNewYearEve = LocalDateTime.parse(newYearEve, dtf6);
		
		System.out.println("5.- " + ldChristmasEveDate.format(dtf5));
		System.out.println("5.- " + ltChristmasEveTime.format(dtf6));
		System.out.println("5.- " + ldtNewYearEve.format(dtf4));
	}
}