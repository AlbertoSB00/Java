/*
 * Proyecto:		EjercicioLibreria10
 * Clase:			EjercicioLibreria10.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			11/01/2023
 * Enunciado:		Develop a program that enters by keyboard a statement and a word. Then it have to replace each occurrency of the word in the statement with the same word with the reverse capitalization (from uppercase to lowercase and the opposite).
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class EjercicioLibreria10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		
		System.out.print("Enter a string: ");
		String statement = sc.next();
		
		System.out.print("Enter a word: ");
		String word = sc.next();
		
		StringTokenizer st = new StringTokenizer(statement);
		
		String newStatement = "";
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			if(token.equalsIgnoreCase(word)) {
				if(token.equals(word.toUpperCase())) {
					newStatement = newStatement + word.toLowerCase() + " ";
				}
				if(token.equals(word.toLowerCase())) {
					newStatement = newStatement + word.toUpperCase() + " ";
				}
			}
			else {
				newStatement = newStatement + token + " ";
			}
		}
		System.out.println(newStatement);
	}
}