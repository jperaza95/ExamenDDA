package logica;

import java.util.ArrayList;

public class ControlStock {


    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList<Proveedor> proveedores = new ArrayList();
    
    int proximoCodigoproducto = 0;

    protected ControlStock(){
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
        if (unProducto.validar()) {            
            unProducto.setCodigo(generarCodigoProducto());
            productos.add(unProducto);
            unProducto.getProveedor().agregar(unProducto);
            return true;
        }
        return false;
    }

    
    

    public Producto getProductoMasBarato(){
        if(productos.isEmpty()) return null;
        
        Producto masBarato=productos.get(0);
        float precioBarato = masBarato.getPrecio();
        
        for (Producto producto : productos) {
            if (producto.getPrecio()<precioBarato) masBarato =  producto;
    
        }
        
        return masBarato;
    }

    private int generarCodigoProducto() {
       proximoCodigoproducto++;
       return proximoCodigoproducto;

    }

    Producto buscar(int codProd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
}
