/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author magda
 */
public class DatosPrueba {
    
    
    public static void cargar() throws PracticoException{
       
        Fachada fachada = Fachada.getInstancia();
        
        Proveedor pA = new Proveedor("Proveedor A");
        Proveedor pB = new Proveedor("Proveedor B");
        Proveedor pC = new Proveedor("Proveedor C");
        
        fachada.agregar(pA);
        fachada.agregar(pB);
        fachada.agregar(pC);
        
        Producto caramelo = new Producto("Caramelo",2,3000,pA);
        Producto camisa = new Producto("Camisa",1300,1000,pB);
        Producto computadora = new Producto("Computadora",20000,40,pC);
        
        fachada.agregar(caramelo);
        fachada.agregar(camisa);
        fachada.agregar(computadora);
        
        
        Cliente juan = new Cliente("12345678","Juan");
        Cliente ana = new Cliente("13456789","Ana");
        Cliente mario = new Cliente("21234567","Mario");
        
        fachada.agregar(juan);
        fachada.agregar(ana);
        fachada.agregar(mario);
        
        
        Factura f1 = new Factura(juan);
        f1.agregarLinea(30, caramelo);
        f1.agregarLinea(2, camisa);
        f1.agregarLinea(1, computadora);
        
        fachada.agregar(f1);
        
        Factura f2 = new Factura(ana);
        f2.agregarLinea(400, caramelo);
        f2.agregarLinea(20, camisa);
        f2.agregarLinea(10, computadora);
        
        fachada.agregar(f2);
        
        Factura f3 = new Factura(mario);
      
        f3.agregarLinea(1, camisa);
        f3.agregarLinea(1, computadora);
        
        fachada.agregar(f3);
    }
    
}
