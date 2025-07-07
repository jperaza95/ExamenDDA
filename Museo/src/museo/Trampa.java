/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import utilidades.Observable;
import utilidades.Observador;

/**
 *
 * @author julio
 */
public class Trampa implements Observador{
    private void abrir(){
        System.out.println("ABRIR!!");
    }
    private void cerrar(){
        System.out.println("CERRAR!!");
    }    
    
    @Override
    
    public void actualizar(Observable origen, Object evento){
        Sensor.Eventos evt = (Sensor.Eventos)evento;
        
        switch(evt){
            case actividad:abrir();break;
            case reposo:cerrar();break;
        }
        
    }
    
}
