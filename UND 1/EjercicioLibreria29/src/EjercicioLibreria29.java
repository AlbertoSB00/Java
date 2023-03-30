/*
 * Proyecto:		EjercicioLibreria29
 * Clase:			EjercicioLibreria29.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			26/01/2023 
 * Descripción:		Develop a program that enters by keyboard an ID card number and then, it displays if it is right or not.
 */

import java.util.Scanner;

public class EjercicioLibreria29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idCard = null;
		boolean validIdCard = false;
		do {
			System.out.print("Enter your ID card: ");
			idCard = sc.nextInt();
			
			int letter = idCard % 23;
		}
		while ( !validIdCard );
		System.out.println();
	}
}