/*
 * Proyecto:		EjercicioLibreria03
 * Clase:			EjercicioLibreria03.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			09/01/2023
 * Enunciado:		Develop a program that enters by keyboard a string. Then, it displays the string in reverse order.
 */

import java.util.Scanner;

public class EjercicioLibreria03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		
		System.out.print("Enter a string: ");
		String cadena = sc.next();
		
		System.out.print("The statement in reverse is: ");
		for(int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
	}
}