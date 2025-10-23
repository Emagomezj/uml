/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ13;

/**
 *
 * @author Emanuel
 */
public class CodigoQR {
    private String id;
    private Usuario usuario;
    
    public CodigoQR(String id, Usuario usuario) {
        this.id = id;
        this.usuario = usuario;
    }
    
    public void mostrarInfo() {
        System.out.println("📱 Código QR: " + id + " - Usuario: " + usuario.getNombre());
    }
    
    public String getId() { return id; }
    public Usuario getUsuario() { return usuario; }
    
    @Override
    public String toString() {
        return "CodigoQR{id='" + id + "'}";
    }
}
