/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iu;

import java.awt.Frame;
import modelo.Acceso;
import modelo.Modelo;
import modelo.Usuario;
import modelo.UsuarioAgenda;

/**
 *
 * @author peraza
 */
public class LoginAgenda extends LoginAbstracto{

    public LoginAgenda(Frame parent, boolean modal) {
        super(parent, modal, "Agenda");
    }
    
    
    @Override
    public Object llamarALoginDeLaLogica(String nom, String pwd) {
        return Modelo.getInstancia().loginAgenda(nom, pwd);

    }



    @Override
    public void proximoCasoUso(Object obj) {
        
        new DialogoAgenda((Frame)getParent(), false, (Acceso)obj).setVisible(true);

    }


    @Override
    public void mostrarError(String login_invalido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
