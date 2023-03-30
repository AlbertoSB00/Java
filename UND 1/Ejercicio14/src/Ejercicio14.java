/*
 * Proyecto:		Ejercicio14
 * Clase:			Ejercicio14.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			31/01/2023 
 * Descripción:		Develop a program that calculates and displays how much bytes are in a SSD of 64GB.*/
public class Ejercicio14 {

	public static void main(String[] args) {
		double GB = 64;
		double resultado = GB * 1024 * 1024 * 1024;
		
		System.out.println("El resultado de " + GB + " GB en bytes es de " + resultado);
	}
}