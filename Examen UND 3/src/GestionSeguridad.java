// Proyecto: ExRA4-17
// Archivo: GestionSeguridad.java
// Autor: Alberto Sánchez Barona
// Fecha: 09-03-2023

public interface GestionSeguridad {
    public boolean autenticar(String token);
    public boolean cambiarToken(String tokenAnterior, String tokenNuevo);
}
