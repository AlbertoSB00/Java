import java.time.LocalDate;

public class Proyecto implements Cloneable {
    // Properties.
    private String id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String titulo;
    private String descripcion;
    private int tipo;
    private String lugarRealizacion;
    private float presupuesto;
    private float subvencionAsignada;
    private LocalDate fechaAsignacion;
    private float importePrimeraDonacion;
    private float importeFinal;

    // Static properties.
    public static final int COOPERACION = 1;
    public static final int INVESTIGACION = 2;
    public static final int DESARROLLO = 3;
    public static final int PRESUPUESTO_ONG = 50000;
    public static final int PRESUPUESTO_SC = 100000;


    // Constructor.
    public Proyecto(String id, LocalDate fechaInicio, LocalDate fechaFin, String titulo, String descripcion, int tipo, String lugarRealizacion, float presupuesto){
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.setTipo(tipo);
        this.lugarRealizacion = lugarRealizacion;
        this.presupuesto = presupuesto;
    }

    // Get & Set Methods.

    // String id
    public String getId(){ return this.id; }
    public void setId( String id ){ this.id = this.id; }

    // LocalDate fechaInicio
    public LocalDate getFechaInicio(){ return this.fechaInicio; }
    public void setFechaInicio( LocalDate fechaInicio ){ this.fechaInicio = fechaInicio; }

    // LocalDate fechaFin
    public LocalDate getFechaFin(){ return this.fechaFin; }
    public void setFechaFin( LocalDate fechaFin ){ this.fechaFin = fechaFin; }

    // String titulo
    public String getTitulo(){ return this.titulo; }
    public void setTitulo( String titulo ){ this.titulo = titulo; }

    // String descripcion
    public String getDescripcion(){ return this.descripcion; }
    public void setDescripcion( String descripcion ){ this.descripcion = descripcion; }

    // int tipo
    public int getTipo(){ return this.tipo; }
    public void setTipo( int tipo ){
        switch (tipo){
            case 1:{
                this.tipo = Proyecto.COOPERACION;
                break;
            }
            case 2:{
                this.tipo = Proyecto.INVESTIGACION;
                break;
            }
            case 3:{
                this.tipo = Proyecto.DESARROLLO;
                break;
            }
        }
    }

    // String lugarRealizacion
    public String getLugarRealizacion(){ return this.lugarRealizacion; }
    public void setLugarRealizacion( String lugarRealizacion ){ this.lugarRealizacion = lugarRealizacion; }

    // float presupuesto
    public float getPresupuesto(){ return this.presupuesto; }
    public void setPresupuesto( float presupuesto ){ this.presupuesto = presupuesto; }

    // toString() Method.
    public String toString(){
        return "- ID: " + this.id + "\n" +
               "- Título: " + this.titulo + "\n" +
               "- Descripción: " + this.descripcion + "\n" +
               "- Presupuesto: " + this.presupuesto;
    }

    // cloneProyecto() Method.
    public Proyecto cloneProyecto(){
        try{
            return (Proyecto) this.clone();
        }
        catch (CloneNotSupportedException cnse){
            System.out.println("Esta clase no soporte el objeto clone.");
            return null;
        }
    }

    // Other Methods.
}