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
    private Telefono telefono;
    private TipoContacto tipoContacto;
    private Date fechaCreacion;

    public Contacto(String nombre, String numero, TipoContacto tipoContacto, TipoTelefono tipoTel) {
        this.nombre = nombre;
        this.telefono = crearTelefono(numero,tipoTel);//new Telefono(numero,tipoTel);
        this.tipoContacto = tipoContacto;
        this.fechaCreacion = new Date();
    }

    public Telefono getTelefono() {
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
        
        
        return !nombre.trim().isEmpty() && tipoContacto!=null && telefono.validar();
        
    }

    @Override
    public String toString() {
        return nombre + " (" + telefono.getNumero() + ")";
    }
    
    @Override
    
    public boolean equals(Object o){
        Contacto c = (Contacto)o;
        return getTelefono().equals(c.getTelefono());
    }

    private Telefono crearTelefono(String numero, TipoTelefono tipoTel) {
        if (tipoTel.getNombre().equals("Fijo"))return new Fijo(tipoTel,numero);
        if (tipoTel.getNombre().equals("Celular"))return new Celular(tipoTel,numero);
        if (tipoTel.getNombre().equals("Internacional"))return new Internacional(tipoTel,numero);
        /*
        Fuera del alcance del curso
        try {
            Class c = Class.forName("logica."+tipoTel.getNombre());
            Telefono t = (Telefono)c.newInstance();
            t.setNumero(numero);
            t.setTipo(tipoTel);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }*/
        

    }

    

}
