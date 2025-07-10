/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Acceso;
import modelo.Agenda;
import modelo.AgendaException;
import modelo.Modelo;
import modelo.TipoContacto;
import modelo.TipoTelefono;
import modelo.UsuarioAgenda;
import utilidades.Observable;
import utilidades.Observador;

/**
 *
 * @author peraza
 */
public class ControladorDialogoAgenda implements Observador{
     
    private VistaDialogoAgenda vista;
    private Acceso acceso;
    private UsuarioAgenda usuario;
    

    public ControladorDialogoAgenda(VistaDialogoAgenda v, Acceso a) {
        vista = v;
        acceso = a;
        usuario = a.getUsuario();
        cargarTiposContacto();
        cargarTiposTelefono();
        vista.mostrarEstado(usuario);
        usuario.getAgenda().agregarObservador(this);
        
    }

    private void cargarTiposContacto() {
        ArrayList<TipoContacto> tiposContacto = Modelo.getInstancia().getTiposContacto();
        vista.mostrarTiposContacto(tiposContacto);

    }

    private void cargarTiposTelefono() {
        ArrayList<TipoTelefono> tiposTelefono = Modelo.getInstancia().getTiposTelefono();
        vista.mostrarTiposTelefono(tiposTelefono);
    }
    
    public void logout() {
     usuario.getAgenda().quitarObservador(this);
     Modelo.getInstancia().logout(acceso);
    }
    
    @Override
    public void actualizar(Observable origen, Object evento){
        
        if (evento.equals(Agenda.Eventos.listaContactos)) {
            vista.mostrarEstado(usuario);
        }
    }    

    public void crearContacto(String nom, String tel, TipoContacto tc, TipoTelefono tf) {
        
        try {
            usuario.getAgenda().agregarContacto(nom,tel,tc,tf);
            vista.mostrarMensaje("Contacto ingresado");

        } catch (AgendaException ex) {
            vista.mostrarMensaje(ex.getMessage());

        }
        
    }

    public void nuevoDialogo() {
        vista.nuevoDialogo(usuario);
    }


}
