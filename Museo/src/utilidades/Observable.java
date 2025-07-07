/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class Observable {
        public ArrayList<Observador> observadores = new ArrayList();
        
        public void agregarObservador(Observador obs){
            if(!observadores.contains(obs)) observadores.add(obs);
        }
        public void quitarObservador(Observador obs){observadores.remove(obs);}
        
        public void avisar(Object evento){
            ArrayList<Observador> copia = new ArrayList(observadores);
            for (Observador obs : copia) {
                obs.actualizar(this, evento);
            }
        }
}
