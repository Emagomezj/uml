/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author Emanuel
 */
public class Editorial {
    private String nombre;
    private String ciudad;
    
    public Editorial(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    
    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    
    @Override
    public String toString() {
        return "Editorial{nombre='" + nombre + "', ciudad='" + ciudad + "'}";
    }
}
