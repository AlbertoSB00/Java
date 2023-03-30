/*
 * Proyecto:		EjercicioLibreria16
 * Clase:			EjercicioLibreria16.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			16/01/2023 
 * Descripción:		Let’s make another game similar to the previous one. Develop a program to find out a word.
						• First, we enters by keyboard 5 words. Then, the program chooses automatically one of these words. The game starts...
						• The program shows one of the word but with all letters in a ramdon order.
						• The player enter by keyboard the word they believe it is. There is only three oportunities to do it.
						• The program shows if the player is right or wrong.

 */

import java.util.Scanner;

public class EjercicioLibreria16 {

	public static void main(String[] args) {
		
		// Constantes.
		final int ATTEMPTS = 3;
		
		// Enter 5 words.
		Scanner sc = new Scanner (System.in);
		System.out.print("1st word: ");
		String word1 = sc.next();
		
		System.out.print("2nd word: ");
		String word2 = sc.next();
		
		System.out.print("3rd word: ");
		String word3 = sc.next();
		
		System.out.print("4th word: ");
		String word4 = sc.next();
		
		System.out.print("5th word: ");
		String word5 = sc.next();
		
		System.out.println("There is a list with the word: " + word1 + ", " + word2 + ", " + word3 + ", " + word4 + ", " + word5 + ".");
		
		// Random number.
		int randomNumber = (int) (Math.random() * 5);
		String selectedWord = "";
		
		// Match the number to a word.
		switch( randomNumber ) {
			case 0:{
				selectedWord = word1;
				break;
			}
			case 1:{
				selectedWord = word2;
				break;
			}
			case 2:{
				selectedWord = word3;
				break;
			}
			case 3:{
				selectedWord = word4;
				break;
			}
			case 4:{
				selectedWord = word1;
				break;
			}
			default:{
				System.out.println("Somethins is wrong...");
				break;
			}
		}
		
		// The game starts.
		String numberGenerated = "";
		String disorderWord = "";
		boolean wordComplete = false;
		
		while(!wordComplete) {
			int position = (int) (Math.random() * selectedWord.length());
			position = position % selectedWord.length();
			
			if ( numberGenerated.indexOf( Integer.toString(position) ) == -1 ) {
				
				numberGenerated = numberGenerated + "-" + position;
				
				disorderWord = disorderWord + selectedWord.charAt(position);
				
				wordComplete = selectedWord.length() == disorderWord.length();
			}
		}
		System.out.println("The disorder word is: " + disorderWord);
		
		// Compare.
		int attempt = 1;
		boolean right = false;
		while ( !right && attempt <= ATTEMPTS ) {
			System.out.println("Enter the word: ");
			String userWord = sc.next();
			
			if ( userWord.equalsIgnoreCase(selectedWord) ) {
				right = true;
			}
			else {
				System.out.println("Sorry, the word is not correct...");
				attempt++;
			}
		}
		
		if ( right ) {
			System.out.println("Congratulations!! You have won!");
		}
		else {
			System.out.println("You have failed :(");
		}
	}
}