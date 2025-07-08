/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Contador;
import utilidades.Observable;
import utilidades.Observador;

/**
 *
 * @author peraza
 */
public class ControladorContador implements Observador{
    public Contador contador;
    private VistaContador vista;
    
    

    public ControladorContador(Contador contador, VistaContador v) {
        this.contador = contador;
        vista = v;
        contador.agregarObservador(this);
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        if(evento.equals(Contador.Eventos.cambioValor)){
            int valor = contador.getValor();
            vista.mostrarValor(valor);
        }
    }
    
    public void sumar(){
        contador.sumar();
    }
    public void restar(){
        contador.restar();
    }    
    public void crearNuevaIUParaEsteContador(){
        vista.crearNuevaVista(contador);
    }
}
