// Proyecto: ExRA4-17
// Archivo: Cliente.java
// Autor: Alberto Sánchez Barona
// Fecha: 09-03-2023

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente implements Cloneable, GestionSeguridad {
    // Properties.
    private String login;
    private String pin;
    private String nombreCompleto;
    private LocalDate fechaAlta;
    private DatosSeguridad datosSeguridad;

    // Constructor.
    public Cliente(String login, String nombreCompleto, LocalDate fechaAlta, DatosSeguridad datosSeguridad){
        this.login = login;
        this.pin = "1234";
        this.nombreCompleto = nombreCompleto;
        this.datosSeguridad = datosSeguridad;
    }

    // Get & Set Methods.
    public String getLogin(){ return this.login; }
    public void setLogin( String login ){ this.login = this.login; }

    public String getNombreCompleto(){ return this.nombreCompleto; }
    public void setNombreCompleto( String nombreCompleto ){ this.nombreCompleto = nombreCompleto; }

    public LocalDate getFechaAlta(){ return this.fechaAlta; }
    public void setFechaAlta( LocalDate fechaAlta ){ this.fechaAlta = fechaAlta; }

    public DatosSeguridad getDatosSeguridad(){ return this.datosSeguridad; }
    public void setDatosSeguridad( DatosSeguridad datosSeguridad ){ this.datosSeguridad = datosSeguridad; }

    // toString() Method.
    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");

        return "- Login: " + this.login + "\n" +
               "- Nombre completo: " + this.nombreCompleto + "\n" +
               "- Fecha de alta: " + this.fechaAlta.format(dtf) + "\n" +
               "- Datos Seguridad: " + this.datosSeguridad;
    }

    // cloneCliente() Method.
    public Cliente cloneCliente(){
        try{
            return (Cliente) this.clone();
        }
        catch (CloneNotSupportedException cnse){
            System.out.println("Esta clase no soporta la clonación de objetos.");
            return null;
        }
    }

    // Other Methods.
    public boolean autenticar(String token){
        if( token.equals(this.pin) ){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean cambiarToken(String tokenAnterior, String tokenNuevo){
        if( tokenAnterior.equals(this.pin) && tokenNuevo.length() == DatosSeguridad.LONGITUD_PIN ){
            this.datosSeguridad.calculoPeriodoTiempo();
            return true;
        }
        else {
            return false;
        }
    }
}
