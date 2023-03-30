/*
 * Proyecto:		Ejercicio10
 * Clase:			Ejercicio10.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			31/01/2023 
 * Descripción:		Develop a program that enters by keyboard the number of worked hours and the salary per hour. Then, it calculates and displays on the screen the salary.*/

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce las horas trabajadas: ");
		double horasTrabajadas = sc.nextDouble();
		
		System.out.print("Introduce el salario por hora trabajada: ");
		double salarioPorHora = sc.nextDouble();
		
		double salario = horasTrabajadas * salarioPorHora;
		
		System.out.println("Tu salario es de " + salario + " €.");
	}
}