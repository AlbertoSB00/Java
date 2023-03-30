/*
 * Proyecto:		09WrappingClass
 * Clase:			WrappingClass.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			12/01/2023 
 * Descripción:		Wrapping classes in Java: Java use primitive data type, like int, char, short, boolean, ... for performance reasons. These data type are not included in the classes. They are passed to methos by value and cannot be changed in that methods. So, they cannot be passed by reference. Also, there is no way two methods reference the same data type of any primivite one. We sometimes need to create an object representation of a primivite data type. That is, we have to WRAP a primitive date in an object. For it, Java has got classes that fit primitive data types. These classes encapsulate or wrap a primitive data type in an object. Due to it, they are known as wrapping class. Amon them there are:
 * - Integer, Long, Short and Byte for integer data type.
 * - Double and Float for double and float data type respectively.
 * - Character for char data type.
 * - Boolean for boolean data type.
 * 
 * The wrapping class tend to have a set of common methods for basic operations:
 * - To create an object -> valueOf()
 * - To get the data in its primitive data type -> byteValue(), intValue(), floatValue(), doubleValue(), charValue()...
 * - To parse a string value to a numeric one -> parse()
 */

import java.util.Scanner;

public class WrappingClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		int number = sc.nextInt();
		
		Integer intNumber = Integer.valueOf(number);
		System.out.println("1.- The integer is " + intNumber.toString());
		System.out.println("1.- The integer is " + intNumber.intValue());
		System.out.println("1.- The integer is " + intNumber.shortValue());
		
		intNumber = Integer.valueOf(1234);
		System.out.println("2.- The integer is " + intNumber.toString());
		System.out.println("2.- The integer is " + intNumber.intValue());
		System.out.println("2.- The integer is " + intNumber.shortValue());
		
		String myIntNumber = "2345";
		int integer = Integer.parseInt(myIntNumber);
		
		// Byte value.
		System.out.print("Enter a byte value: ");
		Byte octeto = Byte.valueOf(sc.nextByte());
		System.out.println("3.- The byte value is " + octeto.byteValue());
		byte myOcteto = 22;
		octeto = Byte.valueOf(myOcteto);
		System.out.println("3.- The byte value is " + octeto.byteValue());
		
		// Long value.
		long longNumber = 1948712;
		Long longWrapClass = Long.valueOf(longNumber);
		System.out.println("4.- The long value is " + longWrapClass.longValue());
		
		// Double and Float
		Double doublePreccision = Double.valueOf(23.124125125);
		Float floatPreccision = Float.valueOf(13.141516f);
		Double doublePrec = Double.parseDouble("1241.51616");
		Float floatPrec = Float.parseFloat("2.71");
		System.out.println("5.- The double is " + doublePreccision.doubleValue());
		System.out.println("5.- The double is " + floatPreccision.floatValue());
		
		// Geting the primitive value.
		double doubleValue = doublePrec.doubleValue();
		float floatValue = floatPrec.floatValue();
		
		// Character class.
		Character myCharacter = Character.valueOf('z');
		char charValue = '0';
		Character symbol = Character.valueOf(charValue);
		
		for ( int i = 0; i < 20; i++ ) {
			char random = (char)(Math.random() * 255);
			System.out.println("6.- The character is: " + random);
			if ( Character.isLetter(random) ) {
				System.out.println("6.- The character is letter.");
				if ( Character.isUpperCase(random) ) {
					System.out.println("6.- The character is uppercase.");
				}
				else if ( Character.isLowerCase(random) ) {
					System.out.println("6.- The character is lowercase.");
				}
			}
			if ( Character.isDigit(random) ) {
				System.out.println("6.- The character is number.");
			}
			if ( Character.isISOControl(random) ) {
				System.out.println("6.- The character is ISO Control.");
			}
			if ( Character.isWhitespace(random) ) {
				System.out.println("6.- The character is white space.");
			}
			
			myCharacter = Character.valueOf(random);
			String symbols = "<>²,.;:-_[]\"\\`+{©}*+÷!¡¿?'=´()|@#¸~€¬·$%&/€";
			if ( symbols.indexOf(myCharacter.charValue()) > -1){
				System.out.println("6.- The character is symbol.");
			}
			System.out.println("-------------------------------------------------------------");
		}
	}
}