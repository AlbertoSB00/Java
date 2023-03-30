// Proyecto: ExRA4-17
// Archivo: DatosSeguridad.java
// Autor: Alberto Sánchez Barona
// Fecha: 09-03-2023

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatosSeguridad implements Cloneable {

    // Properties.
    private LocalDate fechaUltimoCambio;
    private Period periodoMinimoCambio;

    // Static properties.
    public static final int LONGITUD_MINIMA_CLAVE = 6;
    public static final int TIPOS_CARACTERES_DIFERENTES = 3;
    public static final int LONGITUD_PIN = 4;

    // Constructor.
    public DatosSeguridad( LocalDate fechaUltimoCambio, Period periodoMinimoCambio ){
        this.fechaUltimoCambio = fechaUltimoCambio;
        this.periodoMinimoCambio = periodoMinimoCambio;
    }

    // Get & Set Methods.
    public LocalDate getFechaUltimoCambio(){ return this.fechaUltimoCambio; }
    public void setFechaUltimoCambio( LocalDate fechaUltimoCambio ){ this.fechaUltimoCambio = fechaUltimoCambio; }

    public Period getPeriodoMinimoCambio(){ return this.periodoMinimoCambio; }
    public void setPeriodoMinimoCambio( Period periodoMinimoCambio ){ this.periodoMinimoCambio = periodoMinimoCambio; }

    // toString() Method.
    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        return "- Fecha desde el último cambio: " + this.fechaUltimoCambio.format(dtf) + "\n" +
               "- Periodo mínimo de cambio: " + this.fechaUltimoCambio.plusDays(10).format(dtf);
    }

    // cloneDatosSeguridad() Method.
    public DatosSeguridad cloneDatosSeguridad(){
        try{
            return (DatosSeguridad) this.clone();
        }
        catch (CloneNotSupportedException cnse){
            System.out.println("Esta clase no soporta la clonación de objetos.");
            return null;
        }
    }

    // Other Methods.
    public void calculoPeriodoTiempo(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate hoy = LocalDate.now();
        LocalDate fechaDisponibilidad = hoy.plusDays(10);
    }
}
