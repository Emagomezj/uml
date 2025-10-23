/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ5;

/**
 *
 * @author Emanuel
 */
public class Computadora {
    private String marca;
    private String serial;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    public Computadora(String marca, String serial, String modeloPlaca, String fabricantePlaca, Propietario propietario) {
        this.marca = marca;
        this.serial = serial;
        this.placaMadre = new PlacaMadre(modeloPlaca, fabricantePlaca);
        this.propietario = propietario;
        propietario.setComputadora(this);
    }
    
    public String getMarca() { return marca; }
    public String getSerial() { return serial; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }
    
    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', serial='" + serial + "'}";
    }
}
