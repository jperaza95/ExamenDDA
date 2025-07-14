/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosPrueba;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Administrador;
import modelo.AgendaException;
import modelo.Celular;
import modelo.Fijo;
import modelo.Internacional;
import modelo.Modelo;
import modelo.TipoContacto;
import modelo.TipoTelefono;
import modelo.UsuarioAgenda;

/**
 *
 * @author peraza
 */
public class CargaDatos {

    public static void ejecutar() {

        try {
            Modelo logica = Modelo.getInstancia();
            logica.agregar(new UsuarioAgenda("a", "a", "Ana"));
            logica.agregar(new UsuarioAgenda("b", "b", "Beatriz"));
            logica.agregar(new UsuarioAgenda("c", "c", "Carlos"));

            logica.agregar(new Administrador("z", "z", "Zulma"));
            logica.agregar(new Administrador("x", "x", "Xavier"));
            logica.agregar(new Administrador("y", "y", "Yildiz"));

            logica.agregar(new TipoContacto("PARTICULAR"));
            logica.agregar(new TipoContacto("LABORAL"));
            logica.agregar(new TipoContacto("FAMILIAR"));

            logica.agregar(new Fijo());
            logica.agregar(new Celular());
            logica.agregar(new Internacional());

        } catch (AgendaException ex) {
            ex.printStackTrace();
        }

    }
}
