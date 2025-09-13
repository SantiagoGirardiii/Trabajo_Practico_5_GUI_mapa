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
    
    TreeMap<Long,Contacto> ListaDeContactos = new TreeMap<>();
    
    public void agregarContacto(int dni,String nombre,String ciudad,String direccion,Long numero){
        
        Contacto contacto = new Contacto(dni,nombre,ciudad,direccion);
        
        ListaDeContactos.put(numero, contacto);
        
    };
    
    public void buscarContacto(){};
    
    public void buscarTelefono(){};
    
    public void buscarContactos(){};
    
    public void borrarContacto(){};
    
}
