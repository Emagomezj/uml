/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ8;

/**
 *
 * @author Emanuel
 */
import java.time.LocalDate;

public class Documento {
    private String nombre;
    private String contenido;
    private FirmaDigital firma;
    
    public Documento(String nombre, String contenido, Usuario usuario) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.firma = new FirmaDigital(generarHash(), obtenerFechaActual(), usuario);
    }
    
    private String generarHash() {
        return "hash_" + System.currentTimeMillis();
    }
    
    private String obtenerFechaActual() {
        return LocalDate.now().toString();
    }
    
    public String getNombre() { return nombre; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }
    
    @Override
    public String toString() {
        return "Documento{nombre='" + nombre + "', contenido='" + contenido.substring(0, Math.min(20, contenido.length())) + "...'}";
    }
}