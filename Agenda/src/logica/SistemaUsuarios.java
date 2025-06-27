/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author peraza
 */
public class SistemaUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList();
    
    protected SistemaUsuarios(){} //solo se puede crear dentro de este paquete (logica)
    
    public void agregar(Usuario u){
        usuarios.add(u);
    }
    
    public Usuario login(String usr, String pwd){
        for (Usuario u : usuarios) {
            if (u.getNombre().equals(usr) && u.getPassword().equals(pwd)) {
                return u;
            }
        }
        return null;
    }
}
