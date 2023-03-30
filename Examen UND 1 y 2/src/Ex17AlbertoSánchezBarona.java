import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex17AlbertoSánchezBarona {
    public static void main(String[] args) {

        // Creamos el Scanner para pedir datos por teclado.
        Scanner sc = new Scanner(System.in);

        // 1.- Matrícula vehículo.
        int intentosTotales = 3;
        int intentoActual = 1;
        boolean matriculaValida = false;

        // Pedimos la mátricula.
        System.out.print("Introduzca la mátricula del vehículo: ");
        String matricula = sc.nextLine();

        do{
            // Formato de matrícula -> 9999AAA
            String nuevaMatricula = null;
            for( int i = 0; i <= matricula.length(); i++ ){

            }
            if( intentoActual >= intentosTotales ){
                System.out.print("Has superado el número de intentos totales. Saliendo del programa...");
                System.exit(1);
            }
            else {
                System.out.println("Matrícula válida...");
                matriculaValida = true;
            }
            intentoActual++;
        }while ( !matriculaValida );

        // 2.- Fecha de matriculación.
        boolean fechaValida = false;
        System.out.print("Introduzca la fecha de matriculación: ");
        String fechaMatriculacion = sc.nextLine();

        do{
            LocalDate ldFechaHoy = LocalDate.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate ldFechaMatriculacion = LocalDate.parse(fechaMatriculacion, dtf);

            // Comparamos si la fecha de matriculación es posterior a la actual.
            if( ldFechaHoy.isBefore(ldFechaMatriculacion) ){
                System.out.println("No es posible tener una matriculación posterior a la fecha actual. Inténtelo de nuevo...");
                System.out.print("Introduzca la fecha de matriculación: ");
                fechaMatriculacion = sc.nextLine();
                continue;
            }
            else {
                System.out.println("Fecha de matriculación válida...");
                fechaValida = true;
            }
        } while ( !fechaValida );

        // 3.- Km recorridos.
        System.out.print("Introduzca los kilómetros recorridos: ");
        int km = sc.nextInt();

        // 4.a.- Visualizar matrícula.
        System.out.println("La matrícula de su coche es: " + matricula);

        // 4.b.- Calcular y visualizar antigüedad en años.
        LocalDate ldFechaHoy = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate ldFechaMatriculacion = LocalDate.parse(fechaMatriculacion, dtf);

        int aniosVehiculo = ldFechaHoy.getYear() - ldFechaMatriculacion.getYear();
        System.out.println("El vehículo tiene " + aniosVehiculo + " años completos.");

        // 4.c.- Revision inicial.
        if ( aniosVehiculo < 1 || km <= 10000 ){
            System.out.println("Revisión inicial el día: " + ldFechaHoy.getDayOfMonth() + " - " + (ldFechaHoy.getMonthValue() + 1) + " - " + ldFechaHoy.getYear());
        }

        // 4.d.- Revisión periódica.
        int revision10km = km % 10000;
        int revision35km = km % 35000;

        if ( revision10km == 0 ){
            if ( km <= 5000 ){
                System.out.println("Revisión de 10000 Km el día: " + ldFechaHoy.getDayOfMonth() + " - " + (ldFechaHoy.getMonthValue() + 4) + " - " + ldFechaHoy.getYear());
            }
            if ( km > 5000 ){
                System.out.println("Revisión de 10000 Km el día: " + ldFechaHoy.getDayOfMonth() + " - " + (ldFechaHoy.getMonthValue() + 2) + " - " + ldFechaHoy.getYear());
            }
        }

        if ( revision35km == 0 ){
            if ( km <= 5000 ){
                System.out.println("Revisión de 35000 Km el día: " + ldFechaHoy.getDayOfMonth() + " - " + (ldFechaHoy.getMonthValue() + 4) + " - " + ldFechaHoy.getYear());
            }
            if ( km > 5000 ){
                System.out.println("Revisión de 35000 Km el día: " + ldFechaHoy.getDayOfMonth() + " - " + (ldFechaHoy.getMonthValue() + 6) + " - " + (ldFechaHoy.getYear() + 1));
            }
        }
    }
}