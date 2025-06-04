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
    
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
    
    public void agregar(Factura unaFactura){
        facturas.add(unaFactura);
    }
    
    
    

    
}
