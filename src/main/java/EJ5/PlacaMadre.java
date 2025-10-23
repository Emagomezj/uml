/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ5;

/**
 *
 * @author Emanuel
 */
public class PlacaMadre {
    private String modelo;
    private String fabricante;
    
    public PlacaMadre(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
    
    public String getModelo() { return modelo; }
    public String getFabricante() { return fabricante; }
    
    @Override
    public String toString() {
        return "PlacaMadre{modelo='" + modelo + "', fabricante='" + fabricante + "'}";
    }
}
