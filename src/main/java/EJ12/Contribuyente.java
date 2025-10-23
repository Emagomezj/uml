/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ12;

/**
 *
 * @author Emanuel
 */
public class Contribuyente {
    private String nombre;
    private String cuit;
    
    public Contribuyente(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    public String getNombre() { return nombre; }
    public String getCuit() { return cuit; }
    
    @Override
    public String toString() {
        return "Contribuyente{nombre='" + nombre + "', cuit='" + cuit + "'}";
    }
}
