/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico5;

import java.util.ArrayList;
import java.util.Map;
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
    
    public static ArrayList<Contacto> buscarContacto(String apellido){
        
        ArrayList<Contacto> lista = new ArrayList<Contacto>();
        
        for(Map.Entry<Long,Contacto> entry : ListaDeContactos.entrySet()){
            
            if(apellido.equalsIgnoreCase( entry.getValue().getApellido())){
                lista.add(entry.getValue());
            }
        }
        
        
        return lista;
        
    };
    
    public  static Long buscarTelefono(int dni){
        
        Long aux2 = null;
           for(Map.Entry<Long,Contacto> entry : ListaDeContactos.entrySet()){
            
            if(dni == entry.getValue().getDNI()){
                aux2 = entry.getKey();
            }
        } 
       return aux2;     
     };
    
    public ArrayList<Contacto> buscarContactos(String ciudad){
        ArrayList<Contacto> lista = new ArrayList<Contacto>();
        for(Map.Entry<Long,Contacto> entry : ListaDeContactos.entrySet()){
             
            if(ciudad == entry.getValue().getCiudad()){
                lista.add(entry.getValue());
            }
        }
        return lista;
    };
    
    public void borrarContacto(
            
            
            
            
    ){};
    
}
