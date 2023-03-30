/*
 * Proyecto:		EjercicioLibreria06
 * Clase:			EjercicioLibreria06.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			13/01/2023 
 * Descripción:		Develop a program that enters by keyboard a string. For each character it has to show if it is letter (uppercase or lowercase), digit, control character or whitespace.
 */

import java.util.Scanner;

public class EjercicioLibreria06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement: ");
		String statement = sc.nextLine();
		
		for ( int i = 0; i < statement.length(); i++) {
			char index = statement.charAt(i);
			if ( Character.isLetter(index)) {
				if ( Character.isUpperCase(index)) {
					System.out.println("The character " + index + " is letter and upper case.");
				}
				if ( Character.isLowerCase(index)) {
					System.out.println("The character " + index + " is letter and lower case.");
				}
			}
			if ( Character.isDigit(index)) {
				System.out.println("The character " + index + " is digit.");
			}
			if ( Character.isISOControl(index)) {
				System.out.println("The character " + index + " is ISO control.");
			}
			if ( Character.isWhitespace(index)) {
				System.out.println("The character " + index + " is white space.");
			}
		}
	}

}