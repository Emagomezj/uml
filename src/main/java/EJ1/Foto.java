/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author Emanuel
 */
public class Foto {
    private String ruta;
    private String formato;
    
    public Foto(String ruta, String formato) {
        this.ruta = ruta;
        this.formato = formato;
    }
    
    public String getRuta() { return ruta; }
    public String getFormato() { return formato; }
    
    @Override
    public String toString() {
        return "Foto{ruta='" + ruta + "', formato='" + formato + "'}";
    }
}
