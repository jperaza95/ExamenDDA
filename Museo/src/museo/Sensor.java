/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class Sensor {
    private boolean movimiento;
    
    public void on(){
        System.out.println("Sensor encendido");
        //implementar que ejecute Detectar movimiento y reposo
    }
    
    public void off(){
        System.out.println("Sensor apagado");
    }
    
    public ArrayList<EscuchadorSensor> escuchadores= new ArrayList();
    
    private void avisar(){
        for (EscuchadorSensor e : escuchadores) {
            if(movimiento) e.hayActividad();
            else e.hayReposo();
        }
    }
}
