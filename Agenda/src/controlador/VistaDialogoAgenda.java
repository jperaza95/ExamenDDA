/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.TipoContacto;
import modelo.TipoTelefono;
import modelo.UsuarioAgenda;

/**
 *
 * @author peraza
 */
public interface VistaDialogoAgenda {

    public void mostrarTiposContacto(ArrayList<TipoContacto> tiposContacto);

    public void mostrarTiposTelefono(ArrayList<TipoTelefono> tiposTelefono);

    public void mostrarEstado(UsuarioAgenda u);

    public void mostrarMensaje(String msg);

    public void nuevoDialogo(UsuarioAgenda u);
    
}
