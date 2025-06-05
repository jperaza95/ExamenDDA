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
    
    public Factura() {

    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public boolean setCliente(Cliente cliente) {
        if(cliente==null) return false;
        this.cliente = cliente;return true;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public boolean agregarLinea(int cantidad, Producto p){
        if (cantidad<=p.getStock()) {
            LineaFactura l = tieneProducto(p);
            if(l == null) lineas.add(new LineaFactura(p, cantidad));
            else l.actualizarCantidad(cantidad);
            return true;
        }
        
        return false;
        
       
    }

    private LineaFactura tieneProducto(Producto p){
        for (LineaFactura linea : lineas) {
            if(linea.tieneProducto(p)) return linea;
        }
        return null;
    }



    
        @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente + ", lineas=" + lineas + '}';
    }
    
}
