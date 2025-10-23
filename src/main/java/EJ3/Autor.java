/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author Emanuel
 */
public class Autor {
    private String nombre;
    private String pais;
    
    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public String getNombre() { return nombre; }
    public String getPais() { return pais; }
    
    @Override
    public String toString() {
        return "Autor{nombre='" + nombre + "', pais='" + pais + "'}";
    }
}
