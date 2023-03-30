/*
 * Proyecto:		EjercicioLibreria21
 * Clase:			EjercicioLibreria21.java
 * Autor:			Alberto Sánchez Barona
 * Fecha:			20/01/2023 
 * Descripción:		Develop a program that enters by keyboard a time and then, it displays on the console the time in the form hh:mm AM|PM. Be careful! The time entered must be correct, so imagin a way to convert a wrong time data in a right one. Clue: think that a hour passed of 24 belongs to the next day, and a minute passed of 59 belongs to the next hour.
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EjercicioLibreria21 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a time: ");
        String time = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(time, ":");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        int hourLeft = minute / 60;
        minute = minute % 60;
        
        int realHours = hour % 24;
        realHours += hourLeft;
        
        time = Integer.toString(realHours) + ":" + Integer.toString(minute);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m");
        LocalTime ltTime = null;
        try {
        	ltTime = LocalTime.parse(time, dtf);
        }
        catch ( DateTimeParseException dtpe ) {
        	System.out.println(dtpe.getMessage());
        	System.exit(1);
        }
        
        dtf = DateTimeFormatter.ofPattern("h:mm a");
        
        System.out.println("The time is: " + ltTime.format(dtf));
    }
}
