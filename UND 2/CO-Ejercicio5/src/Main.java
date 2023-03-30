import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        // Inicializamos la array con 5 fechas.
        LocalDate[] fechas = new LocalDate[5];
        fechas[0] = LocalDate.of(2020, 12, 6);
        fechas[1] = LocalDate.of(2027, 3, 15);
        fechas[2] = LocalDate.of(2021, 6, 30);
        fechas[3] = LocalDate.of(2019, 10, 9);
        fechas[4] = LocalDate.of(2025, 4, 1);

        // Buscamos la fecha más antigua y la más moderna.
        LocalDate fechaMasAntigua = fechas[0];
        LocalDate fechaMasModerna = fechas[0];

        for (int i = 1; i < fechas.length; i++) {
            if (fechas[i].isBefore(fechaMasAntigua)) {
                fechaMasAntigua = fechas[i];
            }
            if (fechas[i].isAfter(fechaMasModerna)) {
                fechaMasModerna = fechas[i];
            }
        }

        // Mostramos la fecha más antigua y moderna.
        System.out.println("La fecha más antigua es: " + fechaMasAntigua);
        System.out.println("La fecha más moderna es: " + fechaMasModerna);

        // Calculamos el periodo de una fecha a otra y lo mostramos.
        Period periodoFechas = Period.between(fechaMasAntigua,fechaMasModerna);
        System.out.println("El periodo entre " + fechaMasAntigua + " y " + fechaMasModerna + " es de: " + periodoFechas.getYears() + " años, " + periodoFechas.getMonths() + " meses y "+ periodoFechas.getDays() + " días.");
    }
}