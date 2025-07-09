/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author peraza
 */
public class Acceso {
    private Date fechaHora = new Date();
    private UsuarioAgenda usuario;

    public Acceso(UsuarioAgenda usuario) {
        this.usuario = usuario;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public UsuarioAgenda getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return usuario.getNombreCompleto() + " ("+usuario.getAgenda().cantidadContactos()+") - "+fechaHora;
    }
    
    
    
}
