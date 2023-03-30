import java.time.LocalDate;

public class Inscrito implements Cloneable, DatosFormacion {

    // Propiedades.
    private String nif;
    private String nombre;
    private String apellidos;
    private String direccion;
    private LocalDate fechaInscripcion;
    private ActividadFormacion actividadFormacion;

    // Constructor.
    public Inscrito(String nif, String nombre, String apellidos, LocalDate fechaInscripcion, ActividadFormacion actividadFormacion) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaInscripcion = fechaInscripcion;
        this.actividadFormacion = actividadFormacion;
    }

    // Métodos get & set.

    // String nif
    public String getNif(){ return nif; }
    public void setNif( String nif ) { this.nif = nif; }

    // String nombre
    public String getNombre(){ return nombre; }
    public void setNombre( String nombre ){ this.nombre = nombre; }

    // String apellidos
    public String getApellidos(){ return apellidos; }
    public void setApellidos( String apellidos ){ this.apellidos = apellidos; }

    // String direccion
    public String getDireccion(){ return direccion; }
    public void setDireccion( String direccion ){ this.direccion = direccion; }

    // LocalDate fechaInscripcion
    public LocalDate getFechaInscripcion(){ return fechaInscripcion; }
    public void setFechaInscripcion( LocalDate fechaInscripcion ){ this.fechaInscripcion = fechaInscripcion; }

    // ActividadFormacion actividadFormacion
    public ActividadFormacion getActividadFormacion(){ return actividadFormacion; }
    public void setActividadFormacion( ActividadFormacion actividadFormacion ){ this.actividadFormacion = actividadFormacion; }

    // Otros métodos.

    // Copia de objetos.
    public Inscrito copiarInscrito(){
        try{
            return (Inscrito) this.clone();
        }
        catch ( CloneNotSupportedException cnse ){
            System.out.println("La clase no tiene implementada la interfaz Cloneable.");
            return null;
        }
    }

    // Método toString.
    public String toString(){
        return "- Inscrito: " + this.nif + "\n" +
                "- Nombre: " + this.nombre + "\n" +
                "- Apellidos: " + this.apellidos + "\n" +
                "- Dirección: " + this.direccion + "\n" +
                "- Fecha de inscripción: " + this.fechaInscripcion + "\n" +
                "- Actividad / Formación: " + this.actividadFormacion + "\n";
    }
}