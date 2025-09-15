/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico5;

import java.util.TreeMap;

/**
 *
 * @author santiago10
 */
public class DirectorioTelefonico {
    
    public static TreeMap<Long,Contacto> ListaDeContactos = new TreeMap<>();

    public DirectorioTelefonico() {
    }

    public void setListaDeContactos(TreeMap<Long, Contacto> ListaDeContactos) {
        this.ListaDeContactos = ListaDeContactos;
    }

    public static TreeMap<Long, Contacto> getListaDeContactos() {
        return ListaDeContactos;
    }
    
    
    
    public void agregarContacto(int dni,String nombre,String ciudad,String direccion,Long numero,String apellido){
        
        Contacto contacto = new Contacto(dni,nombre,ciudad,direccion,apellido);
        ListaDeContactos.put(numero, contacto);
        
    };
    
    public void buscarContacto(){
        
    };
    
    public void buscarTelefono(){};
    
    public void buscarContactos(){};
    
    public void borrarContacto(
            
            
            
            
    ){};
    
}
