/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.time.LocalDate;
import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 *
 * @author magda
 */
public class Factura {
    
    private Cliente cliente;
    private LocalDate fechaCompra;
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

    public void setFechaCompraActual() {
        this.fechaCompra = LocalDate.now();
    }
    
    

    public boolean agregarLinea(int cantidad, Producto p){
        LineaFactura lineaExistente = tieneProducto(p);
        int cantidadTotal;
        
        if (lineaExistente == null) {
            cantidadTotal=cantidad;
        }else{
            cantidadTotal = lineaExistente.getCantidad()+cantidad;
        }
        
        
        if (cantidadTotal<=p.getStock()) {
            if(lineaExistente == null) lineas.add(new LineaFactura(p, cantidad));
            else lineaExistente.actualizarCantidad(cantidad);
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


    public float totalFactura(){
        float suma = 0;
        for (LineaFactura linea : lineas) {
            suma+=linea.totalLinea();
        }  
        return suma;
    }

    
    @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente + ", lineas=" + lineas + '}';
    }
    

    
}
