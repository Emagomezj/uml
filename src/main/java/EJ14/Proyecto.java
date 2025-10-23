/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ14;

/**
 *
 * @author Emanuel
 */
public class Proyecto {
    private String nombre;
    private int duracionMinutos;
    
    public Proyecto(String nombre, int duracionMinutos) {
        this.nombre = nombre;
        this.duracionMinutos = duracionMinutos;
    }
    
    public String getNombre() { return nombre; }
    public int getDuracionMinutos() { return duracionMinutos; }
    
    @Override
    public String toString() {
        return "Proyecto{nombre='" + nombre + "', duracion=" + duracionMinutos + "min}";
    }
}
