/*
 * Proyecto:		Ejercicio17
 * Programa:		Ejercicio17.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			15/12/2022
 * Enunciado:  Develop a program that enters by keyboard the weight (in Kg) and the height (in metres). Then, it calculates the body-mass index. Finally, it displays on the screen the statement Your body-mass index is <bmi>, where <bmi> is the body-mass index calculated with two decimals digits. And order by weight.
 */
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
	// Creamos el objeto escáner para leer los datos.
    Scanner scanner = new Scanner(System.in);

    // Preguntamos el peso y la altura.
    System.out.print("Enter your weight in kg: ");
    float weight = scanner.nextFloat();
    System.out.print("Enter your height in m: ");
    float height = scanner.nextFloat();

    // Calculamos el IMC.
    float bmi = weight / (height * height);
    
    // Ahora ordenamos según el IMC con switch.
    String category;
    
    if(bmi > 0 && bmi < 18.5) category = "Underweigth";
    else if(bmi >= 18.5 && bmi <= 24.9) category = "Normal weight";
    else if(bmi >= 25 && bmi <= 29.9) category = "Overweight";
    else if(bmi >= 30 && bmi <= 39.9) category = "Obesity";
    else category = "Extreme obesity";
    
    // Mostramos por pantalla los resultados.
    System.out.printf("Your bmi is " + bmi + " (" + category + ")");
  }
}