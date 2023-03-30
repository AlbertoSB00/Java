/*
 * Proyecto:		11RandomClass
 * Clase:			RandomClass
 * Autor:			Alberto Sánchez Barona
 * Fecha:			16/01/2023 
 */

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random randomNumber = new Random( System.currentTimeMillis() );
		
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("The number is " + randomNumber.nextInt());
		}
		System.out.println("-----------------------------------------------");
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("The number is " + randomNumber.nextLong());
		}
		System.out.println("-----------------------------------------------");
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("The number is " + randomNumber.nextInt(5,25));
		}
		System.out.println("-----------------------------------------------");
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("The number is " + randomNumber.nextFloat(-1575.25f,1542.56f));
		}
	}

}
