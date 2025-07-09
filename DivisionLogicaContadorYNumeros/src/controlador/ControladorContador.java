/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Contador;
import modelo.ContadorException;
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
        
        pedirALaVistaQueMuestreElValor();
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        if(evento.equals(Contador.Eventos.cambioValor)){
            pedirALaVistaQueMuestreElValor();
        }
    }
    
    private void pedirALaVistaQueMuestreElValor(){
        int valor = contador.getValor();
        vista.mostrarValor(valor);    
    }
    
    public void sumar(){
        contador.sumar();
    }
    public void restar(){
        try {
            contador.restar();
        } catch (ContadorException ex) {
            vista.mostrarError(ex.getMessage());
        }
    }    
    public void crearNuevaIUParaEsteContador(){
        vista.crearNuevaVista(contador);
    }

    public void salir() {
        contador.quitarObservador(this);
    }

    public void crearNuevaUIParaEsteContador() {
        vista.crearNuevaVista(contador);
    }
}
