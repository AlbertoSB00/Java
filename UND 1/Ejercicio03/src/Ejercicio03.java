/*
 * Proyecto:		Ejercicio03
 * Clase:			Ejercicio03.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			12/12/2022
 * Descripción:		Develop a program to display on the screen:
 * 						• The amount of bits in a RAM memory of 16 GB.
 * 						• The population of the earth. 
 * 						• The size of some virus. 
 * 						• Use a float number in scientific notation and choose a different precision for both data. 
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    // Calculate the number of bits in a 16 GB RAM memory
    long bitsInRam = 16 * 1024 * 1024 * 1024 * 8; // 16 GB * 1024 MB/GB * 1024 KB/MB * 1024 B/KB * 8 bits/B
    System.out.println("The amount of bits in a 16 GB RAM memory is " + bitsInRam);

    // Get the population of the earth
    int population = (int) 7841e6; // Estimated population of Earth in 2022
    System.out.println("The population of the Earth is " + population);

    // Get the size of some virus
    double virusSize = 0.00005; // In micrometers (um)
    System.out.println("The size of some virus is " + virusSize + " um");

    // Use a float number in scientific notation and choose a different precision for both data
    float floatNumber = 3.141592e10f; // Pi * 10^10
    System.out.println("A float number in scientific notation with 3 decimal places: " + String.format("%.3e", floatNumber));
    System.out.println("A float number in scientific notation with 5 decimal places: " + String.format("%.5e", floatNumber));
  }
}
