/*
 * Proyecto:		Ejercicio13
 * Clase:			Ejercicio13.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			31/01/2023 
 * Descripción:		Develop a program that input a number with your weight in Kg and then it calculates the equivalent weight in ounces. An ounce is 28,3495 grams.*/

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu peso en Kg: ");
		double peso = sc.nextDouble();
		
		double pesoEnGramos = peso * 1000;
		double onzas = pesoEnGramos / 28.3495;
		
		System.out.println("Tu peso en onzas es: " + onzas);
	}
}