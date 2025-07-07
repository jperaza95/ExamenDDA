/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import utilidades.Observable;
import utilidades.Observador;

/**
 *
 * @author peraza
 */
public class ServicioTecnico implements Observador {
    
    @Override
    public void actualizar(Observable origen, Object evento){
        if(evento.equals(Sensor.Eventos.bajaBateria)) System.out.println("LLAMAR AL TECNICO");
    }
}
