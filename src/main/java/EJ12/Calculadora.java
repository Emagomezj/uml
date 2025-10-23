/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ12;

/**
 *
 * @author Emanuel
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double total = impuesto.getMonto() * 1.21; // IVA 21%
        System.out.println("💰 Impuesto calculado: $" + impuesto.getMonto() + " + IVA 21% = $" + total);
    }
}
