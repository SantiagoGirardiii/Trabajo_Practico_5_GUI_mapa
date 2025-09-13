/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico5;

/**
 *
 * @author santiago10
 */
public class Contacto {
    
    private int DNI;
    private String nombre;
    private String ciudad;
    private String direccion;

    public Contacto(int DNI, String nombre, String ciudad, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
    
}
