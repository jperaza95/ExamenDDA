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
public class SistemaAgendas {
    private ArrayList<TipoContacto> tiposContacto = new ArrayList();
    protected SistemaAgendas(){};
    
    public void agregar(TipoContacto tc){
        tiposContacto.add(tc);
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
    
    
}
