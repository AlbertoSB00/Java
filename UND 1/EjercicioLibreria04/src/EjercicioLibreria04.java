/*
 * Proyecto:		EjercicioLibreria04
 * Clase:			EjercicioLibreria04.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			11/01/2023
 * Enunciado:		Develop a program that enters by keyboard a string. Then, it displays the string with no whitespaces. 
 */

import java.util.Scanner;

public class EjercicioLibreria04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		
		System.out.print("Enter a string: ");
		String cadena = sc.next();
		
		String cadenaSinEspacios = cadena.replace(" ","");
		System.out.println("The string without whitespaces is: " + cadenaSinEspacios);
	}
}