/*
 * Proyecto:		EjercicioLibreria05
 * Clase:			EjercicioLibreria05.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			09/01/2023
 * Enunciado:		Develop a program that enters by keyboard a string. Then, it displays the number of vowels and consonants in the string.
 */

import java.util.Scanner;

public class EjercicioLibreria05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		
		System.out.print("Enter a string: ");
		String statement = sc.next();
		
		int countVowels = 0;
		int countConsonants = 0;
		
		String vowels = "aeiouAEIOUáéíóúÁÉÍÓÚ";
		String consonants = "bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ";
		
		for(int i = 0; i < statement.length(); i++) {
			char index = statement.charAt(i);
			if (vowels.indexOf(index) > -1){ countVowels++; }
			if (consonants.indexOf(index) > -1){ countConsonants++; }
		}	
		System.out.println("The string is: " + statement);
		System.out.println("There are " + countVowels + " vowels in the string");
		System.out.println("There are " + countConsonants + " consonants in the string");
	}
}