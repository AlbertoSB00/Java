/*
 * Proyecto:		Ejercicio11
 * Clase:			Ejercicio11.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			31/01/2023 
 * Descripción:		Develop a program that enters by keyboard a positive integer number and then displays the addition of integer numbers from 1 to the entered number. This addition can be calculated with the following expression: ((n*(n+1))/2)*/

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número positivo: ");
		int n = sc.nextInt();
		
		if( n < 0 ) {
			System.out.println("El número es negativo...");
			System.exit(1);
		}
		
		double suma = n + 1;
		double multiplicacion = n * suma;
		double resultado = multiplicacion / 2;
		
		System.out.println("El resultado es: " + resultado);
	}
}