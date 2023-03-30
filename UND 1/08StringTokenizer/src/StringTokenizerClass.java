/*
 * Proyecto:		08StringTokenizer
 * Clase:			StringTokenizerClass.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			09/01/2023
 * Descripción:		The StringTokenizer class split a string in several ones according to a separator character, by default is whitespace.
 */

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		String input = "This is a string with many spaces.";
		
		StringTokenizer st = new StringTokenizer(input);
		System.out.println("There are " + st.countTokens() + " elements.");
		
		while(st.hasMoreTokens()) {
			System.out.println("The next token is: " + st.nextToken());
		}
		
		input = "Title:Java, The complete reference;" + 
				"Author:Herbert Schild;" + 
				"Publisher:Oracle Press;" + 
				"Edition year:2015";
		st = new StringTokenizer(input, ";:");
		System.out.println("There are " + st.countTokens() + " elements.");
		while(st.hasMoreTokens()) {
			String key = st.nextToken();
			String value = st.nextToken();
			
			System.out.println("Key: " + key + ". Value: " + value + ".");
		}
	}
}