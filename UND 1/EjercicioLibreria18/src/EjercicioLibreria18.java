/*
 * Proyecto:		EjercicioLibreria18
 * Clase:			EjercicioLibreria18.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			20/01/2023 
 * Descripción:		Develop a program that shows the age you have by calculating it according to your birthdate and today.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EjercicioLibreria18 {
    public static void main(String[] args) {
        
    	int birthDay = 25;
        int birthMonth = 4;
        int birthYear = 1980;
        
        Calendar today = new GregorianCalendar();
        int currentDay = today.get(Calendar.DAY_OF_MONTH);
        int currentMonth = today.get(Calendar.MONTH) + 1;
        int currentYear = today.get(Calendar.YEAR);
        
        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }
        
        System.out.println("Age: " + age);
    }
}