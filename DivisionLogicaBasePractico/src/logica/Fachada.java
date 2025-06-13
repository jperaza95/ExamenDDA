/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author peraza
 */
public class Fachada {
    private static Fachada instancia = new Fachada();
    private ControlClientes controlClientes = new ControlClientes();
    private ControlFacturas controlFacturas = new ControlFacturas();
    private ControlStock controlStock = new ControlStock();

    
    public static Fachada getInstancia() {
        return instancia;
    }
    
    private Fachada(){
    }

    public ArrayList<Cliente> getClientes() {
        return controlClientes.getClientes();
    }

    public boolean existeCliente(String unaCedula) {
        return controlClientes.existeCliente(unaCedula);
    }

    public boolean existeCliente(Cliente c) {
        return controlClientes.existeCliente(c);
    }

    public boolean agregar(Cliente c) {
        return controlClientes.agregar(c);
    }

    public Cliente obtenerClientePorCedula(String unaCedula) {
        return controlClientes.obtenerClientePorCedula(unaCedula);
    }

    public ArrayList<Cliente> compraronProducto(Producto p) {
        return controlClientes.compraronProducto(p);
    }

    public Factura nuevaFactura(String cedula) {
        return controlFacturas.nuevaFactura(cedula);
    }

    public ArrayList<Factura> getFacturas() {
        return controlFacturas.getFacturas();
    }

    public boolean agregar(Factura unaFactura) {
        return controlFacturas.agregar(unaFactura);
    }

    public boolean clienteComproProducto(Cliente c, Producto p) {
        return controlFacturas.clienteComproProducto(c, p);
    }

    public LocalDate fechaUltimaCompraProducto(Cliente c, Producto p) {
        return controlFacturas.fechaUltimaCompraProducto(c, p);
    }

    public ArrayList<Producto> getProductos() {
        return controlStock.getProductos();
    }

    public ArrayList<Proveedor> getProveedores() {
        return controlStock.getProveedores();
    }

    public void agregar(Proveedor unProveedor) {
        controlStock.agregar(unProveedor);
    }

    public boolean agregar(Producto unProducto) {
        return controlStock.agregar(unProducto);
    }

    public Producto getProductoMasBarato() {
        return controlStock.getProductoMasBarato();
    }

    Producto buscar(int codProd) {
        return controlStock.buscar(codProd);
    }

    
            


    
    
    
    
    
    
    
}
