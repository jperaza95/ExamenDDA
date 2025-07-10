/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaEscritorio;

import controlador.ControladorLoginAdmin;
import iu.DialogoConectados;
import java.awt.Frame;
import javax.swing.JOptionPane;
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
        setControlador(new ControladorLoginAdmin(this));
    }
    

    @Override
    public void proximoCasoUso(Object obj) {
        
        new DialogoConectados((Frame)getParent(), false, (Administrador)obj).setVisible(true);

    }





    
}
