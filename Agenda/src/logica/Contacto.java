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

    @Override
    public String toString() {
        return nombre + " (" + telefono + ")" + tipoContacto+" - "+ fechaCreacion;
    }
    
    
    

}
