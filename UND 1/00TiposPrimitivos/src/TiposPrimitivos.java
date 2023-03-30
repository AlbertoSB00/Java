/*
 * Proyecto:			00TiposPrimitivos
 * Programa:			TiposPrimitivos.java
 * Autor:				Alberto Sánchez Barona
 * Fecha:				02/12/2022
 */
public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipo de dato: Número entero;
		int numero_entero;
		numero_entero = 35;
		System.out.println("El número entero es: " + numero_entero);
		
		int numero_entero1 = 15;
		System.out.println("El número entero1 es: " + numero_entero1);
		
		// Error de asignación -> numero_entero = 3.14;
		
		// Entero byte -> Desde -128 hasta 128;
		byte entero_byte = 120;
		System.out.println("El entero byte es: " + entero_byte);
		
		// Entero corto -> Desde -32768 hasta 32767;
		short entero_corto = 30000;
		System.out.println("El entero corto es: " + entero_corto);
		
		// Entero largo -> Desde -2147483648 hasta 2147483647;
		long entero_largo = 214912875;
		System.out.println("El entero largo es: " + entero_largo);
		
		// Single y double precisión;
		float numero_pi = 3.14f;
		double numero_decimal = 75.912871984;
		System.out.println("El número PI es " + numero_pi + " y el número decimal es " + numero_decimal);
		
		// Character data type -> Los char llevan '';
		char letra = 'a';
		System.out.println("El carácter es " + letra);
		
		// String class;
		String my_string = "Esto es una cadena.";
		System.out.println(my_string);
		my_string = "Esto es otra cadena.";
		System.out.println(my_string);
	}
}