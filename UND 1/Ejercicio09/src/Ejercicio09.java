/*
 * Proyecto:		Ejercicio09
 * Clase:			Ejercicio09.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			31/01/2023 
 * Descripción:		Develop a program that declares the variables a, b and c with values 3.5, 6 and 4.25 respectively. Then calculates and displays on the screen the following arithmetic operation: ((a+2)/(2*b))*((c-4)/(a/c)^2) */
public class Ejercicio09 {
	
	public static void main(String[] args) {
		double a = 3.5;
		int b = 6;
		double c = 4.25;
		
		double suma = 3.5 + 2;
		int multiplicacion = 2 * 6;
		double resta = 4.25 - 4;
		double division = 3.5 / 4.25;
		double potencia = Math.pow(resta/division, 2);
		double resultado = (suma / multiplicacion) * potencia;
		
		System.out.println("El resultado es: " + resultado);
	}
}