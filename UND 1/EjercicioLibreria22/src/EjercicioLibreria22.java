/*
 * Proyecto:		12DateClass
 * Clase:			DateClass.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			18/01/2023 
 * Descripción:		Develop a program that enters by keyboard the name and price of a technological product along with a purchase date. Bearing in mind that it could be payed in 12 months with no interest, it must display on the console all the due dates and parcial
payments.
 */

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class EjercicioLibreria22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the product: ");
		String product = sc.nextLine();
		
		System.out.print("Enter the price: ");
		int price = sc.nextInt();
		
		System.out.println("The partial payments");
		double payPerMonth = (double)price / 12;
		
		Calendar today = Calendar.getInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		for ( int i = 1; i <= 12; i++ ) {
			today.add(Calendar.MONTH, 1);
			System.out.println("Payment number " + i + " Date: " + df.format(today.getTime()) + " Partial Payment: " + payPerMonth);
		}
	}
}