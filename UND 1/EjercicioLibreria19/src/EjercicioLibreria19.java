/*
 * Proyecto:		EjercicioLibreria19
 * Clase:			EjercicioLibreria19.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			20/01/2023 
 * Descripción:		Develop a program that enters by keyboard a date and then it displays on the console in the form Day of week, day of month of year.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class EjercicioLibreria19 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("15.- Enter the datetime: ");
		String strDateTime = sc.nextLine();
		
		GregorianCalendar gcDate = new GregorianCalendar();
		DateFormat sdf = DateFormat.getDateInstance(DateFormat.SHORT);
		
		int year = gcDate.get(Calendar.YEAR);
		int month = gcDate.get(Calendar.MONTH);
		int day = gcDate.get(Calendar.DAY_OF_MONTH);
		
		sdf = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("11.- " + sdf.format(gcDate.getTime()));*/
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date enteredDate = null;
		boolean goodDate = false;
		while ( !goodDate ) {
			System.out.print("Enters a date: ");
			String date = sc.nextLine();
			
			try {
				enteredDate = sdf.parse(date);
				goodDate = true;
			}
			catch( ParseException pe ) {
				System.out.println(pe.getMessage());
			}
		}
		
		SimpleDateFormat sdfShow = new SimpleDateFormat("EEEE', 'd 'de' MMMM 'de' yyyy");
		System.out.println(sdfShow.format(enteredDate));
		
	}
}