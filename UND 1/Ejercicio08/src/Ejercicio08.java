/*
 * Proyecto:		Ejercicio08
 * Clase:			Ejercicio08.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			17/01/2023
 * Descripción:		Develop a program that calculates and displays on the screen the following arithmetic operation: ((3+2)/(2*5))^2
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		double suma = 3 + 2;
		double multiplicacion = 2 * 5;
		double resultadoSinPotencia = suma / multiplicacion;
		double resultadoConPotencia = Math.pow(resultadoSinPotencia, 2);
		System.out.println("The result is: " + resultadoConPotencia);
	}
}