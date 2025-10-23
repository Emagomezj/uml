/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ8;

/**
 *
 * @author Emanuel
 */
public class FirmaDigital {
    private String hash;
    private String fecha;
    private Usuario usuario;
    
    public FirmaDigital(String hash, String fecha, Usuario usuario) {
        this.hash = hash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    public String getHash() { return hash; }
    public String getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }
    
    @Override
    public String toString() {
        return "FirmaDigital{hash='" + hash + "', fecha='" + fecha + "'}";
    }
}
