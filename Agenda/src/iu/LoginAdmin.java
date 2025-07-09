/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iu;

import java.awt.Frame;
import modelo.Administrador;
import modelo.Modelo;
import modelo.Usuario;
import modelo.UsuarioAgenda;

/**
 *
 * @author peraza
 */
public class LoginAdmin extends LoginAbstracto{

    public LoginAdmin(Frame parent, boolean modal) {
        super(parent, modal, "Administrador");
    }
    
    
    @Override
    public Usuario llamarALoginDeLaLogica(String nom, String pwd) {
        return Modelo.getInstancia().loginAdmin(nom, pwd);

    }



    @Override
    public void proximoCasoUso(Object obj) {
        
        new DialogoConectados((Frame)getParent(), false, (Administrador)obj).setVisible(true);

    }

    @Override
    public void mostrarError(String login_invalido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    
}
