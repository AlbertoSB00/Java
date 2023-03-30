/*
 * Proyecto:		Ejercicio12
 * Clase:			Ejercicio12.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			31/01/2023 
 * Descripción:		Develop a program that enters by keyboard the number of chickens and the discount of purchase. Then, it calculates and displays on the screen the cost of all chickens.*/

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int precioPollo = 169;
		
		System.out.print("Introduce el número de pollos a comprar: ");
		int numeroDePollos = sc.nextInt();
		
		System.out.print("Introduce el descuento: ");
		double descuento = sc.nextDouble();
		
		double calculamosDescuento = (descuento / 100) * precioPollo;
		double resultado = numeroDePollos * calculamosDescuento;
		
		System.out.println("El precio total es de " + resultado + " €.");
	}
}