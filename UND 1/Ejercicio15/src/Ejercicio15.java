/*
 * Proyecto:		Ejercicio15
 * Clase:			Ejercicio15.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			31/01/2023 
 * Descripción:		Develop a program that enters by keyboard a NIF without the letter and display the letter corresponding to it.
 */

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean  dniValido = false;
		do {
			System.out.print("Introduzca su DNI sin la letra: ");
			int dni = sc.nextInt();
			
			int resto = dni % 23;
			String letra = null;
			
			switch( resto ) {
				case 0:{
					letra = "T";
					dniValido = true;
					break;
				}
				case 1:{
					letra = "R";
					dniValido = true;
					break;
				}
				case 2:{
					letra = "W";
					dniValido = true;
					break;
				}
				case 3:{
					letra = "A";
					dniValido = true;
					break;
				}
				case 4:{
					letra = "G";
					dniValido = true;
					break;
				}
				case 5:{
					letra = "M";
					dniValido = true;
					break;
				}
				case 6:{
					letra = "Y";
					dniValido = true;
					break;
				}
				case 7:{
					letra = "F";
					dniValido = true;
					break;
				}
				case 8:{
					letra = "P";
					dniValido = true;
					break;
				}
				case 9:{
					letra = "D";
					dniValido = true;
					break;
				}
				case 10:{
					letra = "X";
					dniValido = true;
					break;
				}
				case 11:{
					letra = "B";
					dniValido = true;
					break;
				}
				case 12:{
					letra = "N";
					dniValido = true;
					break;
				}
				case 13:{
					letra = "J";
					dniValido = true;
					break;
				}
				case 14:{
					letra = "Z";
					dniValido = true;
					break;
				}
				case 15:{
					letra = "S";
					dniValido = true;
					break;
				}
				case 16:{
					letra = "Q";
					dniValido = true;
					break;
				}
				case 17:{
					letra = "V";
					dniValido = true;
					break;
				}
				case 18:{
					letra = "H";
					dniValido = true;
					break;
				}
				case 19:{
					letra = "L";
					dniValido = true;
					break;
				}
				case 20:{
					letra = "C";
					dniValido = true;
					break;
				}
				case 21:{
					letra = "K";
					dniValido = true;
					break;
				}
				case 22:{
					letra = "E";
					dniValido = true;
					break;
				}
			}
			System.out.println("La letra de su DNI es: " + letra);
		}
		while( !dniValido );
	}
}