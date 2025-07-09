/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.LogicaNumeros;
import modelo.NumerosException;
import utilidades.Observable;
import utilidades.Observador;

/**
 *
 * @author peraza
 */
public class ControladorNumeros implements Observador{
    
    private VistaNumeros vista; 
    private LogicaNumeros logica;


    
    public ControladorNumeros(VistaNumeros v, LogicaNumeros l){
        vista=v;
        logica=l;
        logica.agregarObservador(this);
    }
    
    
    @Override
    public void actualizar(Observable origen, Object evento){
        LogicaNumeros.Eventos evt = (LogicaNumeros.Eventos) evento;
        switch(evt){
            case cambioCantidad:actualizarCantidadFaltan();break;
            case hayResultado:mostrarResultado();break;
        }
    }

    public void salir() {
        logica.quitarObservador(this);
    }

    public void iniciar(int cantidad) {
        try {
            logica.iniciar(cantidad);

        } catch(NumerosException ex){
            vista.mostrarMensaje(ex.getMessage());
        }
    }

    public void agregarNumero(int n) {
       try {

            logica.ingresar(n);
      
        } catch(NumerosException ex){
            vista.mostrarMensaje(ex.getMessage());
        }

    }

    private void actualizarCantidadFaltan() {
        vista.actualizarCantidadFaltan(logica.getCantidad());
    }

    private void mostrarResultado() {
       vista.mostrarResultado(logica.getResultado());
    }
}
