/*
 * Proyecto:		Ejercicio01
 * Clase:			Ejercicio01.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			12/12/2022
 * Descripción: 	Develop a program to display the following magnitudes:
 * 						• The distance from the Earth to the Sun.
 * 						• The distance from Pluton to the Sun (5,9064x10^9 km). 
 * 						• The the diameter of the Sun. 
 * 						• Use a number in scientific notation and choose a different precision for all data. 
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    // Earth-Sun distance in meters
    double earthSunDistance = 149.6e6;
    // Pluto-Sun distance in meters
    double plutoSunDistance = 5906.4e9;
    // Sun diameter in meters
    double sunDiameter = 1.4e9;

    // Display Earth-Sun distance with 3 decimal places
    System.out.println("Distance from Earth to Sun: " + String.format("%.3e", earthSunDistance) + " meters");
    // Display Pluto-Sun distance with 4 decimal places
    System.out.println("Distance from Pluto to Sun: " + String.format("%.4e", plutoSunDistance) + " meters");
    // Display Sun diameter with 2 decimal places
    System.out.println("Sun diameter: " + String.format("%.2e", sunDiameter) + " meters");
  }
}
