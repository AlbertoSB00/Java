/*
 * Proyecto:		03Expresiones
 * Programa:		Expresiones.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			09/12/2022
 * Descripción:		Operators and expressions in Java.
 * 
 * 
 * What is a operator in Java?
 * 
 * One or Two symbols that represent an operation to perform. This operator needs operands or data necessary for the operation.
 * Operators can be:
 * - Unary -> It just needs an operators.
 * - Binary -> It needs two operators.
 * 
 * Operands can be:
 * - A literal.
 * - A variable.
 * - The return value of a method.
 * - The result of another operation.
 * 
 * OPerators and operands are combined to form expressions.
 * 
 * 
 * What is a expression?
 * 
 * A combitanion of operands with operators that, onde done the operations, gives a result.
 * 
 * Evaluating an expression -> To perform all operation in the expression to get the result.
 * 
 * The order of execution of operations is ruled by the procedence and associativity rules.
 * 
 * An expression van be such a simple as one only operand. Its result will be the current operant value.
 */

import java.util.Scanner;

public class Expresiones {
	
	public static void main(String[] args) {
		// Operators
		
		// Assigment operators.
		
		// = -> assigment operator.
		int integerNumber = 8;
		System.out.println("1.- The integer number is " + integerNumber);
		
		// We can assign a value to several variables.
		int x, y, z;
		x = y = z = 11;
		System.out.printf("2.- The x, y and z variables are %d, %d, %d\n", x, y, z); // %d entero, %f decimal, %s cadena.
		
		/*
		 * Assigment operator with arithmetic operation.
		 * 
		 * += -> Add and assigment.
		 * -= -> Substraction and assigment.
		 * *= -> Multiplication and assigment.
		 * /= -> Division and assigment.
		 * %= -> Module and assigment.
		 */
		
		integerNumber += 4;
		System.out.println("3.- The integer number " + integerNumber);
		
		integerNumber -= 3;
		System.out.println("4.- The integer number " + integerNumber);
		
		integerNumber *= 2;
		System.out.println("5.- The integer number " + integerNumber);
		
		integerNumber /= 5;
		System.out.println("6.- The integer number " + integerNumber);
		
		integerNumber %= 2;
		System.out.println("7.- The integer number " + integerNumber);
		
		/*
		 * Autoincrement and autodecrement.
		 * 
		 * ++ -> Autoincrement.
		 * -- -> Auto decrement.
		 * 
		 * They can be set before (as prefix) or after (as sufix). With no whitespace between them. The result will depend of the place they are placed and the expression they are in. If the expression is a single variable will not affect the final result. If the expression has more operand and operators the result depend on they area as prefix or sufix. 
		 */
		
		int number1 = 5, number2 = 8;
		++number1; //numer1 = number1 + 1
		System.out.println("8.- The number1 is " + number1);
		number2++;
		System.out.println("9.- The number2 is " + number2);
		
		int result = ++number1 - 2;
		System.out.println("10.- The result is " + result + " and number1 is " + number1);
		
		result = number2++ - 2; // Primero hace la operacion y luego el ++ por eso el resultado es 7 (9-2) y number2 es 10.
		System.out.println("11.- The result is " + result + " and number2 is " + number2);
		
		/*
		 * Arithmetic Operands.
		 * + -> Addition.
		 * - -> Subtraction.
		 * * -> Multiplication.
		 * / -> Division.
		 * % -> Module.
		 */
		int addition = number1 + number2;
		int subtraction = number1 - 6;
		int multiplication = number1 * 3;
		float division = (float)number1 / number2;
		int module = 17 % number1;
		
		System.out.println("12.- The addition is " + addition);
		System.out.println("13.- The subtraction is " + subtraction);
		System.out.println("14.- The multiplication is " + multiplication);
		System.out.println("15.- The division is " + division);
		System.out.println("16.- The module is " + module);
		
		double power = Math.pow(number1, 3);
		System.out.println("17.- The power is " + power);
		
		// Unary operator -
		int positiveNumber = +15;
		int negativeNumber = -15;
		System.out.println("18.- The positive number is " + positiveNumber);
		System.out.println("19.- The negative number is " + negativeNumber);
		
		/*
		 * Relational operators:
		 * They compare two operands and return a true or false result.
		 * They are usually in comparisons inside control structures.
		 * 
		 * == -> Equal to.
		 * != -> Different than.
		 * <  -> Lower than.
		 * >  -> Greater than.
		 * <= -> Lower or equal than.
		 * >= -> Greater or equal than.
		 */
		
		float num1 = 5.25f, num2 = 8.15f;
		boolean resultComparision = num1 == num2;
		System.out.println("20.- Are they equal? " + resultComparision);
		
		resultComparision = num1 != num2;
		System.out.println("21.- Are they different? " + resultComparision);
		
		resultComparision = num1 > num2;
		System.out.println("22.- Are num1 greater than num2? " + resultComparision);
		
		resultComparision = num1 < num2;
		System.out.println("23.- Are num2 greater than num1? " + resultComparision);
		
		resultComparision = num1 >= num2;
		System.out.println("24.- Are num1 greater or equal than num2? " + resultComparision);
		
		resultComparision = num1 <= num2;
		System.out.println("25.- Are num2 greater or equal than num1? " + resultComparision);
		
		/*
		 * Comparisons of strings.
		 * 
		 * We don't usually use the relational operators because strings are REFERENCES (instance variables)
		 */
		
		String s1 = "Pepe";
		String s2 = "Pepe";
		
		resultComparision = s1 == s2;
		// They are alike, but don't get wrong. It's and exception.
		System.out.println("26.- Are both strings alike? " + resultComparision);
		
		System.out.print("27.- Enter a string: ");
		Scanner sc = new Scanner(System.in);
		s1 = sc.next();
		System.out.print("28.- Enter the second string: ");
		s2 = sc.next();
		System.out.println("29.- S1: " + s1);
		System.out.println("30.- S2: " + s2);
		resultComparision = s1 == s2;
		System.out.println("31.- Are they alike? " + resultComparision);
		// They are diffenret because they are instance variables.
		
		/*
		 * String comparisons
		 * 
		 * We have 3 methods to compare strings:
		 * 1.- equals() method of String class.
		 * 2.- equalsIgnoreCase() method of String class.
		 * 3.- compareTo() method of String class.
		 */
		
		resultComparision = s1.equals(s2);
		System.out.println("32.- Are they alike? " + resultComparision);
		
		resultComparision = s1.equalsIgnoreCase(s2);
		System.out.println("33.- Are they alike? " + resultComparision);
		
		/*
		 * Logical operators.
		 * They are used to join two or more realtional expressions.
		 * Each one gives a boolbean result:
		 * & && -> AND operator. The second one in short-circuit.
		 * | || -> OR operator. The second one in short-circuit.
		 * ^ 	-> XOR operator.
		 * ! 	-> NOT operator.
		 */
		
		System.out.print("34.- Enter three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		float n3 = sc.nextFloat();
		System.out.printf("35.- The numbers are %d, %d, %f \n", n1, n2, n3);
		
		// & operator.
		resultComparision = n1 == n2 & n2 != n3;
		System.out.println("36.- The result is " + resultComparision);
		
		resultComparision = n1 + 3 < n2 - 5 || n2 * 2 >= n3;
		System.out.println("37.- The result is " + resultComparision);
		
		resultComparision = n1 * 2 > n2 + 8 ^ n2 / 3 <= n3;
		System.out.println("38.- The result is " + resultComparision);
		
		resultComparision = n1 * 2 > n2 + 8 ^ !(n2 / 3 <= n3);
		System.out.println("39.- The result is " + resultComparision);
		
		/*
		 * String Operators.
		 * + -> Concatenation.
		 */
		String name = "Alberto ";
		String surname = "Sánchez Barona";
		String fullName = name + surname;
		System.out.println("40.- Hi, your name is " + fullName);
		
		/*
		 * Precedence abd associativity.
		 */
		
		int a = 5, b = 8, c = 3, d = 9;
		float resultOperations = a++ * (float)--b * c + 2 / 2;
		System.out.println("41.- The result is " + resultOperations);
		System.out.printf("42.- a is %d, b is %d, c is %d, d is %d \n", a,b,c,d);
		
		resultOperations = a++ * ((float)--b * (c + 2)) / 2;
		System.out.println("42.- The result is " + resultOperations);
		System.out.printf("43.- a is %d, b is %d, c is %d, d is %d \n", a,b,c,d);
		
		// We can mix operators of different type.
		resultComparision = ++a * 2 >= c - d / 3 && c + 2 != b || a + d == c - b;
		System.out.println("43.- The result is " + resultComparision);
		System.out.printf("44.- a is %d, b is %d, c is %d, d is %d \n", a,b,c,d);
	}
}
