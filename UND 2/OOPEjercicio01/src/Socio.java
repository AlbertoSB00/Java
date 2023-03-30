import java.time.LocalDate;
import java.time.Period;

public class Socio implements Cloneable, DatosFormacion {

    // Propiedades.
    private String nif;
    private String nombre;
    private String apellidos;
    private String direccion;
    private LocalDate fechaAlta;
    private String disponibilidad;
    private ActividadFormacion actividadFormacion;

    // Constructor.
    public Socio(String nif, String nombre, String apellidos, LocalDate fechaAlta, String disponibilidad, ActividadFormacion actividadFormacion){
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.disponibilidad = disponibilidad;
        this.actividadFormacion = actividadFormacion;
    }

    // Métodos get & set.

    // String nif
    public String getNif(){ return nif; }
    public void setNif( String nif ){ this.nif = nif; }

    // String nombre
    public String getNombre(){ return nombre; }
    public void setNombre( String nombre ){ this.nombre = nombre; }

    // String apellidos
    public String getApellidos(){ return apellidos; }
    public void setApellidos( String apellidos ){ this.apellidos = apellidos; }

    // LocalDate fechaAlta
    public LocalDate getFechaAlta(){ return fechaAlta; }
    public void setFechaAlta( LocalDate fechaAlta ){ this.fechaAlta = fechaAlta; }

    // String disponibilidad
    public String getDisponibilidad(){ return disponibilidad; }
    public void setDisponibilidad( String disponibilidad ){ this.disponibilidad = disponibilidad; }

    // ActividadFormacion actividadFormacion
    public ActividadFormacion getActividadFormacion(){ return actividadFormacion; }
    public void setActividadFormacion( ActividadFormacion actividadFormacion ){ this.actividadFormacion = actividadFormacion; }

    // Otros métodos.
    public int getAntiguedad() {
        LocalDate fechaAlta = this.getFechaAlta();
        LocalDate fechaInicio = this.getActividadFormacion().getFechaInicio();
        int antiguedad = Period.between(fechaAlta, fechaInicio).getMonths();
        return antiguedad;
    }

    public void obtenerPrecioSocio( ActividadFormacion af ){
        if( af.getAntiguedad() < 36){
            float precioHorasPresenciales = af.getNumeroHorasPresenciales() * 20;
            float precioHorasOnline = af.getNumeroHorasOnline() * 20;
        }

        if( af.getAntiguedad() >= 36 && af.getAntiguedad() < 72 ){
            float precioHorasPresenciales = af.getNumeroHorasPresenciales() * 10;
            float precioHorasOnline = af.getNumeroHorasOnline() * 10;
        }

        if( af.getAntiguedad() >= 72 ){
            float precioHorasPresenciales = af.getNumeroHorasPresenciales() * 5;
            float precioHorasOnline = 0;
            float precioHorasNoPresenciales = 0;
        }
    }

    // Copia de objetos.
    public Socio copiarSocio(){
        try{
            return (Socio) this.clone();
        }
        catch ( CloneNotSupportedException cnse ){
            System.out.println("La clase no tiene implementada la interfaz Cloneable.");
            return null;
        }
    }

    // Método toString.
    public String toString(){
        return "- Socio: " + this.nif + "\n" +
               "- Nombre: " + this.nombre + "\n" +
               "- Apellidos: " + this.apellidos + "\n" +
               "- Dirección: " + this.direccion + "\n" +
               "- Fecha de alta: " + this.fechaAlta + "\n" +
               "- Disponibilidad: " +this.disponibilidad + "\n" +
               "- Actividad / Formación: " + this.actividadFormacion + "\n";
    }
}