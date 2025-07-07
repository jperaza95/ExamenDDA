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
public class AlarmaSonora implements Observador{
    private void sonar(){
        System.out.println("SONARRR");
    }
    private void mute(){
        System.out.println("MUTE!! ");
    }
    @Override
    public void actualizar(Observable origen, Object evento) {
        Sensor.Eventos evt = (Sensor.Eventos)evento;
        
        switch (evt) {
            case actividad: sonar(); break;
            case reposo: mute(); break;
        }
        
    }
}
