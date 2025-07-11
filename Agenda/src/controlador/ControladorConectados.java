/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Administrador;
import modelo.Modelo;
import utilidades.Observable;
import utilidades.Observador;

/**
 *
 * @author peraza
 */
public class ControladorConectados implements Observador{
    private VistaConectados vista;
    private Administrador admin;
    
    public ControladorConectados(VistaConectados vista, Administrador a){
        this.vista=vista;
        admin = a;
        cargarConectados();
        vista.mostrarAdmin(admin.getNombreCompleto());
        Modelo.getInstancia().agregarObservador(this);
    }


    
    private void cargarConectados(){
        vista.mostrarConectados(Modelo.getInstancia().getAccesos());
    }
    
    public void cerrar(){
        Modelo.getInstancia().quitarObservador(this);
    }
    
    @Override
    public void actualizar(Observable origen, Object evento) {
       if(evento.equals(Modelo.Eventos.listaLogueados)) cargarConectados();

    }

    public void CUCrearTipoContacto() {
        vista.ejecutarCUCrearTipoContacto();
    }
    
}
