/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.ArrayList;
import utilidades.Observable;

/**
 *
 * @author julio
 */
public class Sensor extends Observable{
    private boolean actividad = false;


    public enum Eventos{actividad,reposo,bajaBateria}
    
    public void on(){
        System.out.println("---ON---");
        pausa(2);
        detectarMovimiento();
        pausa(3);
        detectarReposo();
        pausa(1);
        bajaBateria();
        System.out.println("---FIN---");
    }
    
    
    public void off(){
        System.out.println("Sensor apagado");
    }
    

    private void pausa(int sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
        }
    }

    private void detectarMovimiento() {
        System.out.println("---MOVIMIENTO DETECTADO---");
        actividad=true;
        avisar(Eventos.actividad);
    }

    private void detectarReposo() {
        System.out.println("---REPOSO---");
        actividad=false;
        avisar(Eventos.reposo);
    }
    
    private void bajaBateria() {

        avisar(Eventos.bajaBateria);
    }
  
}
