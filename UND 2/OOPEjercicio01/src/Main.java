import java.time.LocalDate;

/*
- Proyecto: OOPEjercicio01
- Clase:    Main.java
- Fecha:    13/02/2023
- Autor:    Alberto Sánchez Barona
- Descripción: Desarrollar un programa en Java que gestiona la información de una entidad docente imparte actividades formativas tanto a los socios registrados como a personas que no son socios y se inscriben en las actividades de formación.
      1. El objeto ActividadFormación consiste en:
          a) Propiedades: código, título, descripción, n.º de horas presenciales (máximo 200), n.º horas online (máximo 100), n.º horas no presenciales, fecha inicio, fecha fin, nivel (A,B,C), precio, horario).
          b) Métodos:
              • Constructor: Parámetros con el código, el título, la descripción y los tres tipos de horas formativas.
              • Constructor: Parámetros con el código, la descripción, los tres tipos de horas formativas, fechas de inicio, fin, nivel.
              • Establecer el valor de sus propiedades.
              • Obtener el valor de alguna propiedad.
              • Copia de objetos.
              • Representación del objeto en cadena de caracteres.
      2. El objeto Socio consiste en:
          a) Propiedades: nif, nombre, apellidos, direccion, fecha alta, disponibilidad (mañana, tarde), actividadFormacion
          b) Métodos:
              • Constructor: Parámetros con valor inicial de todas sus propiedades excepto dirección.
              • Establecer el valor de sus propiedades.
              • Calcular la antigüedad.
              • Obtener el valor de sus propiedades.
              • Copia de objetos.
              • Representación del objeto en cadena de caracteres.
      3. El objeto Inscrito consiste en:
          a) Propiedades: nif, nombre, apellidos, dirección, fechaInscripcion, actividadFormacion
          b) Métodos:
              • Constructor: Parámetros con valor inicial de sus propiedades excepto dirección.
              • Establecer el valor de sus propiedades.
              • Obtener el valor de sus propiedades.
              • Copia de objetos.
              • Representación del objeto en cadena de caracteres.
      4. La interfaz DatosFormacion se implementa en los objetos Socio e Inscrito. Consiste
      en:
          a) Método obtenerPrecio(). Calcula y devuelve el precio de la actividad de formación.
          Para socios es:
              • Si tiene menos de 3 años de antigüedad: 20 € por hora (presencial y online).
              • Más de 3 años y menos de 6: 10 € por hora (presencial y online).
              • Si tiene más de 6 años 5 € por hora presencial. Resto de horas gratis.
          Para inscritos:
              • 50 € por hora presencial y 30 € por hora online.
          b) Método asignarHorario(). Devuelve una cadena de caracteres con el horario de la actividad de formación.
          Para socios es:
              • Horas presenciales: Si están entre 100 y 200: De lunes a viernes 9:00 a 13:00 si tiene disponibilidad de mañana. De lunes a viernes 16:00 a 20:00 si tiene disponibilidad de tarde. Sí son inferiores a 100, de 9:00 a 11:00 y de 16:00 a 18:00 según disponibilidad.
              • Horas online: Sí están entre 50 y 100: sábados y domingos de 9:00 a 12:00. Si son inferiores a 50 sábados de 8:00 a 10:00
          Para inscritos es:
              • Horas presenciales: De lunes a sábado 9:00 a 12:00 si el nivel es A o B. Si el nivel es C de 10:00 a 14:00 y de 16:00 a 20:00.
              • Horas online: Si el nivel es A: domingos de 9:00 a 12:00. Si el nivel es B o C domingos de 16:00 a 19:00.
*/
public class Main {
    public static void main(String[] args) {

        // ActividadFormacion 1 usando el primer constructor.
        ActividadFormacion af1 = new ActividadFormacion(1, "Curso de Inglés", "Empezando desde 0, aprenderemos sobre el idioma.", 100, 30, 20, 37,LocalDate.of(2022, 8, 10), LocalDate.of(2023, 8, 10));
        System.out.println("- Actividad: " + af1.getTitulo() + "\n" +
                           "- Descripción: " + af1.getDescripcion() + "\n" +
                           "- Nº de horas presenciales: " + af1.getNumeroHorasPresenciales() + "\n" +
                           "- Nº de horas no presenciales: " + af1.getNumeroHorasNoPresenciales() + "\n" +
                           "- Nº de horas online: " + af1.getNumeroHorasOnline() + "\n");

        // ActividadFormacion 2 usando el segundo constructor.
        ActividadFormacion af2 = new ActividadFormacion(2, "En este curso de programación se aprenderá desde lo más básico hasta lo más complejo", 160, 10, 80, LocalDate.of(2022, 12, 11), LocalDate.of(2023, 12, 11), "A");
        System.out.println("- Descripción: " + af2.getDescripcion() + "\n" +
                           "- Nº de horas presenciales: " + af2.getNumeroHorasPresenciales() + "\n" +
                           "- Nº de horas no presenciales: " + af2.getNumeroHorasNoPresenciales() + "\n" +
                           "- Nº de horas online: " + af2.getNumeroHorasOnline() + "\n" +
                           "- Fecha de inicio: " + af2.getFechaInicio() + "\n" +
                           "- Fecha de fin: " + af2.getFechaFin() + "\n");

        // Socio 1.
        Socio s1 = new Socio("31888094C", "Alberto", "Sánchez Barona", LocalDate.of(2022, 2, 13), "mañana", af2);

        // Socio 2.
        Socio s2 = new Socio("31888093L", "Andrea", "Sánchez Barona", LocalDate.of(2022, 2, 13), "tarde", af1);

        // Antigüedad Socio 1.
        System.out.println("La antigüedad del socio " + s1.getNombre() + " " + s1.getApellidos() + " es de " + s1.getAntiguedad() + " meses e impartirá: " + "\n" +
                            af2);

        // Antigüedad Socio 2.
        System.out.println("La antigüedad del socio " + s2.getNombre() + " " + s2.getApellidos() + " es de " + s2.getAntiguedad() + " meses e impartirá: " + "\n" +
                af1);

        // Inscrito 1.
        Inscrito i1 = new Inscrito("31000001A", "Juan", "Castro Blancat", LocalDate.of(2023, 1, 15), af2);

        // Inscrito 2.
        Inscrito i2 = new Inscrito("32000002B", "Pedro", "Pérez Pérez", LocalDate.of(2023, 1, 17), af1);

        // Inscrito 3.
        Inscrito i3 = new Inscrito("33000003C", "María", "Parra González", LocalDate.of(2023, 2, 15), af1);

        // Mostramos a los inscritos.
        System.out.println("Esta es la lista de los usuarios inscritos y sus respectivos cursos:" + "\n" +
                           " - Inscrito 1 -> " + i1.getNombre() + " " + i1.getApellidos() + " - " + i1.getActividadFormacion().getTitulo() + "\n" +
                           " - Inscrito 2 -> " + i2.getNombre() + " " + i2.getApellidos() + " - " + i2.getActividadFormacion().getTitulo() + "\n" +
                           " - Inscrito 3 -> " + i3.getNombre() + " " + i3.getApellidos() + " - " + i3.getActividadFormacion().getTitulo() + "\n");

        // Copiamos objetos.
        // Copiamos la ActividadFormacion "af1" a la nueva ActividadFormacion "af3".
        ActividadFormacion af3 = af1;
        System.out.println("El título de la Actividad / Formación 1 es: " + af1.getTitulo());
        System.out.println("El título de la Actividad / Formación 3 es: " + af3.getTitulo());

        // Cambiamos el título a "af3".
        af1.setTitulo("Curso de Matemáticas");
        System.out.println("El título de la Actividad / Formación 1 es: " + af1.getTitulo());
        System.out.println("El título de la Actividad / Formación 3 es: " + af3.getTitulo() + "\n");

        // Comparamos la posición de memoria de las variables.
        if( af1 == af3 ){
            System.out.println("af1 y af3 están apuntando al mismo objeto. \n");
        }

        // Ahora copiamos ActividadFormacion "aft" a la nueva ActividadFormacion "af4" pero con la copia de objetos.
        ActividadFormacion af4 = af1.copiaActividadFormacion();

        System.out.println("El título de la Actividad / Formación 1 es: " + af1.getTitulo());
        System.out.println("El título de la Actividad / Formación 4 es: " + af4.getTitulo());
        af1.setTitulo("Curso de Tecnología");
        System.out.println("El título de la Actividad / Formación 1 es: " + af1.getTitulo());
        System.out.println("El título de la Actividad / Formación 4 es: " + af4.getTitulo() + "\n");

        // Volvemos a comprobar las posición de memoria.
        if( af1 == af4 ){
            System.out.println("af1 y af6 están apuntando al mismo objeto.");
        }
        else {
            System.out.println("af1 y af6 son objetos diferentes.");
        }

        // Clonación de más objetos.
        Inscrito i4 = i1.copiarInscrito();
        System.out.println("\nEl nombre del inscrito 1 es: " + i1.getNombre() + " " + i1.getApellidos());
        System.out.println("El nombre del inscrito 4 es: " + i4.getNombre() + " " + i4.getApellidos());

        i1.setNombre("Pablo");
        i1.setApellidos("González Pérez");

        System.out.println("\nEl nombre del inscrito 1 es: " + i1.getNombre() + " " + i1.getApellidos());
        System.out.println("El nombre del inscrito 4 es: " + i4.getNombre() + " " + i4.getApellidos() + "\n");

        if( i1 == i4 ){
            System.out.println("i1 e i4 están apuntando al mismo objeto.");
        }
        else {
            System.out.println("i1 e i4 son objetos diferentes.");
        }

        // Probamos el método obtenerPrecio()
        ActividadFormacion afS1 = new ActividadFormacion(3, "Clase de Música", "Se impartirá clases de música con diferentes instrumentos musicales", 30, 10, 4, 10, LocalDate.of(2023, 2, 17), LocalDate.of(2024, 2, 17));
        DatosFormacion socio1 = new Socio("30000009K", "Carlos", "Fernández López", LocalDate.of(2022, 2, 13), "tarde", afS1);
        ActividadFormacion afI1 = new ActividadFormacion(4, "Clase de Arte", "Se impartirá clase de Arte contemporáneo a los alumnos.", 50, 60, 7, 19, LocalDate.of(2023, 2, 17), LocalDate.of(2024, 2, 17));
        DatosFormacion inscrito1 = new Inscrito("35000006E", "Laura", "Castro Luque", LocalDate.of(2023, 1, 17), afI1);

        socio1.obtenerPrecioSocio(afS1);
        inscrito1.obtenerPrecioInscrito(afI1);

        System.out.println("\nEl precio para las diferentes horas del socio 1 son: \n" +
                           "    - Precio total horas presenciales:  " + afS1.getObtenerPrecioSocio() + "\n");
    }
}