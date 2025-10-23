/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ10;

/**
 *
 * @author Emanuel
 */
public class CuentaBancaria {
    private String numero;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;
    
    public CuentaBancaria(String numero, double saldo, String clave, String vencimiento, Titular titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(clave, vencimiento);
        this.titular = titular;
        titular.setCuenta(this);
    }
    
    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public Titular getTitular() { return titular; }
    
    @Override
    public String toString() {
        return "CuentaBancaria{numero='" + numero + "', saldo=" + saldo + "}";
    }
}
