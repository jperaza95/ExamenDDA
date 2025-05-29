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

    public Producto getProductoMenorPrecio() {
        Producto menor = productos.get(0);
        Producto p;
        for (int x = 1; x < productos.size(); x++) {
            p = productos.get(x);
            if (p.getPrecio() < menor.getPrecio()) {
                menor = p;
            }
        }

        return menor;

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



    
   
}
