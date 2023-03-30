/*
 * Proyecto:			01Literales
 * Programa:			Literales.java
 * Autor:				Alberto Sánchez Barona
 * Fecha:				07/12/2022
 */
public class Literales {

	public static void main(String[] args) {
		// Literales enteros: It is written with only digits;
		// The datatype is int unless the number to be too big, in that case, it will be long;
		System.out.println(1234);
		
		// If we want a long literal, we have to punt the sufix l;
		System.out.println(1234l);
		
		// We can write a integer literal in different numerical system;
		// Prefix 0 -> Octal to Decimal;
		// Prefix 0x -> Hexadeciaml to Decimal;
		System.out.println(0777);
		System.out.println(0xFF);
		
		// For negative values, we use the - operator;
		System.out.println(-525);
		System.out.println(-0560);
		System.out.println(-0x99);
		
		// Float and double literals;
		// We use . as decimal separator;
		// By default, the datatype is double;
		// If we want float literal, we add the f suffix;
		System.out.print("Double literals: ");
		System.out.println(3.141516);
		
		// If the number is lower than 1, we can omit the 0;
		System.out.print("Double literal with no 0: ");
		System.out.println(.235);
		
		// We can use scientific notation;
		System.out.print("The format for scientific notations is: ");
		System.out.print("<n>e<power>: ");
		System.out.println(5.78e-4);
		
		// If we want a float data type, we use f;
		System.out.print("The number PI is: ");
		System.out.println(3.1415f);
		
		// Character literals;
		System.out.print("Character for only one character: ");
		System.out.println('n');
		
		// How can we show a character that is not in the keyboard?;
		System.out.print("The (c) in Unicode is: ");
		System.out.println('\u00A9');
		
		// Escape sequence;
		System.out.print("Tabulator\tTabulator\tTabulator\n");
		System.out.println("Next line");
		System.out.println("For string literals we use \"");
		System.out.println("Another example with \'");
		
		// Strings literals.
		System.out.println("This is a string literal");
		
		// Boolean literals.
		System.out.print("True is: ");
		System.out.println(true);
		System.out.print("False is: ");
		System.out.println(false);
	}

}
