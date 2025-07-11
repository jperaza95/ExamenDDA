/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Acceso;
import modelo.Administrador;

/**
 *
 * @author peraza
 */
public interface VistaConectados {
    public void mostrarConectados(ArrayList<Acceso>accesos);
    public void mostrarAdmin(String nombre);

    public void ejecutarCUCrearTipoContacto();
}
