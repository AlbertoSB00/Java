import java.time.LocalDate;
import java.time.Period;

public class ONG implements Cloneable, DesarrolloProyecto {
    // Properties.
    private int numeroRegistro;
    private String nombre;
    private String direccion;
    private String email;
    private String urlWeb;
    private Proyecto proyecto;

    // Constructor.
    public ONG(int numeroRegistro, String nombre, String direccion, String email, String urlWeb, Proyecto proyecto){
        this.numeroRegistro = numeroRegistro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.urlWeb = urlWeb;
        this.proyecto = proyecto;
    }

    // Get & Set Methods.

    // int numeroRegistro
    public int getNumeroRegistro(){ return this.numeroRegistro; }
    public void setNumeroRegistro( int numeroRegistro ){ this.numeroRegistro = numeroRegistro; }

    // String nombre
    public String getNombre(){ return this.nombre; }
    public void setNombre( String nombre ){ this.nombre = nombre; }

    // String direccion
    public String getDireccion(){ return this.direccion; }
    public void setDireccion( String direccion ){ this.direccion = direccion; }

    // String email
    public String getEmail(){ return this.email; }
    public void setEmail( String email ){ this.email = email; }

    // String urlWeb
    public String getUrlWeb(){ return this.urlWeb; }
    public void setUrlWeb( String urlWeb ){ this.urlWeb = urlWeb; }

    // Proyecto proyecto
    public Proyecto getProyecto(){ return this.proyecto; }
    public void setProyecto( Proyecto proyecto ){ this.proyecto = proyecto; }

    // toString() Method.
    public String toString(){
        return "- Número de registro: " + this.numeroRegistro + "\n" +
               "- Nombre: " + this.nombre + "\n" +
               "- URL web: " + this.urlWeb + "\n" +
               "- Proyecto: " + this.proyecto;
    }

    // cloneONG() Method.
    public ONG cloneONG(){
        try {
            return (ONG) this.clone();
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

        if( this.proyecto.getPresupuesto() < Proyecto.PRESUPUESTO_ONG ){
            if( periodoProyecto.getYears() < 1 ){
                aportacion = 0.8f;
                subvencion = this.proyecto.getPresupuesto() * aportacion;
            }
            if ( periodoProyecto.getYears() < 2 ) {
                aportacion = 0.7f;
                subvencion = this.proyecto.getPresupuesto() * aportacion;
            }
            if ( periodoProyecto.getYears() >= 2 ) {
                aportacion = 0.6f;
                subvencion = this.proyecto.getPresupuesto() * aportacion;
            }
        }
        else {
            if( periodoProyecto.getYears() < 3 ){
                aportacion = 0.6f;
                subvencion = this.proyecto.getPresupuesto() * aportacion;
            }
            if( periodoProyecto.getYears() > 3 ){
                aportacion = 0.75f;
                subvencion = this.proyecto.getPresupuesto() * aportacion;
            }
        }
        float coste = this.proyecto.getPresupuesto() - subvencion;
        return coste;
    }

    public void asignarPlanAportacion(){

    }
}