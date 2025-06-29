/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author peraza
 */
public class Agenda {

    private Usuario dueño;
    private ArrayList<Contacto> contactos = new ArrayList();

    public Agenda(Usuario dueño) {
        this.dueño = dueño;
    }

    public boolean agregarContacto(String nombre, String telefono, TipoContacto tc) {
        if (!nombre.isEmpty() && !telefono.isEmpty() && buscarContacto(telefono)==null) {

            contactos.add(new Contacto(nombre, telefono, tc));
            return true;
        }
        return false;

    }


    public int cantidadContactos() {
        return contactos.size();
    }

    public Contacto buscarContacto(String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getTelefono().equals(telefono)) {
                return contacto;
            }
        }
        return null;
    }
    
    public ArrayList<Contacto> buscarContactos(String telefono) {
        ArrayList<Contacto> retorno = new ArrayList();
        for (Contacto contacto : contactos) {
            if (contacto.getTelefono().contains(telefono)) {
                retorno.add(contacto);
            }
        }
        return retorno;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public Usuario getDueño() {
        return dueño;
    }

}


