/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author Emanuel
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto;
    
    public Pasaporte(String numero, String fechaEmision, Titular titular, String rutaFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        this.foto = new Foto(rutaFoto, formatoFoto);
        titular.setPasaporte(this);
    }
    
    public String getNumero() { return numero; }
    public String getFechaEmision() { return fechaEmision; }
    public Titular getTitular() { return titular; }
    public Foto getFoto() { return foto; }
    
    @Override
    public String toString() {
        return "Pasaporte{numero='" + numero + "', fechaEmision='" + fechaEmision + "'}";
    }
}
