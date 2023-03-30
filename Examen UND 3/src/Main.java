// Proyecto: ExRA4-17
// Archivo: Main.java
// Autor: Alberto Sánchez Barona
// Fecha: 09-03-2023

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        // Instanciar un objeto de la clase DatosSeguridad con fecha 10/10/2022 y periodo mínimo de cambio de 10 días. Mostrar el objeto en la consola.
        DatosSeguridad ds1 = new DatosSeguridad(LocalDate.of(2022, 10, 10), Period.ofDays(10));

        // Crear una copia del objeto anterior.
        DatosSeguridad ds2 = ds1.cloneDatosSeguridad();

        // Instanciar un objeto de la clase Empleado y asignarle el primer objeto de la clase DatosSeguridad.
        Empleado e1 = new Empleado("31888094C", "Alberto Sánchez Barona", LocalDate.of(2000, 12, 11), ds1);

        // Instanciar un objeto de la clase Cliente y asignarle el segundo objeto de la clase DatosSeguridad.
        Cliente c1 = new Cliente("usuario", "Javier Pérez", LocalDate.of(2023, 1, 1), ds2);

        //  1.- Ejecutar el método autenticar("abc123") en el objeto de la clase empleado y tiene que devolver verdadero.
        System.out.println("1.- " + e1.autenticar("abc123"));

        // 2.- Ejecutar el método autenticar("123abc") en el objeto de la clase empleado y tiene que devolver falso.
        System.out.println("2.- " + e1.autenticar("123abc"));

        // 3.- Ejecutar el método cambiarToken("123456", "78zy") en el objeto de la clase empleado y tiene que devolver falso por clave errónea. Por tanto, la clave y la fecha del último cambio no se modifican.
        System.out.println("3.- " + e1.cambiarToken("123456", "78zy"));

        // 4.- Ejecutar el método cambiarToken("123abc", "78zy") en el objeto de la clase empleado y tiene que devolver falso por longitud de la clave errónea. Por tanto, la clave y la fecha del último cambio no se modifican.
        System.out.println("4.- " + e1.cambiarToken("123abc", "78zy"));

        // 5.- Ejecutar el método cambiarToken("123abc", "abc123") en el objeto de la clase empleado y tiene que devolver falso porque no hay suficientes tipos diferentes de caracteres en la nueva clave. Por tanto, la clave y la fecha del último cambio no se modifican.
        System.out.println("5.- " + e1.cambiarToken("123abc", "abc123"));

        // 6.- Ejecutar el método cambiarToken("123abc", "ABab12") en el objeto de la clase empleado y tiene que devolver verdadero. Además, la clave se tiene que haber cambiado y la fecha del último cambio se ha actualizado.
        System.out.println("6.- " + e1.cambiarToken("123abc", "ABab12"));

        // 7.- Ejecutar el método cambiarToken("ABab12", "abAB12") en el objeto de la clase empleado y tiene que devolver falso, ya que todavía no se han cumplido el número mínimo de días desde el último cambio. Por tanto, la clave y la fecha del último cambio no se modifican.
        System.out.println("7.- " + e1.cambiarToken("ABab12", "abAB12"));

        // 8.- Ejecutar el método autenticar("4321") en el objeto de la clase cliente y tiene que devolver falso por pin erróneo.
        System.out.println("8.- " + c1.autenticar("4321"));

        // 9.- Ejecutar el método autenticar("1234") en el objeto de la clase cliente y tiene que devolver verdadero.
        System.out.println("9.- " + c1.autenticar("1234"));

        // 10.- Ejecutar el método cambiarToken("5678", "90") en el objeto de la clase cliente y tiene que devolver falso por pin actual erróneo. Por tanto, el pin y la fecha del último cambio no se modifican.
        System.out.println("10.- " + c1.cambiarToken("5678", "90"));

        // 11.- Ejecutar el método cambiarToken("1234","90") en el objeto de la clase cliente y tiene que devolver falso porque el pin nuevo no tiene la longitud requerida. Por tanto, el pin y la fecha del último cambio no se modifican.
        System.out.println("11.- " + c1.cambiarToken("1234", "90"));

        // 12.- Ejecutar el método cambiarToken("1234", "5678") en el objeto de la clase cliente y tiene que devolver verdadero. Además, el pin se tiene que haber cambiado y la fecha del último cambio se ha actualizado.
        System.out.println("12.- " + c1.cambiarToken("1234", "5678"));

        // 13.- Ejecutar el método cambiarToken(“5678”,”1234”) en el objeto de la clase cliente y tiene que devolver falso, ya que no han trascurrido el número mínimo de días desde el último cambio del pin. Por tanto, el pin y la fecha del último cambio no se modifican.
        System.out.println("13.- " + c1.cambiarToken("5678", "1234"));

        // 14.- Copiar el objeto empleado y visualizar los datos de la copia generada.
        Empleado e2 = e1.cloneEmpleado();
        System.out.println("14.- " + e2);
    }
}