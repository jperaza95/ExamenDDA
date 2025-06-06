package logica;

import java.util.ArrayList;

public class ControlStock {

    private static ControlStock instancia;

    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList<Proveedor> proveedores = new ArrayList();
    
    int proximoCodigoproducto = 0;

    public static ControlStock getInstancia() {

        if (instancia == null) {
            instancia = new ControlStock();
        }
        return instancia;
    }

    private ControlStock() {
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }



    public void agregar(Proveedor unProveedor) {
        proveedores.add(unProveedor);
    }

    public boolean agregar(Producto unProducto) {
        unProducto.setCodigo(proximoCodigoproducto);
        productos.add(unProducto);
        unProducto.getProveedor().agregar(unProducto);
        proximoCodigoproducto++;
        return true;
    }


    public Producto getProductoMasBarato(){
        
        float precioBarato = 0;
        Producto masBarato=null;
        
        for (Producto producto : productos) {
            if (producto.getPrecio()<precioBarato) masBarato =  producto;
    
        }
        
        return masBarato;
    }
    
   
}
