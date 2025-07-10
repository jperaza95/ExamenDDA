/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Modelo;

/**
 *
 * @author peraza
 */
public abstract class ControladorLogin {
    private VistaLogin vista;
    
    public ControladorLogin(VistaLogin vista){
        this.vista=vista;
    }
    
    public void login(String usr, String pwd){
        Object dato = llamarLoginLogica(usr,pwd);
       if(dato!=null){
           vista.proximoCasoUso(dato);
           vista.cerrar();
       }else vista.mostrarError("Login invalido");
    }

    public abstract Object llamarLoginLogica(String usr, String pwd);
    
}
