/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ2;

/**
 *
 * @author Emanuel
 */
public class Bateria {
    private String modelo;
    private int capacidadMAh;
    
    public Bateria(String modelo, int capacidadMAh) {
        this.modelo = modelo;
        this.capacidadMAh = capacidadMAh;
    }
    
    public String getModelo() { return modelo; }
    public int getCapacidadMAh() { return capacidadMAh; }
    
    @Override
    public String toString() {
        return "Bateria{modelo='" + modelo + "', capacidad=" + capacidadMAh + "mAh}";
    }
}
