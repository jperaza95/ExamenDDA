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
public class Alarma implements Observador{



    
    private void llamar(String msg) {
        System.out.println("Llamada con mensaje... "+msg);
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        System.out.println("ACTUALIZAR");
        switch((Sensor.Eventos)evento){
            case actividad:llamar("Actividad");break;
            case reposo:llamar("Reposo");break;
        }
    }
    
}
