/*
 * Proyecto:		Ejercicio07
 * Clase:			Ejercicio07.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			17/01/2023
 * Descripción:		Develop a program that enters by keyboard your father's/mother's name and them, displays on the sceen the string 'My father's/mother's name is <name>!' Needless to say that <name> is the name entered by keyboard.
 */

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your father's/mother's name: ");
		String fatherMother = sc.nextLine();
		
		System.out.println("My father's/mother's name is " + fatherMother + "!");
	}
}