/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author peraza
 */
public interface VistaNumeros {

    public void mostrarMensaje(String msg);
    public void actualizarCantidadFaltan(int cantidad);

    public void mostrarResultado(ArrayList<Integer>listaResultado);
}
