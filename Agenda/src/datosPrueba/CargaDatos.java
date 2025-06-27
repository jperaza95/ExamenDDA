/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosPrueba;

import logica.Logica;
import logica.TipoContacto;
import logica.Usuario;

/**
 *
 * @author peraza
 */
public class CargaDatos {
    
    
    
    public static void ejecutar(){
        
        Logica logica = Logica.getInstancia();
        logica.agregar(new Usuario("a","a","Ana"));
        logica.agregar(new Usuario("b","b","Beatriz"));
        logica.agregar(new Usuario("c","c","Carlos"));

        
        
        logica.agregar(new TipoContacto("Particular"));
        logica.agregar(new TipoContacto("Laboral"));
        logica.agregar(new TipoContacto("Familiar"));
        
       
        
    }
}
