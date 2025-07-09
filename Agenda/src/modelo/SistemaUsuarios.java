/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author peraza
 */
public class SistemaUsuarios {

    private ArrayList<UsuarioAgenda> usuariosAgenda = new ArrayList();
    private ArrayList<Administrador> usuariosAdmin = new ArrayList();
    private ArrayList<Acceso> accesos = new ArrayList();

    protected SistemaUsuarios() {
    } //solo se puede crear dentro de este paquete (logica)

    public ArrayList<Acceso> getAccesos() {
        return accesos;
    }
    
    

    public void agregar(UsuarioAgenda u) {
        usuariosAgenda.add(u);
    }

    public void agregar(Administrador u) {
        usuariosAdmin.add(u);
    }

    public Acceso loginAgenda(String usr, String pwd) {
        UsuarioAgenda u = (UsuarioAgenda)buscarUsuario(usuariosAgenda, usr, pwd);
        Acceso a = null; 
        if (u!=null){
            a = new Acceso(u);
            accesos.add(a);
            Modelo.getInstancia().avisar(Modelo.Eventos.listaLogueados);
        }
        return a;
    }

    public Administrador loginAdmin(String usr, String pwd) {
        Usuario u = buscarUsuario(usuariosAdmin, usr, pwd);
        return (Administrador)u;
    }
    
    
    
    private Usuario buscarUsuario(ArrayList lista, String nom, String pwd){
        Usuario u;
        for (Object obj : lista) {
            u=(Usuario)obj;
            if (u.getNombre().equals(nom) && u.getPassword().equals(pwd)) {
                return u;
            }            
        }
        return null;
    }
    
    public void logout(Acceso a){
        accesos.remove(a);
        Modelo.getInstancia().avisar(Modelo.Eventos.listaLogueados);
    }
}
