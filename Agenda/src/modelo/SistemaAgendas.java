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
    
    public void agregar(TipoContacto tc){
        
        tiposContacto.add(tc);
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
    
    public void crearTipoContacto (String nombre) throws AgendaException{
        if(nombre.isEmpty()) throw new AgendaException("El nombre no puede estar vacío.");
        if(obtenerTipoContacto(nombre)!=null)  throw new AgendaException("El Tipo de contacto ya existe.");
        agregar(new TipoContacto(nombre));
        Modelo.getInstancia().avisar(tiposContacto);
        
    }
    
}
