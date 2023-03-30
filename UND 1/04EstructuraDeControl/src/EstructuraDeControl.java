/*
 * Proyecto:		04EstructuraDeControl
 * Programa:		EstructuraDeControl.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			12/12/2022
 * 
 * The control structure in Java:
 * 	- Single selection: if statement.
 * 	- Compund selection: if .. else statement.
 * 	- Multi selection: switch statement.
 * 	- Multi selection: if .. else if .. ladder.
 * 	- Operator: 7
 * 
*/

import java.util.Scanner;
import java.util.Locale;

public class EstructuraDeControl {

	public static void main(String[] args) {
		// We create a Scanner object.
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("1.- Enter your mark: ");
		float mark1 = sc.nextFloat();
		System.out.println("1.- Your mark is " + mark1);
		
		/*
		 * if statement
		 * if(<booleanExpression>)
		 * 		<statement>;
		 * if <booleanExpression> is true, the <statement> is executed.
		 * <statement> can be a single statement or a code block.
		 */
		
		if(mark1 >= 5) System.out.println("2.- You have passed!!");
		
		if(mark1 >= 5) {
			System.out.println("3.- You have passed!!");
		}
		
		if(mark1 >= 5) {
			System.out.println("4.- Your mark is " + mark1);
			System.out.println("4.- You have passed!");
		}
		
		// Anothe example of is statement
		System.out.print("5.- Enter your age: ");
		short age = sc.nextShort();
		if(age >=18) {
			System.out.println("5.- Your age is " + age);
			System.out.println("5.- You are an adult!!");
		}
		
		//The else clause.
		System.out.print("6.- Enter the 2nd mark: ");
		float mark2 = sc.nextFloat();
		if(mark2 > mark1) {
			System.out.println("6.- You are improving!!");
		}
		else {
			System.out.println("6.- Your mark is worse than the previous one...");
		}
		
		// Another example.
		float average = 0;
		if(mark1 >= 5 && mark2 >= 5) {
			average = (mark1 + mark2) / 2;
			System.out.println("7.- Your average mark is " + average);
		}
		else {
			if(mark1 < 5) {
				System.out.println("7.- You must retake the first exam.");
			}
			if(mark2 < 5) {
				System.out.println("7.- You must retake the second exam.");
			}
		}
		
		// If .. else if ladder.
		if(mark1 <= 0 && mark1 < 5) {
			System.out.println("8.- You have passed the first program.");
		}
		else if(mark1 < 6) {
			System.out.println("8.- You have D");
		}
		else if(mark1 < 7) {
			System.out.println("8.- You have C");
		}
		else if(mark1 < 8) {
			System.out.println("8.- You have B");
		}
		else if(mark1 < 9) {
			System.out.println("8.- You have B+");
		}
		else if(mark1 < 10) {
			System.out.println("8.- You have A");
		}
		else if(mark1 == 10) {
			System.out.println("8.- You have A+");
		}
		else {
			System.out.println("8.- Your mark is wrong...");
		}
		
		// The ? operator.
		String qualification;
		if(average >= 5) {
			qualification = "9.- Passed";
		}
		else {
			qualification = "9.- Failed";
		}
		
		// Si es verdadero, devuelve el primero, si no el segundo.
		qualification = average >= 5 ? "9.- Passed" : "9.- Failed";
		System.out.println("9.- Your qualification is: " + qualification);
		
		// Switch statement -> We can perform an action among several ones according the value of an expression.
		average = (mark1 + mark2) / 2;
		switch((int)average) {
			case 0:{
				System.out.println("10.- You have 0. It's horrible!");
				break;
			}
			case 1:{
				System.out.println("10.- You have 1. It's very poor!");
				break;
			}
			case 2:{
				System.out.println("10.- You have 2. It's so poor!");
				break;
			}
			case 3:{
				System.out.println("10.- You have 3. You should improve!");
				break;
			}
			case 4:{
				System.out.println("10.- You have 4. Almost passed!");
				break;
			}
			case 5:{
				System.out.println("10.- You have 5. You are passed!");
				break;
			}
			case 6:{
				System.out.println("10.- You have 6. Good job!");
				break;
			}
			case 7:{
				System.out.println("10.- You have 7. Fine, good mark!");
				break;
			}
			case 8:{
				System.out.println("10.- You have 8. WOW!");
				break;
			}
			case 9:{
				System.out.println("10.- You have 9. Almost perfect!");
				break;
			}
			case 10:{
				System.out.println("10.- You have 0. PERFECT, congrats!");
				break;
			}
			default:{
				System.out.println("10.- You have no valid mark.");
				break;
			}
		}
		// Another example with chat datatype.
		System.out.print("11.- Enter your favourite week day: ");
		char weekDay = sc.next().charAt(0);
		switch (weekDay) {
			case 'm':{
				System.out.println("11.- Today it's monday.");
				break;
			}
			case 't':{
				System.out.println("11.- Today it's tuesday.");
				break;
			}
			case 'w':{
				System.out.println("11.- Today it's wednesday.");
				break;
			}
			case 'T':{
				System.out.println("11.- Today it's thursday.");
				break;
			}
			case 'f':{
				System.out.println("11.- Today it's friday.");
				break;
			}
			case 's':{
				System.out.println("11.- Today it's saturday.");
				break;
			}
			case 'S':{
				System.out.println("11.- Today it's sunday.");
				break;
			}
			default :{
				System.out.println("11.- Your week day doesn't exits.");
			}
		}
		
		// Another example with strings.
		System.out.println("12.- [Add] users.");
		System.out.println("12.- [Delete] users.");
		System.out.println("12.- [Update] users.");
		System.out.print("12.- Enter your option: ");
		String action = sc.next();
		switch(action) {
			case "Add":{
				System.out.println("12.- Let's add new user.");
				break;
			}
			case "Delete":{
				System.out.println("12.- Be careful deleting users.");
				break;
			}
			case "Update":{
				System.out.println("12.- Let's update user propierties");
				break;
			}
			default:{
				System.out.println("12.- The action is not valid.");
				break;
			}
		}	
	}
}