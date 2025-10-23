/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ14;

/**
 *
 * @author Emanuel
 */
public class Render {
    private String formato;
    private Proyecto proyecto;
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    
    public void procesar() {
        System.out.println("🎬 Renderizando '" + proyecto.getNombre() + "' en formato " + formato);
    }
}