/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import utilidades.Observable;
import utilidades.Observador;

/**
 *
 * @author peraza
 */
public class Agenda extends Observable implements Observador{

    private UsuarioAgenda dueño;
    private ArrayList<Contacto> contactos = new ArrayList();

    public Agenda(UsuarioAgenda dueño) {
        this.dueño = dueño;
    }


    
    public enum Eventos{listaContactos};

    public void agregarContacto(String nombre, String telefono, TipoContacto tc, TipoTelefono tipoTel) throws AgendaException{

        Contacto nuevo = new Contacto(nombre,telefono,tc,tipoTel);
        nuevo.validar();
        if(contactos.contains(nuevo)) throw new AgendaException("Ya existe el contacto");
        contactos.add(nuevo);
        avisar(Eventos.listaContactos);
        Modelo.getInstancia().avisar(Modelo.Eventos.listaLogueados);

        //Como observador:
        nuevo.getTelefono().agregarObservador(this);
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
        if(filtro.isEmpty()) return contactos;
        for (Contacto c : contactos) {
            if (c.getNombre().indexOf(filtro)>-1 || c.getTelefono().getNumero().indexOf(filtro)>-1) {
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

    @Override
    public void actualizar(Observable origen, Object evento) {
        if(evento.equals(Telefono.Eventos.contactoModificado)) avisar(Eventos.listaContactos);
    }
}


