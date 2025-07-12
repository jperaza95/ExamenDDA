/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.AgendaException;
import modelo.Modelo;
import modelo.TipoContacto;
import utilidades.Observable;
import utilidades.Observador;

/**
 *
 * @author peraza
 */
public class ControladorTipoContacto implements Observador{
    private VistaTipoContacto vista;
    
    public ControladorTipoContacto(VistaTipoContacto v){
        this.vista = v;
        cargarTiposContacto();
        Modelo.getInstancia().agregarObservador(this);
    }

    public void crear(String nombre) {
        try {
            Modelo.getInstancia().crearTipoContacto(nombre);
            vista.mostrarMensaje("Tipo de contacto creado correctamente");
            vista.limpiarCampos();
        } catch (AgendaException e) {
            vista.mostrarError(e.getMessage());
        }
    }
    
    public void cargarTiposContacto(){
        ArrayList<TipoContacto> tiposContacto = Modelo.getInstancia().getTiposContacto();
        vista.mostrarTiposContacto(tiposContacto);
    }
    
    @Override
    
    public void actualizar(Observable origen, Object evento){
        if(evento.equals(Modelo.Eventos.tiposContacto))cargarTiposContacto();
    }
    
    
    
}
