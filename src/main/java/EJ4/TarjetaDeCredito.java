/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

/**
 *
 * @author Emanuel
 */
public class TarjetaDeCredito {
    private String numero;
    private String vencimiento;
    private Cliente cliente;
    private Banco banco;
    
    public TarjetaDeCredito(String numero, String vencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.vencimiento = vencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this);
    }
    
    public String getNumero() { return numero; }
    public String getVencimiento() { return vencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{numero='" + numero + "', vencimiento='" + vencimiento + "'}";
    }
}
