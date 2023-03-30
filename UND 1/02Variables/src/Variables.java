/*
 * Proyecto:			02Variables
 * Programa:			Variables.java
 * Autor:				Alberto Sánchez Barona
 * Fecha:				07/12/2022
 * 
 * What is a variable?
 * 	- Is a space memory that saves a value. The variables have a name to refer their values and a datatype to know how many space it is necessary.
 * 
 * As a result, a variable has got size, value and memory address.
 * The size is the necessary space in memory to save the value according to data type.
 * 
 * In java we have two main types of variables:
 * 	- Primitive variables: It saves a primitive value.
 * 	- Reference variables: It points (references) an object in memory.
 * 
 * According the place where the variable is declared we have the following types:
 * 	- Instance varaible: It is declared inside a class, but out of any method. It represents a property of the object. Each object will have a individual copy of the variable.
 * 	- Class variable: It is a variable declared inside the class with the static keyword.
 * 	- Local variable: It is declared inside a method and only exists inside that method. It can be accessed by the method code.
 * 	- Local variable: It is declared inside a block of code.
 * 
 * ------------------------	   This type of variable save the memory address (reference) where the object is saved. It
 * |  REFERENCE VARIABLE  | -> is called reference because the variable references and object. Each object reference
 * ------------------------	   can have many instances variables and methods.
 * 
 * By default, a object reference variable is initialized with null value.
 * 
 * Rules to name a variable
 * ------------------------
 * 
 * 1.- It starts with a letter or underscore.
 * 2.- It can contain letters (no matter capilize), digits, $ or underscore.
 * 3.- It can not have with spaces.
 * 4.- No limit about numbers of characters in its name.
 * 5.- Case sensitive.
 * 6.- Language keywords cannot be used to name a variable.
 * 7.- Convetion: it starts with lowercase and if it has got several words the first letter in each word in uppercase and all together.
 */
public class Variables {
	// Instance variable. An object property.
	// This instance variable is accessed by all methods of the class.
	String property = "This is a property of the object.";
	
	// Class variable. It belong to the class, no the object.
	static int numberOfClass = 3;
	static final int NUMBER = 10;
	
	public static void main(String[] args) {
		// We access to the class variable.
		System.out.println("The class variable is: " + numberOfClass);
		
		// We cannot access to the instance variable.
		// System.out.println("The instance variable is: " + property);
		
		// Variable declaration.
		// <datatype> <name> [ = <expression> ] [, <name> [ = <expression> ] ];
		int age;
		float weight = 78.50f;
		System.out.println("The weight is: " + weight);
		
		// We can declare several variables together.
		double pi = 3.1415, eNumber = 2.710201;
		System.out.println("The number pi is " + pi + " and the e number is " + eNumber);
		
		// Data type deduce.
		// The datatype of a variable will be deduced if we declare the variable with the keyword var instead of point out a data type.
		var height = 1.78f; //Height is float.
		System.out.println("The hegiht is: " + height);
		
		// We assign a value to age.
		age = 22;
		System.out.println("You are " + age + " years old.");
		
		/*
		 * Variable scope.
		 * 
		 * Part of the program where the variable is visible and accesible. The variable scope depend on the place where the variable was declared:
		 * - In a class (property) -> The variable is visible in a class methods.
		 * - In a methos (function) -> The variable is visible in that method.
		 * - Class variable (those declared with the keyword STATIC) are visible just in static methods.
		 * - Code block -> The variable is only visible only inside the code block.
		 */
		
		// All variable declared in this methos are visible and accessible inside this method.
		System.out.println("The height is: " + height);
		
		// Code block -> Set of statements enclosed by {} and managed as a logical unit. Typically are use in control structures like if, while, do while..., to execute several statements together.
		{
			// Variable declared inside a code block.
			int insideCodeBlock = 7;
			System.out.println("The variable in the code block " + insideCodeBlock);
			// Inside the codeblock, all variables declared in a higher scope are visible and accesible
			height = 1.95f;
			System.out.println("The new height is " + height);
		}
		// Outside the codeblock the variable insideCodeBlock doesn't exits. When te code block finished, the variable vanishes with it.
		System.out.println("The variable insideCodeBlock doesn't exist here.");
		
		/*
		 * Type conversions
		 * 
		 * A variable can convert its data type to another one. The conversion is to a data type with a wider range (explicit conversion) or a less wide one (with possibility of losing information). For example, conver from double to long provokes the lost of decimal digits.
		 * 
		 *  The operation to convert a datatype to another ones is called CASTING. The suntax is:
		 *  (<datatype>)<expression>
		 */
		
		int aproxHeight = (int)height;
		System.out.println("Now, the aproximate height is " + aproxHeight);
		
		long longHeight = aproxHeight;
		System.out.println("Implicit conversion: " + longHeight);
		
		/*
		 * Constant values.
		 * 
		 * We sometime need to use literal values more than once. This means we have to repeat that literals several times along the code. If it were neccessary to change that literal, we will have do it in all lines wheres the literal is. Is much more flexible to use a varaible, but it could be changed accidentally. To prevent that we declare that variable with the keyword final.
		 */
		
		final float MY_COMISSION = 2.25f;
		System.out.println("My comission is: " + MY_COMISSION);
		
		// We cannot change the value of a final variable.
		// MY_COMISSION = 3.5f;
	}

}
