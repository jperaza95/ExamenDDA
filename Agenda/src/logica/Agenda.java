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

    private UsuarioAgenda dueño;
    private ArrayList<Contacto> contactos = new ArrayList();

    public Agenda(UsuarioAgenda dueño) {
        this.dueño = dueño;
    }

    public boolean agregarContacto(String nombre, String telefono, TipoContacto tc) {
        Contacto nuevo = new Contacto(nombre,telefono,tc);
        
        if (nuevo.validar() && !contactos.contains(nuevo)) {

            contactos.add(nuevo);
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
    
    public ArrayList<Contacto> buscarContactos(String filtro) {
        ArrayList<Contacto> retorno = new ArrayList();
        if(filtro.isEmpty()) return retorno;
        for (Contacto c : contactos) {
            if (c.getNombre().indexOf(filtro)>-1 || c.getTelefono().indexOf(filtro)>-1) {
                retorno.add(c);
            }
        }
        return retorno;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public UsuarioAgenda getDueño() {
        return dueño;
    }

}


