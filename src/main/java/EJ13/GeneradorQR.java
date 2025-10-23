/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ13;

/**
 *
 * @author Emanuel
 */
public class GeneradorQR {
    public CodigoQR generar(String id, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(id, usuario);
        codigo.mostrarInfo();
        return codigo;
    }
}
