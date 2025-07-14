/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.AgendaException;
import modelo.Contacto;
import modelo.Modelo;
import modelo.TipoTelefono;

/**
 *
 * @author peraza
 */
public class ControladorEditarContacto {
    private VistaEditarContacto vista;
    private Contacto contacto;
    
    public ControladorEditarContacto(VistaEditarContacto v, Contacto c){
        this.vista = v;
        contacto=c;
        vista.cargarTiposTelefono(Modelo.getInstancia().getTiposTelefono());
        vista.mostrarNombre(contacto.getNombre());
        vista.mostrarTipoTelefono(contacto.getTelefono().getTipoTelefono());
        vista.mostrarNumero(contacto.getTelefono().getNumero());
    }
    
    public void modificar(String numero, TipoTelefono tipo){
        try {
            contacto.getTelefono().modificar(numero,tipo);
            vista.mostrarMensajeModificadoCorrectamente();
        } catch (AgendaException e) {
            vista.mostrarError(e.getMessage());

        }
      
    }
}
