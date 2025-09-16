/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico5;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

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
    
    
    
    public  static void agregarContacto(int dni,String nombre,String ciudad,String direccion,Long numero,String apellido){
        
        Contacto contacto = new Contacto(dni,nombre,ciudad,direccion,apellido);
        ListaDeContactos.put(numero, contacto);
        JOptionPane.showMessageDialog(null, "Contacto cargado");
        
    };
    
    public static ArrayList<Contacto> buscarContactoPorApellido(String apellido){
        
        ArrayList<Contacto> lista = new ArrayList<Contacto>();
        
        for(Map.Entry<Long,Contacto> entry : ListaDeContactos.entrySet()){
            
            if(apellido.equalsIgnoreCase( entry.getValue().getApellido())){
                lista.add(entry.getValue());
            }
        }
        
        
        return lista;
        
    };
    
    
    public static ArrayList<Contacto> buscarContacto(int dni){
        
        ArrayList<Contacto> lista = new ArrayList<Contacto>();
        
        for(Map.Entry<Long,Contacto> entry : ListaDeContactos.entrySet()){
            
            if(dni == entry.getValue().getDNI()){
                lista.add(entry.getValue());
            }
        }
        
        
        return lista;
        
    };
    
    public static Long buscarTelefonoPorDni(int dni){
        
        Long aux2 = null;
           for(Map.Entry<Long,Contacto> entry : ListaDeContactos.entrySet()){
            
            if(dni == entry.getValue().getDNI()){
                aux2 = entry.getKey();
            }
        } 
       return aux2;     
     };
    
    public static ArrayList<Contacto> buscarContactos(String ciudad){
        ArrayList<Contacto> lista = new ArrayList<Contacto>();
        for(Map.Entry<Long,Contacto> entry : ListaDeContactos.entrySet()){
             
            if(ciudad.equalsIgnoreCase(entry.getValue().getCiudad())){
                lista.add(entry.getValue());
            }
        }
        return lista;
    };
    
    public static void borrarContacto(int dni){
        Long aux = buscarTelefonoPorDni(dni);
        
        ListaDeContactos.remove(aux);
        JOptionPane.showMessageDialog(null, " contacto borrado");
        
    };
    
}
