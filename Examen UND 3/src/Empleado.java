// Proyecto: ExRA4-17
// Archivo: Empleado.java
// Autor: Alberto Sánchez Barona
// Fecha: 09-03-2023

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado implements Cloneable, GestionSeguridad {

    // Properties.
    private String nif;
    private String clave;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private DatosSeguridad datosSeguridad;

    // Constructor.
    public Empleado(String nif, String nombreCompleto, LocalDate fechaNacimiento, DatosSeguridad datosSeguridad){
        this.nif = nif;
        this.clave = "abc123";
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;

        LocalDate hoy = LocalDate.now();
        if( this.fechaNacimiento.isBefore(hoy) ){
            this.fechaNacimiento = fechaNacimiento;
        }
        else {
            System.out.println("La fecha de nacimiento no puede ser del futuro.");
            System.exit(1);
        }

        this.datosSeguridad = datosSeguridad;
    }

    // Get & Set Methods.
    public String getNif(){ return this.nif; }
    public void setNif( String nif ){ this.nif = nif; }

    public String getNombreCompleto(){ return this.nombreCompleto; }
    public void setNombreCompleto( String nombreCompleto ){ this.nombreCompleto = nombreCompleto; }

    public LocalDate getFechaNacimiento(){ return this.fechaNacimiento; }
    public void setFechaNacimiento( LocalDate fechaNacimiento ){
        LocalDate hoy = LocalDate.now();
        if( this.fechaNacimiento.isBefore(hoy) ){
            this.fechaNacimiento = fechaNacimiento;
        }
        else {
            System.out.println("La fecha de nacimiento no puede ser del futuro.");
            System.exit(1);
        }
    }

    public DatosSeguridad getDatosSeguridad(){ return this.datosSeguridad; }
    public void setDatosSeguridad( DatosSeguridad datosSeguridad ){ this.datosSeguridad = datosSeguridad; }

    // toString() Method.
    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");

        return "- NIF: " + this.nif + "\n" +
               "- Nombre completo: " + this.nombreCompleto + "\n" +
               "- Fecha de nacimiento: " + this.fechaNacimiento.format(dtf) + "\n" +
               "- Datos Seguridad: " + this.datosSeguridad;
    }

    // cloneEmpleado() Method.
    public Empleado cloneEmpleado(){
        try {
            return (Empleado) this.clone();
        }
        catch (CloneNotSupportedException cnse){
            System.out.println("Esta clase no soporta la clonación de objetos.");
            return null;
        }
    }

    // Other Methods.
    public boolean autenticar(String token){
        if( token.equals(this.clave) ){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean cambiarToken(String tokenAnterior, String tokenNuevo){
        if( tokenAnterior.equals(this.clave) && tokenNuevo.length() >= DatosSeguridad.LONGITUD_MINIMA_CLAVE ){
            this.datosSeguridad.calculoPeriodoTiempo();
            return true;
        }
        else {
            return false;
        }
    }
}
