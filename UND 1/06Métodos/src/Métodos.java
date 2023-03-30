/*
 * Proyecto:		06Métodos
 * Programa:		Métodos.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			16/12/2022
 */

import java.util.Scanner;

public class Métodos {

	public static void main(String[] args) {
		// Enunciado: Develop a program that enters by keyboard numbers and displays if it is prime number. A number is prime number if it does not have divisors lower than its square root, except the 1.
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter a number: ");
			number = sc.nextInt();
			if(isPrime(number)) {
				System.out.println("The number " + number + " is prime.");
			}
			else {
				System.out.println("The number " + number + " is not prime.");
			}
			
			
		} while(number != 0);
	}
	
	static boolean isPrime(int n){
		boolean isNumberPrime = true; // Creamos un interruptor para devolverlo al final.
		float squareRoot = (float)Math.sqrt((double)n); // Iniciamos la variable con la clase Math y sqrt().
		int divisor = (int)squareRoot; // Pasamos la raiz cuadrada a entero.
		
		while(divisor-- > 1 && isNumberPrime) { // Vemos si el entero de raiz cuadrada es mayor que 1.
			if(n % divisor == 0) { // Si n es divisible con resto 0 entre su raiz, es primo.
				isNumberPrime = false;
			}
		}
		
		return isNumberPrime; // Devolvemos true or false.
	}
	
}