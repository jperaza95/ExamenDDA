package interfaz;

import java.util.ArrayList;
import logica.ControlClientes;

import logica.Cliente;
import logica.ControlFacturas;
import logica.ControlStock;
import logica.Fachada;
import logica.Factura;
import logica.LineaFactura;
import logica.PracticoException;
import logica.Producto;
import logica.Proveedor;

import utilidades.Consola;

public class IuConsola {

    Fachada fachada = Fachada.getInstancia();


    /**
     * Ejecuta la consola
     */
    public void mostrarConsola() {
        boolean salir = false;
        do {

            int opcion = imprimirMenu();
            salir = procesarOpcion(opcion);

        } while (!salir);
    }

    /**
     * Imprime el menú y sus opciones a pantalla
     */
    private int imprimirMenu() {
        System.out.println("MENU");
        System.out.println("====");

        ArrayList<String> opciones = new ArrayList();
        opciones.add("Alta de Cliente"); //opcion 0
        opciones.add("Alta de Producto"); //opcion 1
        opciones.add("Alta de Factura"); //opcion 2
        opciones.add("Clientes producto mas barato");//opcion 3
        opciones.add("Salir del menú"); //opcion 4

        return Consola.menu(opciones);
    }

    /**
     * Captura la opción seleccionada por el usuario y ejecuta la acción
     * correspondiente
     */
    private boolean procesarOpcion(int opcion) {
        boolean salir = false;

        switch (opcion) {
            case 0:
                this.nuevoCliente();
                break;
            case 1:
                this.nuevoProducto();
                break;
            case 2:
                this.nuevaFactura();
                break;
            case 3:
                this.clientesProductoMasBarato();
                break;
            case 4:
                salir = true;
                break;

        }
        return salir;
    }

    private void nuevoCliente() {

        System.out.println("ALTA DE CLIENTE");
        System.out.println("===============");

        Cliente unCliente = new Cliente();
        boolean ok = false;
        do {
            ok = unCliente.setCedula(Consola.leer("Cedula:"));
            if (!ok) {
                System.out.println("Cedula incorrecta");
            }
        } while (!ok);

        unCliente.setNombre(Consola.leer("Nombre:"));

        if (fachada.agregar(unCliente)) {
            mostrarClientes();
        } else {
            System.out.println("EL CLIENTE NO FUE INGRESADO");
        }

    }

    private void mostrarClientes() {
        System.out.println("=================");
        System.out.println("CLIENTES ACTUALES");
        System.out.println("=================");
        ArrayList<Cliente> clientes = fachada.getClientes();
        for (Cliente c : clientes) {
            System.out.println(c.getCedula() + " - " + c.getNombre());
        }
    }

    private void nuevoProducto() {
        System.out.println("ALTA DE PRODUCTO");
        System.out.println("===============");


        Producto unProducto = new Producto();

        while (!unProducto.setNombre(Consola.leer("Nombre de producto: \n"))) {

            System.out.println("Nombre inválido");
        }

        while (!unProducto.setStock(Consola.leerInt("Cantidades: \n"))) {

            System.out.println("Cantidad inválida");
        }
        
        ArrayList<Proveedor> proveedores = fachada.getProveedores();

        int opcion = Consola.menu(proveedores);
        Proveedor prov = proveedores.get(opcion);

        System.out.println("proveedor elegido: " + prov.getNombre());
        unProducto.setProveedor(prov);
        prov.agregar(unProducto);

        while (!unProducto.setPrecio((float) Consola.leerInt("Ingresa el precio: \n"))) {
            System.out.println("Precio inválido");
        }
        
        if (fachada.agregar(unProducto)) {
            System.out.println("Se dio de alta correctamente con código: "+unProducto.getCodigo());
            
        }else{
            System.out.println("ERROR!");
        }
       


    }

    private void nuevaFactura() {
        System.out.println("ALTA DE FACTURA");
        System.out.println("===============");

        Factura nueva = fachada.nuevaFactura(Consola.leer("Ingrese su Cedula sin puntos ni guiones: "));

        //Cliente clienteBuscado = controlClientes.obtenerClientePorCedula(Consola.leer("Ingrese su Cedula sin puntos ni guiones: "));
        
        if (nueva==null) {            
            System.out.println("Cédula incorrecta.");
            return;
            
        } 
        
        System.out.println("Cliente: "+nueva.getCliente().getNombre());
        
        elegirProductos(nueva);
        mostrarFactura(nueva);       
        
    }

    private void elegirProductos(Factura f) {
        System.out.println("SELECCIÓN DE PRODUCTOS: ");
        System.out.println("===============");

        boolean salir;
        do {            
            Producto prod; 
            System.out.println("CÓDIGO DE PRODUCTO:");
            int opcionProducto = Consola.menu(fachada.getProductos());
            prod = fachada.getProductos().get(opcionProducto);
            int cant;
                     
            while (!f.agregarLinea(Consola.leerInt("CANTIDAD: "), prod)) {
                System.out.println("Hay "+prod.getStock()+" unidades del producto "+prod.getNombre()+".\n Ingrese una cantidad menor o presione 0 para seguir con otro articulo. ");
            }
                    
            salir = preguntarSalir();
            
   
        } while (!salir);

    }


    private boolean preguntarSalir() {
        
        String opcion;
        do{ 
            opcion =  Consola.leer("¿Desea seguir ingresando productos? S/N");
            
            switch (opcion.toUpperCase()) {
                
                case "N":
                    return true;
                    
                case "S":
                    return false;
                    
                default:
                    System.out.println("Ingrese una opción válida.");
            }
        }while(true);

    }
    
    private void mostrarFactura(Factura f){
        Consola.println("CodProducto   ---    Producto   ---    Cantidad   ---    Subtotal Linea");

        ArrayList<LineaFactura> listaLineas = f.getLineas(); 
        
        for (LineaFactura linea : listaLineas) {
            Producto p = linea.getProducto();
             Consola.println(p.getCodigo()+"   ---    "+p.getNombre()+"   ---    "+linea.getCantidad()+"   ---    "+ linea.totalLinea());
        }
        
        Consola.println("TOTAL:  $"+f.totalFactura());
        
        
        String opcion;
        
        
        do{
            opcion=Consola.leer("¿Confirma el ingreso de la factura? S/N");
            
            switch (opcion.toUpperCase()) {
                
                case "S":
                    fachada.agregar(f);
                    
                case "N":
                    return;
                    
                default:
                    System.out.println("Ingrese una opción válida.");
            }
            
        }while(true);
        
    
    }

    private void clientesProductoMasBarato() {
        Producto masBarato = fachada.getProductoMasBarato();
        if (masBarato==null) {
            Consola.println("No hay productos ingresados.");
        }else{
            mostrarProductoMasBarato(masBarato);
            mostrarClientesConProductoMasBarato(masBarato);        
        
        }
        
    }
    
    
    
    private void mostrarProductoMasBarato(Producto masBarato){
        Consola.println("Producto más barato:");

        Consola.println("Código - Nombre - Precio - Stock");
        Consola.println(masBarato.getCodigo()+" - "+masBarato.getNombre()+" - "+masBarato.getPrecio()+" - "+masBarato.getStock());        
    }

    private void mostrarClientesConProductoMasBarato(Producto masBarato) {
        ArrayList<Cliente> clientesProdMasBarato = fachada.compraronProducto(masBarato);
        if(clientesProdMasBarato.isEmpty()){
            Consola.println("Ningún cliente compró el producto más barato ("+masBarato.getNombre()+")");
        }else{
            Consola.println("Cedula   -   Nombre   -   FechaUltimaCompra");
            for (Cliente cliente : clientesProdMasBarato) {
                Consola.println(cliente.getCedula()+"   -   "+cliente.getNombre()+"   -   "+ fachada.fechaUltimaCompraProducto(cliente, masBarato));            
            }        
        }
    }

}
