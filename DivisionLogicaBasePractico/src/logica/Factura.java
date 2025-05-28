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
public class Factura {
    
    private Cliente cliente;
    private ArrayList <LineaFactura> lineas = new ArrayList();

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void agregar(int cantidad, Producto p){
        lineas.add(new LineaFactura(p, cantidad));
    }
    
    public boolean tieneProducto(Producto unP){
        boolean ret = false;
        for(LineaFactura l: lineas){
            if(l.tieneProducto(unP)){
                ret = true;
            }
        }
        return ret;       
    }



    @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente + ", lineas=" + lineas + '}';
    }
    
    
}
