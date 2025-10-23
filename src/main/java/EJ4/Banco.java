/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

/**
 *
 * @author Emanuel
 */
public class Banco {
    private String nombre;
    private String cbu;
    
    public Banco(String nombre, String cbu) {
        this.nombre = nombre;
        this.cbu = cbu;
    }
    
    public String getNombre() { return nombre; }
    public String getCbu() { return cbu; }
    
    @Override
    public String toString() {
        return "Banco{nombre='" + nombre + "', cbu='" + cbu + "'}";
    }
}