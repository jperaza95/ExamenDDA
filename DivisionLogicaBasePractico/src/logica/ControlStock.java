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

//    public Proveedor getProveedorByNombre(String nombre) {
//        Proveedor temp = null;
//        int i = 0;
//        boolean encontre = false;
//        while (i < proveedores.size() && !encontre) {
//            if (proveedores.get(i).getNombre() == nombre) {
//                temp = proveedores.get(i);
//                encontre = true;
//            }
//        }
//        return temp;
//    }

    public ArrayList<Integer> codigosProducto(){
        ArrayList<Integer> listaaux = new ArrayList();
        for (Producto p : productos) {
            listaaux.add(p.getCodigo());
        }
        return listaaux;
    }
    
    public boolean altaProducto(Producto unProducto) {
        if (unProducto.validar()) {
            unProducto.setCodigo(generarCodigoProducto());
            productos.add(unProducto);
            unProducto.getProveedor().agregar(unProducto);
            return true;
        }
        return false;
    }

    private int generarCodigoProducto() {
        proximoCodigoproducto++;
        return proximoCodigoproducto;
    }

    public Producto getProductoPorCodigo(int codigo) {
        Producto aux = null;
        int pos = 0;
        while(aux == null && pos<this.getProductos().size()){
            if (this.getProductos().get(pos).getCodigo() == codigo) {
                aux = this.getProductos().get(pos);
            }
        }
        return aux;
    }
    
   
}
