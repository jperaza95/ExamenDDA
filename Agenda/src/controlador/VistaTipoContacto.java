/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.TipoContacto;

/**
 *
 * @author peraza
 */
public interface VistaTipoContacto {

    public void mostrarError(String message);

    public void mostrarMensaje(String msg);

    public void limpiarCampos();

    public void mostrarTiposContacto(ArrayList<TipoContacto> tiposContacto);
    
}
