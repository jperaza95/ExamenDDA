/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iu;

import java.awt.Frame;
import logica.Administrador;
import logica.Logica;
import logica.Usuario;
import logica.UsuarioAgenda;

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
        return Logica.getInstancia().loginAdmin(nom, pwd);

    }



    @Override
    public void ejecutarProximoCasoUso(Object obj) {
        
        new DialogoConectados((Frame)getParent(), false, (Administrador)obj).setVisible(true);

    }

    
}
