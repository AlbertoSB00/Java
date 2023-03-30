import java.time.LocalDate;

public class ActividadFormacion implements Cloneable {

    // Propiedades.
    private int codigo;
    private String titulo;
    private String descripcion;
    private int numeroHorasPresenciales;
    private int numeroHorasOnline;
    private int numeroHorasNoPresenciales;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String nivel;
    private double precio;
    private String horario;
    private int antiguedad;

    private float obtenerPrecioSocio;
    private float obtenerPrecioInscrito;

    // Constructor.
    public ActividadFormacion(int codigo, String titulo, String descripcion, int numeroHorasPresenciales, int numeroHorasOnline, int numeroHorasNOPresenciales, int antiguedad, LocalDate fechaInicio, LocalDate fechaFin){
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.numeroHorasPresenciales = numeroHorasPresenciales;
        this.numeroHorasOnline = numeroHorasOnline;
        this.numeroHorasNoPresenciales = numeroHorasNOPresenciales;
        this.antiguedad = antiguedad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

    }

    public ActividadFormacion(int codigo, String descripcion, int numeroHorasPresenciales, int numeroHorasOnline, int numeroHorasNOPresenciales, LocalDate fechaInicio, LocalDate fechaFin, String nivel){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.numeroHorasPresenciales = numeroHorasPresenciales;
        this.numeroHorasOnline = numeroHorasOnline;
        this.numeroHorasNoPresenciales = numeroHorasNOPresenciales;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nivel = nivel;
    }

    // Métodos get & set.

    // int codigo
    public int getCodigo(){ return codigo; }
    public void setCodigo( int codigo ){ this.codigo = codigo; }

    // String titulo
    public String getTitulo(){ return titulo; }
    public void setTitulo( String titulo ){ this.titulo = titulo; }

    // String descripcion
    public String getDescripcion(){ return descripcion; }
    public void setDescripcion( String descripcion ){ this.descripcion = descripcion; }

    // int numeroHorasPresenciales
    public int getNumeroHorasPresenciales(){ return numeroHorasPresenciales; }
    public void setNumeroHorasPresenciales( int numeroHorasPresenciales ){ this.numeroHorasPresenciales = numeroHorasPresenciales; }

    // int numeroHorasOnline
    public int getNumeroHorasOnline(){ return numeroHorasOnline; }
    public void setNumeroHorasOnline( int numeroHorasOnline ){ this.numeroHorasOnline = numeroHorasOnline; }

    // int numeroHorasNoPresenciales
    public int getNumeroHorasNoPresenciales(){ return numeroHorasNoPresenciales; }
    public void setNumeroHorasNoPresenciales( int numeroHorasNoPresenciales ){ this.numeroHorasNoPresenciales = numeroHorasNoPresenciales; }

    // int antiguedad
    public int getAntiguedad(){ return antiguedad; }
    public void setAntiguedad( int antiguedad ){ this.antiguedad = antiguedad; }

    // LocalDate fechaInicio
    public LocalDate getFechaInicio(){ return fechaInicio; }
    public void setFechaInicio( LocalDate fechaInicio ){ this.fechaInicio = fechaInicio; }

    // LocalDate fechaFin
    public LocalDate getFechaFin(){ return fechaFin; }
    public void setFechaFin( LocalDate fechaFin ){ this.fechaFin = fechaFin; }

    // String nivel
    public String getNivel(){ return nivel; }
    public void setNivel( String nivel ){ this.nivel = nivel; }

    // double precio
    public double getPrecio(){ return precio; }
    public void  setPrecio( double precio ){ this.precio = precio; }

    // String horario
    public String getHorario(){ return horario; }
    public void setHorario( String horario ){ this.horario = horario; }

    // float obtenerPrecioSocio
    public float getObtenerPrecioSocio(){ return obtenerPrecioSocio; }
    public void setObtenerPrecioSocio( float obtenerPrecioSocio ){ this.obtenerPrecioSocio = obtenerPrecioSocio; }

    // float obtenerPrecioInscrito
    public float getObtenerPrecioInscrito(){ return obtenerPrecioInscrito; }
    public void setObtenerPrecioInscrito( float obtenerPrecioInscrito ){ this.obtenerPrecioInscrito = obtenerPrecioInscrito; }

    // Otros métodos.

    // Copia de objetos.
    public ActividadFormacion copiaActividadFormacion(){
        try{
            return (ActividadFormacion) this.clone();
        }
        catch ( CloneNotSupportedException cnse ){
            System.out.println("La clase no tiene implementada la interfaz Cloneable.");
            return null;
        }
    }

    // Método toString.
    public String toString(){
        return "- Código: " + this.codigo + "\n" +
               "- Actividad / Formación: " + this.titulo + "\n" +
               "- Descripción: " + this.descripcion + "\n" +
               "- Nº de horas presenciales: " + this.numeroHorasPresenciales + "\n" +
               "- Nº de horas no presenciales: " + this.numeroHorasNoPresenciales + "\n" +
               "- Nº de horas online: " + this.numeroHorasOnline + "\n" +
               "- Meses de antigüedad: " + this.antiguedad + "\n" +
               "- Fecha de inicio: " + this.fechaInicio + "\n" +
               "- Fecha de fin: " + this.fechaFin + "\n" +
               "- Nivel: " + this.nivel + "\n" +
               "- Precio: " + this.precio + "\n" + "- Horario: " + this.horario + "\n";
    }
}