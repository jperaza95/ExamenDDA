/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosPrueba;

import modelo.Administrador;
import modelo.Modelo;
import modelo.TipoContacto;
import modelo.TipoTelefono;
import modelo.UsuarioAgenda;

/**
 *
 * @author peraza
 */
public class CargaDatos {
    
    
    
    public static void ejecutar(){
        
        Modelo logica = Modelo.getInstancia();
        logica.agregar(new UsuarioAgenda("a","a","Ana"));
        logica.agregar(new UsuarioAgenda("b","b","Beatriz"));
        logica.agregar(new UsuarioAgenda("c","c","Carlos"));
        
        logica.agregar(new Administrador("z","z","Zulma"));
        logica.agregar(new Administrador("x","x","Xavier"));
        logica.agregar(new Administrador("y","y","Yildiz"));
        


        logica.agregar(new TipoContacto("Particular"));
        logica.agregar(new TipoContacto("Laboral"));
        logica.agregar(new TipoContacto("Familiar"));
        
        logica.agregar(new TipoTelefono("Fijo"));
        logica.agregar(new TipoTelefono("Celular"));
        logica.agregar(new TipoTelefono("Internacional"));
        
       
        
    }
}
