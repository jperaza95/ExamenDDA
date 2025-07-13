/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author peraza
 */
public class SistemaAgendas {
    private ArrayList<TipoContacto> tiposContacto = new ArrayList();
    private ArrayList<TipoTelefono> tiposTelefono = new ArrayList();
    protected SistemaAgendas(){};
    
    public void agregar(TipoContacto tc) throws AgendaException{
        tc.Validar();
        if(tiposContacto.contains(tc))  throw new AgendaException("El Tipo de contacto ya existe.");
        tiposContacto.add(tc);
        Modelo.getInstancia().avisar(Modelo.Eventos.listaTiposContacto);
        
    }
    
    public void agregar(TipoTelefono tt){
        
        tiposTelefono.add(tt);
    }
    
    public TipoContacto obtenerTipoContacto(String nombre){
        for (TipoContacto tc : tiposContacto) {
            if(tc.getNombre().equals(nombre)) return tc;
        }
        
        return null;
    }

    public ArrayList<TipoContacto> getTiposContacto() {
        return tiposContacto;
    }

    public ArrayList<TipoTelefono> getTiposTelefono() {
        return tiposTelefono;
    }
    

    
}
