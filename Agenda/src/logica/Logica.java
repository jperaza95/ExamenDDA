/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author peraza
 */
public class Logica {
    
    private static Logica instancia = new Logica();
    private SistemaUsuarios su = new SistemaUsuarios();
    private SistemaAgendas sa = new SistemaAgendas();
    
    private Logica(){
    }

    public static Logica getInstancia() {
        return instancia;
    }

    public void agregar(Usuario u) {
        su.agregar(u);
    }

    public Usuario login(String usr, String pwd) {
        return su.login(usr, pwd);
    }

    public void agregar(TipoContacto tc) {
        sa.agregar(tc);
    }

    public TipoContacto obtenerTipoContacto(String nombre) {
        return sa.obtenerTipoContacto(nombre);
    }

    public ArrayList<TipoContacto> getTiposContacto() {
        return sa.getTiposContacto();
    }
    
    
    
}
