/*
 * Proyecto:		Ejercicio06
 * Clase:			Ejercicio06.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			17/01/2023
 * Descripción:		Develop a program that enters by keyboard the username and then, displays on the screen the string 'Hello <username>!' Needless to say that <username> is the username entered by keyboard.
 */

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your username: ");
		String username = sc.nextLine();
		
		System.out.println("Hello " + username + "!");
	}
}