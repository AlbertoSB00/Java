/*
 * Proyecto:		EjercicioLibreria23
 * Clase:			EjercicioLibreria23.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			25/01/2023 
 * Descripción:		Develop a program that enters by keyboard two dates. The second one must be later the first one. Then, it displays the period of time between both dates in number of years, months and days.
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EjercicioLibreria23 {

	public static void main(String[] args) {
		LocalDate date1, date2;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
		
		Scanner sc = new Scanner(System.in);
		date1 = null;
		date2 = null;
		boolean goodDates = false;
		do {
			System.out.print("Enter the first date: ");
			String strDate1 = sc.nextLine();
			System.out.print("Enter the second date: ");
			String strDate2 = sc.nextLine();
			
			try {
				date1 = LocalDate.parse(strDate1, dtf);
				date2 = LocalDate.parse(strDate2, dtf);
				goodDates = true;
			}
			catch( DateTimeParseException dtpe ) {
				System.out.println(dtpe.getMessage());
				goodDates = false;
			}
			
			if( goodDates && date2.isBefore(date1) ) {
				System.out.println("The first date is later than the second.");
				LocalDate temporalDate = date1;
				date1 = date2;
				date2 = temporalDate;
			}
		}
		while(!goodDates);
		
		Period period = date1.until(date2);
		System.out.println("Years: " + period.getYears() + "\n" + 
						   "Months: " + period.getMonths() + "\n" + 
						   "Days: " + period.getDays());
	}
}