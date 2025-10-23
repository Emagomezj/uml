/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ10;

/**
 *
 * @author Emanuel
 */
public class ClaveSeguridad {
    private String clave;
    private String vencimiento;
    
    public ClaveSeguridad(String clave, String vencimiento) {
        this.clave = clave;
        this.vencimiento = vencimiento;
    }
    
    public String getClave() { return clave; }
    public String getVencimiento() { return vencimiento; }
    
    @Override
    public String toString() {
        return "ClaveSeguridad{clave='" + clave + "', vencimiento='" + vencimiento + "'}";
    }
}
