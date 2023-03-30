/*
 * Proyecto:		05Bucles
 * Programa:		Bucles.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			15/12/2022
 * 
 * In Java there are three loops statements.
 * 1.- For loop -> A set of statements are executed a predefined number of
 *        times controlled by a counter variable
 * 2.- While loop -> A set of statements are executed while a condition is
 *        true. The condition is checked before executing the iteration
 * 3.- Do.. While loop -> Similar to while loop but the condition is checked
 *        after executing the iteration
 */

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		/*
		 * For loop
		 * Syntax:
		 * for(<initial expression>; <condition>; <increment/decrement expression>;)
		 * 		statement
		 */
		System.out.println("1.- First way of for loop.");
		for(int i = 1; i <= 10; i++) {
			System.out.println("Number of iteration: " + i);
		}
		
		// The counter variable has been declared in the for loop. Thereforce, it's local in the code block of the loop. It doesn't exits outside the loop.
		System.out.println("2.- With decrement the counter variable.");
		for(int i = 10; i >= 1; i--) {
			System.out.println("Number of iteration: " + i);
		}
		
		// All parts in for loop syntax are optional. So, we can miss some of them.
		Scanner sc = new Scanner(System.in);
		String myString = "Hello";
		for(; myString.equals("Hello");) {
			System.out.print("3.- Enter a string: ");
			myString = sc.next();
		}
		System.out.println("End of the loop");
		
		// For loop with no parts.
		for(;;) {
			System.out.print("4.- Enter a numer (0 to finish): ");
			int number = sc.nextInt();
			System.out.println("The number entered is: " + number);
			if(number == 0) break;
		}
		System.out.println("We are outside the loop");
		
		// For loop with two expressions.
		for(int i = 0, j = 50; i < j && j > 20; i++, j-=3) {
			System.out.println("The i variable is " + i + " and j " + j);
		}
		
		// For loop to go throw arrays.
		for(String argument : args) {
			System.out.println("The argument is " + argument);
		}
		
		/*
		 * While loop
		 * Syntax
		 * while(<condition>)
		 * 		statement
		 * 
		 * Develop a program to enter by keyboard an usernma eand a password, if the matches with usuario and abcd1234@ the user has acess. At maximun, three attemps.
		 */
		String validPassword = "abcd1234@";
		String validUsername = "usuario";
		String password = "";
		String username = "";
		int maxAttempts = 3;
		int currentAttempt = 0;
		while(currentAttempt < maxAttempts && !(validUsername.equals(username) && validPassword.equals(password))) {
			System.out.print("Enter the username: ");
			username = sc.next();
			System.out.print("Enter the password: ");
			password = sc.next();
			
			
			
			if(!validUsername.equals(username) || !validPassword.equals(password)) {
				System.out.println("Credentials not valid...");
				currentAttempt++;
				
				if(currentAttempt == maxAttempts) {
					System.out.println("You have run out the number of attempts.");
				}
				else {
					System.out.println("You have " + (maxAttempts - currentAttempt) + " attempts left.");
				}
			}
		}
		// Out of the loop
		if(maxAttempts == currentAttempt) {
			System.out.println("Authentication failed -> You have no access.");
		}
		else {
			System.out.println("Access granted.");
		}
		
		/*
		 * do .. while loop
		 * Syntax
		 * do
		 * 		statement
		 * while(<condition>);
		 */
		int option;
		
		do {
			System.out.println("|-------------------------------|");
			System.out.println("|           User Menu           |");
			System.out.println("|-------------------------------|");
			System.out.println("| 1.- Create a new user.        |");
			System.out.println("| 2.- Update an user.           |");
			System.out.println("| 3.- Convert an user as admin. |");
			System.out.println("| 4.- Delete an user.           |");
			System.out.println("| 5.- Exit.                     |");
			System.out.println("|-------------------------------|");
			
			System.out.print("Enter the option: ");
			option = sc.nextInt();
			
			switch(option) {
				case 1:{
					System.out.println("Creating a new user...");
					break;
				}
				case 2:{
					System.out.println("Updating an user...");
					break;
				}
				case 3:{
					System.out.println("Converting an user as admin...");
					break;
				}
				case 4:{
					System.out.println("Deleting an user...");
				}
				case 5:{
					System.out.println("Exiting program...");
					break;
				}
				default:{
					System.out.println("Option doesn't exist...");
					break;
				}
			}
		}while(option != 5);
		
		/*
		 * Breaking the control flow in a program.
		 * Statements break & continue.
		 * The break statement inside a while, do..while, for or switch causes the straight away exit from that statement.
		 * The continue statement inside a while, do..while ir for causes the stop of the current iteration without executing the belove statements, forcing the execution of the next iteration previous the checking of the condition of the loop.
		 */
		// Enter by keyboard integer numbers and display if they are even, except if they are negative, until the number to be 0.
	    while (true) {
	    	// Preguntamos el número.
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Si el número es 0 sale del bucle.
	        if (num == 0) {
	          break;
	        }

	        // Si el número es negativo vuelve a preguntar.
	        if (num < 0) {
	          continue;
	        }

	        // Si el número es positivo y par, muestra este mensaje.
	        if (num % 2 == 0) {
	          System.out.println(num + " is even");
	        }
	      }
	    System.out.println("Fin del programa.");
	}
}