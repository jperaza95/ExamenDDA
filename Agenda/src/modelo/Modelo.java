/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import utilidades.Observable;

/**
 *
 * @author peraza
 */
public class Modelo extends Observable{
    
    private static Modelo instancia = new Modelo();
    private SistemaUsuarios su = new SistemaUsuarios();
    private SistemaAgendas sa = new SistemaAgendas();
    
    private Modelo(){
    }

    public static Modelo getInstancia() {
        return instancia;
    }


    
    public enum Eventos{listaLogueados, listaTiposContacto;}

    public void agregar(UsuarioAgenda u) {
        su.agregar(u);
    }

    public Acceso loginAgenda(String usr, String pwd) {
        return su.loginAgenda(usr, pwd);
    }

    public void agregar(TipoContacto tc) throws AgendaException{
        sa.agregar(tc);
    }

    public TipoContacto obtenerTipoContacto(String nombre) {
        return sa.obtenerTipoContacto(nombre);
    }

    public ArrayList<TipoContacto> getTiposContacto() {
        return sa.getTiposContacto();
    }

    public void agregar(Administrador u) {
        su.agregar(u);
    }

    public Administrador loginAdmin(String usr, String pwd) {
        return su.loginAdmin(usr, pwd);
    }

    public ArrayList<Acceso> getAccesos() {
        return su.getAccesos();
    }

    public void logout(Acceso a) {
        su.logout(a);
    }

    public void agregar(TipoTelefono tt) {
        sa.agregar(tt);
    }

    public ArrayList<TipoTelefono> getTiposTelefono() {
        return sa.getTiposTelefono();
    }
    


    
    
    
    
    
}
