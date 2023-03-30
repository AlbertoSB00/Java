/*
 * Enunciado: Develop a program that enters by keyboard 10 numbers and, for each of them, display one of the following messages depending of its value:
	• Ice, if the number is equal or lower to 0
	• Water, if the number is higher than 0 and lower than 100.
	• Vapor, if the number is higher than 100

 */

import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 10; i++) {
			System.out.print("Enter a number: ");
			float number = sc.nextFloat();
			
			if(number <= 0) System.out.println("Ice");
			else if(number > 0 && number < 100) System.out.println("Water");
			else System.out.println("Vapor");
			
		}
	}
}