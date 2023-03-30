import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MovimientoBancario {
    private int tipo;
    private LocalDate fecha;
    private String concepto;
    private float cantidad;

    public static final int INGRESO = 1;
    public static final int REINTEGRO = 2;

    public MovimientoBancario(int tipo, LocalDate fecha, String concepto, float cantidad){
        this.setTipo(tipo);
        this.fecha = fecha;
        this.concepto = concepto;
        this.cantidad = cantidad;
    }

    public int getTipo(){ return this.tipo; }
    public void setTipo( int tipo ){
        switch (tipo){
            case 1:{
                this.tipo = MovimientoBancario.INGRESO;
                break;
            }
            case 2:{
                this.tipo = MovimientoBancario.REINTEGRO;
                break;
            }
        }
    }

    public LocalDate getFecha(){ return this.fecha; }
    public void setFecha( LocalDate fecha ){ this.fecha = fecha; }

    public String getConcepto(){ return this.concepto; }
    public void setConcepto( String concepto ){ this.concepto = concepto; }

    public float getCantidad(){ return this.cantidad; }
    public void setCantidad( float cantidad ){ this.cantidad = cantidad; }

    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");

        return "Datos movimiento bancario: \n" +
                "Tipo -> " + this.tipo + "\n" +
                "Fecha -> " + this.fecha.format(dtf) + "\n" +
                "Concepto -> " + this.concepto + "\n" +
                "Cantidad -> " + this.cantidad + " €";
    }

}