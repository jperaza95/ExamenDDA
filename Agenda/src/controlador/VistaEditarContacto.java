/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.TipoTelefono;

/**
 *
 * @author peraza
 */
public interface VistaEditarContacto {

    public void cargarTiposTelefono(ArrayList<TipoTelefono> tiposTelefono);

    public void mostrarNombre(String nombre);

    public void mostrarTipoTelefono(TipoTelefono tipo);

    public void mostrarNumero(String numero);

    public void mostrarMensajeModificadoCorrectamente();

    public void mostrarError(String message);
    
}
