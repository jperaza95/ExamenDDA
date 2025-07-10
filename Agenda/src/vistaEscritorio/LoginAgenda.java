/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaEscritorio;

import controlador.ControladorLoginAgenda;
import java.awt.Frame;
import javax.swing.JOptionPane;
import modelo.Acceso;
import modelo.Modelo;


/**
 *
 * @author peraza
 */

public class LoginAgenda extends LoginAbstracto{


    public LoginAgenda(Frame parent, boolean modal) {
        super(parent, modal, "Agenda");
        setControlador(new ControladorLoginAgenda(this));
    }
    
    



    @Override
    public void proximoCasoUso(Object obj) {
        
        new DialogoAgenda((Frame)getParent(), false, (Acceso)obj).setVisible(true);

    }




    
}
