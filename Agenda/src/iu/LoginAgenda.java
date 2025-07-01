/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iu;

import java.awt.Frame;
import logica.Acceso;
import logica.Logica;
import logica.Usuario;
import logica.UsuarioAgenda;

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
        return Logica.getInstancia().loginAgenda(nom, pwd);

    }



    @Override
    public void ejecutarProximoCasoUso(Object obj) {
        
        new DialogoAgenda((Frame)getParent(), false, (Acceso)obj).setVisible(true);

    }

    
}
