/*
 * Proyecto:		EjercicioLibreria14
 * Clase:			EjercicioLibreria14.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			13/01/2023 
 * Descripción:		Develop a program that enters by keyboard a password and shows if the password is enough strong or not. We consider strong 
 					password if it meet the following requisites:
						• Its length is higher than 8 characteres.
						• It has, at least, one character of each following types: uppercase, lowercase and digit.
						• It has no consecutive characters (no matter its capitalization) or digits.

 */

import java.util.Scanner;

public class EjercicioLibreria14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = sc.nextLine();
		
		if ( password.length() < 8 ) {
			System.out.println("The password has " + password.length() + " characters. It needs atleats 8 characters.");
		}
		
		boolean thereIsDigits = false;
		boolean thereIsUppercase = false;
		boolean thereIsLowercase = false;
		int i = 0;
		
		do {
			char character = password.charAt(i);
			
			if ( Character.isLetter( character ) ) {
				if ( Character.isUpperCase( character ) ) {
					thereIsUppercase = true;
				}
				else {
					thereIsLowercase = true;
				}
			}
			if ( Character.isDigit( character ) ) {
				thereIsDigits = true;
			}
		} while ( !thereIsDigits || !thereIsUppercase || !thereIsLowercase  && i < password.length());
		
		if ( !thereIsDigits ) {
			System.out.println("The password has no numerical digits.");
		}
		if ( !thereIsUppercase ) {
			System.out.println("The password has no Uppercase.");
		}
		if ( !thereIsLowercase ) {
			System.out.println("The password has no Lowercase.");
		}
	}
}