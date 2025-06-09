/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author magda
 */
public class ControlClientes {

    private static ControlClientes instancia;

    private ArrayList<Cliente> clientes = new ArrayList();

    public static ControlClientes getInstancia() {

        if (instancia == null) {
            instancia = new ControlClientes();
        }
        return instancia;
    }

    private ControlClientes() {

    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }


    public boolean existeCliente(String unaCedula) {
        boolean existe = false;
        int pos = 0;
        ArrayList<Cliente> lista = this.getClientes();
        while (pos < lista.size() && !existe) {
            Cliente c = lista.get(pos);
            if (c.getCedula().equals(unaCedula)) {
                existe = true;
            }
            pos++;
        }
        return existe;
        /*
           return clientes.contains(c);*/
    }

    public boolean existeCliente(Cliente c) {

        return clientes.contains(c);
    }

    public boolean agregar(Cliente c) {
        boolean ok = false;
        if (c.validar() && !this.existeCliente(c)) {
            clientes.add(c);
            ok = true;
        }

        return ok;
    }

    public Cliente obtenerClientePorCedula(String unaCedula) {
        ArrayList<Cliente> lista = this.getClientes();

        for (Cliente c : lista) {
            if (c.getCedula().equals(unaCedula)) {
                return c;
            }
        }

        return null;

    }
    
    public ArrayList<Cliente> compraronProducto(Producto p){
        ArrayList<Cliente> retorno = new ArrayList(); 
        ControlFacturas cf = ControlFacturas.getInstancia();
        for (Cliente cliente : clientes) {
            if (cf.clienteComproProducto(cliente, p)) 
                retorno.add(cliente);                
            }            
        return retorno;
        
    }
    
}
