/*
 * Proyecto:		EjercicioLibreria20
 * Clase:			EjercicioLibreria20.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			20/01/2023 
 * Descripción:		Develop a program that enters by keyboard a datetime and then it displays on the console every field of the datetime.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjercicioLibreria20 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date and time (dd/MM/yyyy HH:mm:ss): ");
        String input = scanner.nextLine();

        try {
            Date date = dateFormat.parse(input);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
            System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("Year: " + calendar.get(Calendar.YEAR));
            System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
            System.out.println("Second: " + calendar.get(Calendar.SECOND));
        } catch (ParseException pe) {
            System.out.println("Invalid date and time format. Please use dd/MM/yyyy HH:mm:ss.");
        }
    }
}
