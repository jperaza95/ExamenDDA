/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Acceso;
import modelo.Agenda;
import modelo.AgendaException;
import modelo.Contacto;
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
public class ControladorAgenda implements Observador{
     
    private VistaAgenda vista;
    private Acceso acceso;
    private UsuarioAgenda usuario;
    

    public ControladorAgenda(VistaAgenda v, Acceso a) {
        vista = v;
        acceso = a;
        usuario = a.getUsuario();
        cargarTiposContacto();
        cargarTiposTelefono();
        vista.mostrarEstado(usuario);
        usuario.getAgenda().agregarObservador(this);
        Modelo.getInstancia().agregarObservador(this);
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
        if(evento.equals(Modelo.Eventos.tiposContacto)){
            cargarTiposContacto();
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
        vista.buscar();
    }
    
    public void buscar(String filtro){
        vista.mostrarResultadoBusqueda(usuario.getAgenda().buscarContactos(filtro));
    }
    
    public void detalles(Contacto c){
        if(c!=null){
        vista.mostrarDetalles(c.getFechaCreacion(),c.getNombre(),c.getTipoContacto(),c.getTelefono());
        }
    }


}
