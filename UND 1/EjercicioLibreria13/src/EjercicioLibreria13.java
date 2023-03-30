/*
 * Proyecto:		EjercicioLibreria13
 * Clase:			EjercicioLibreria13.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			12/01/2023 
 * Descripción:		Develop a program to build a password from a word. First, the word entered by keyboard must be longer than 8 characters. Then, replace each character the word has by following the next scheme:
*--------------------------------------|
*|Character original |o|l|z/Z|B|a|s|b|q|
*|-------------------------------------|
*|New character      |0|1| 2 |3|4|5|6|9|
*--------------------------------------|
 */

import java.util.Scanner;

public class EjercicioLibreria13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while ( true ) {
			
			System.out.print("Enter a word: ");
			String word = sc.nextLine();
			
			if ( word.length() < 8 ) {
				System.out.println("The word should be higher or equal than 8 characters. Try it again...");
				continue;
			}
			else {
				String newWord = "";
				for ( int i = 0; i < word.length(); i++) {
					char index = word.charAt(i);
					if ( index == 'o') {
						word = word.replace("o", "0");
					}
					else if ( index == 'l') {
						word = word.replace("l", "1");
					}
					else if ( index == 'z' || index == 'Z') {
						word = word.replace("z", "2");
						word = word.replace("Z", "2");
					}
					else if ( index == 'B') {
						word = word.replace("B", "3");
					}
					else if ( index == 'a') {
						word = word.replace("a", "4");
					}
					else if ( index == 's') {
						word = word.replace("s", "5");
					}
					else if ( index == 'b') {
						word = word.replace("b", "6");
					}
					else if ( index == 'q') {
						word = word.replace("q", "9");
					}
				}
				System.out.println("Your new word is " + word);
				/*
				 * Other way to face the problem.
				 * 
				 * String oldCharacter = "olzZBasbq";
				 * String newCharacter = "012234569";
				 * 
				 * for (int i = 0; i < oldCharacter; i++){
				 * 		if (word.indexOf(oldCharacter.charAr(i) > -1)){
				 * 			word = word.replace(oldCharacter.charAt(i),newCharacter.charAt(i));	
				 * 		}
				 * }
				 * System.out.println("Your new word is " + word)
				 */
			}
		}
	}

}
