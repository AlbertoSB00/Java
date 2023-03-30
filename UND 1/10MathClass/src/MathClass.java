/*
 * Proyecto:		10MathClass
 * Clase:			MathClass
 * Autor:			Alberto Sánchez Barona
 * Fecha:			12/01/2023 
 * Descripción:		This is the Math Class
 */
public class MathClass {

	public static void main(String[] args) {
		
		// Some useful constants values.
		System.out.println("The number PI " + Math.PI);
		System.out.println("The E number " + Math.E);
		
		// Rounding numbers.
		System.out.println("The PI number is: " + Math.round(Math.PI)); //Redondeo normal.
		System.out.println("The PI number is: " + Math.ceil(Math.PI)); // Redondeo por arriba.
		System.out.println("The PI number is: " + Math.floor(Math.E)); // Redondeo por abajo.
		
		// Pythagoras' Theorema.
		double sideHigher = 4.0;
		double sideLower = 3.0;
		double hypotenuse = Math.sqrt( Math.pow(sideHigher, 2) + Math.pow(sideLower, 2) );
		System.out.println("The hypotenuse is: " + hypotenuse);
		
		hypotenuse = Math.hypot(sideLower, sideHigher);
		System.out.println("The hypotenuse is: " + hypotenuse);
		
		// More useful methods.
		int numberOne = 34, numberTwo = 65;
		System.out.println("The max number is: " + Math.max(numberOne, numberTwo));
		System.out.println("The min number is: " + Math.min(numberOne, numberTwo));
	}
}