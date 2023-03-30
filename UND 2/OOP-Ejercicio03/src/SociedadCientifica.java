import javax.sound.sampled.Port;
import java.time.LocalDate;
import java.time.Period;

public class SociedadCientifica implements Cloneable, DesarrolloProyecto {
    // Properties.
    private String nif;
    private String nombre;
    private String actividad;
    private String direccionSocial;
    private LocalDate fechaFundacion;
    private Proyecto proyecto;

    // Constructor.
    public SociedadCientifica(String nif, String nombre, String actividad, String direccionSocial, LocalDate fechaFundacion, Proyecto proyecto){
        this.nif = nif;
        this.nombre = nombre;
        this.actividad = actividad;
        this.direccionSocial = direccionSocial;
        this.fechaFundacion = fechaFundacion;
        this.proyecto = proyecto;
    }

    // Get & Set Methods.

    // String nif
    public String getNif(){ return this.nif; }
    public void setNif( String nif ){ this.nif = nif; }

    // String nombre
    public String getNombre(){ return this.nombre; }
    public void setNombre( String nombre ){ this.nombre = nombre; }

    // String actividad
    public String getActividad(){ return this.actividad; }
    public void setActividad( String actividad ){ this.actividad = actividad; }

    // String direccionSocial
    public String getDireccionSocial(){ return this.direccionSocial; }
    public void setDireccionSocial( String direccionSocial ){ this.direccionSocial = direccionSocial; }

    // LocalDate fechaFundacion
    public LocalDate getFechaFundacion(){ return this.fechaFundacion; }
    public void setFechaFundacion( LocalDate fechaFundacion ){ this.fechaFundacion = fechaFundacion; }

    // Proyecto proyecto
    public Proyecto getProyecto(){ return this.proyecto; }
    public void setProyecto( Proyecto proyecto ){ this.proyecto = proyecto; }

    // toString() Method.
    public String toString(){
        return "- NIF: " + this.nif + "\n" +
               "- Nombre: " + this.nombre + "\n"+
               "- Actividad: " + this.actividad + "\n" +
               "- Proyecto: " + this.proyecto;
    }

    // cloneSociedadCientifica() Method.
    public SociedadCientifica cloneSociedadCientifica(){
        try {
            return (SociedadCientifica) this.clone();
        }
        catch (CloneNotSupportedException cnse){
            System.out.println("Esta clase no soporta el objeto clone.");
            return null;
        }
    }

    // Other Methods.
    public float calcularSubvencion(){
        LocalDate hoy = LocalDate.now();
        Period periodoProyecto = Period.between(this.proyecto.getFechaInicio(), hoy);

        float aportacion = 0;
        float subvencion = 0;

        if( this.proyecto.getPresupuesto() < Proyecto.PRESUPUESTO_SC && this.proyecto.getTipo() == 2){
            aportacion = 0.75f;
            subvencion = this.proyecto.getPresupuesto() * aportacion;
        }
        if( this.proyecto.getPresupuesto() >= Proyecto.PRESUPUESTO_SC && this.proyecto.getTipo() != 2){
            aportacion = 0.65f;
            subvencion = this.proyecto.getPresupuesto() * aportacion;
        }
        float coste = this.proyecto.getPresupuesto() - subvencion;
        return coste;
    }

    public void asignarPlanAportacion(){

    }
}