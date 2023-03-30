/*
 * Enunciado: Develop a program that requests the user an amount to invest, the interest per year and the number of years. Then, it shows on the screen the capital got with the invest every year that lasts the investment.
 */

import java.util.Scanner;

public class Ejercicio64 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to invest (€): ");
		int invest = sc.nextInt();
		System.out.print("Now, enter the interest per year (%): ");
		float interestPerYear = sc.nextFloat();
		System.out.print("To finish, enter the number of years: ");
		int numbersOfYears = sc.nextInt();
		float capitalCounter = 0;
		
		for(int i = 1; i <= numbersOfYears; i++) {
			
			float capital = (invest * interestPerYear) / 100;
			capitalCounter += capital;
			System.out.println("The invest of the " + i + " year is " + capitalCounter);
			
		}
	}
}