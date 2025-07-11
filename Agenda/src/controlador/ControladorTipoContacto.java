/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.AgendaException;
import modelo.Modelo;

/**
 *
 * @author peraza
 */
public class ControladorTipoContacto {
    private VistaTipoContacto vista;
    
    public ControladorTipoContacto(VistaTipoContacto v){
        this.vista = v;
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
    
}
