/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author magda
 */
public class ControlFacturas {
    
    private static ControlFacturas instancia; 

    private ArrayList<Factura> facturas = new ArrayList();
    
    public static ControlFacturas getInstancia(){
    
           if ( instancia == null){
                instancia = new ControlFacturas();
           }
          return instancia;
    }
   
    private ControlFacturas(){
    
    }
    
    public Factura nuevaFactura(String cedula){
        Cliente c = ControlClientes.getInstancia().obtenerClientePorCedula(cedula);
        if (c!=null) {
            return new Factura(c);
        }
        return null;
    }
    
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
    
    public boolean agregar(Factura unaFactura){
        if (unaFactura.totalFactura()>0) {            
        unaFactura.setFechaCompraActual();
        facturas.add(unaFactura);
        return true;
        }
        return false;
    }
    
    public boolean clienteComproProducto(Cliente c, Producto p){
        for (Factura factura : facturas) {
            if(factura.getCliente().equals(c)&&factura.tieneProducto(p)!=null) return true;
        }
        return false;
    } 

    public LocalDate fechaUltimaCompraProducto(Cliente c, Producto p){
        for (int i = facturas.size()-1; i >= 0; i--) {
            Factura f = facturas.get(i);
           if(f.getCliente()==c && f.tieneProducto(p)!=null ) return f.getFechaCompra();
            
        }
        
        return null;
    } 
    
}
