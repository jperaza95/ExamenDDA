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
public class ControladorLoginAdmin extends ControladorLogin{

    public ControladorLoginAdmin(VistaLogin vista) {
        super(vista);
    }

    
    @Override
    public Object llamarLoginLogica(String usr, String pwd) {
        return Modelo.getInstancia().loginAdmin(usr, pwd);

    }
    
}
