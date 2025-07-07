/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package museo;

/**
 *
 * @author julio
 */
public class Museo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.agregarObservador(new Alarma());
        s.agregarObservador(new Alarma());
        s.agregarObservador(new Trampa());
        s.agregarObservador(new AlarmaSonora());
        s.agregarObservador(new ServicioTecnico());

        s.on();
    }
    
}
