/*
 * Proyecto:		EjercicioLibreria03
 * Clase:			EjercicioLibreria03.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			09/01/2023
 * Enunciado:		 Repeat the previous exercise without considering the whitespaces. That is, display the length of the string taking the whitespaces out from the string.
 */

import java.util.Scanner;

public class EjercicioLibreria02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.print("Enter a string: ");
		String statement = sc.next();
		
		int length = statement.length();
		
		// First way
		for(int i = 0; i < statement.length(); i++) {
			if(statement.charAt(i) == ' ') { length-- ;}
		}
		
		System.out.println("The string lenth without considering whitespaces is: " + length);
		
		// Second way
		length = statement.replace(" ","").length();
		System.out.println("The string lenth without considering whitespaces is: " + length);
		
		// Third way
		length = statement.length();
		int fromWhere = 0;
		while (statement.indexOf(" ", fromWhere) != -1) {
			length--;
			fromWhere = statement.indexOf(" ", fromWhere) + 1;
		}
		System.out.println("The string lenth without considering whitespaces is: " + length);
	}

}
