/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author peraza
 */
public class Contacto {
    private String nombre;
    private String telefono;
    private TipoContacto tipoContacto;
    private Date fechaCreacion;

    public Contacto(String nombre, String telefono, TipoContacto tipoContacto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipoContacto = tipoContacto;
        this.fechaCreacion = new Date();
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    
    public boolean validar(){
        
        try {
            Double.parseDouble(telefono);      
            
        } catch (NumberFormatException e) {
            return false;
        }
        return !nombre.trim().isEmpty() && tipoContacto!=null;
        
    }

    @Override
    public String toString() {
        return nombre + " (" + telefono + ")" + tipoContacto+" - "+ fechaCreacion;
    }
    
    @Override
    
    public boolean equals(Object o){
        Contacto c = (Contacto)o;
        return getTelefono().equals(c.getTelefono());
    }

    

}
