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
public class Producto {

    private String nombre;
    private float precio;
    private int unidades;
    private Proveedor proveedor;
    private int codigo;

    public Producto() {
    }

    public Producto(String nombre, float precio, int stock, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = stock;
        this.proveedor = proveedor;

        //proveedor.agregar(this);
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) throws PracticoException {
        
            validarUnidades(unidades);
            this.unidades=unidades;

          
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) throws PracticoException {
        validarPrecio(precio);
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws PracticoException {

            
            if (nombre.trim().length() <= 0) throw new PracticoException("El nombre no puede estar vacío.");
            
            this.nombre = nombre;                


    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", unidades=" + unidades + ", proveedor=" + proveedor + ", codigo=" + codigo + '}';
    }

    public void setCodigo(int cod) {
        codigo = cod;
    }

    private void validarUnidades(int unidades) throws PracticoException {
        if(unidades <= 0) throw new PracticoException("Cantidad inválida");
    }

    private void validarPrecio(float precio) throws PracticoException {
     
        if(precio<0) throw new PracticoException("Precio no puede ser negativo");


    }

    public int getCodigo() {
        return codigo;
    }

//    boolean validar() {
//        return validarNombre(nombre) && validarProveedor(proveedor) && validarPrecio(precio) && validarUnidades(unidades);
//    }

    private void validarNombre(String nombre) throws PracticoException {

        
        if (nombre==null || nombre.trim().equals("")) throw new PracticoException("El nombre no puede ser vacío");

        
    }

    private boolean validarProveedor(Proveedor proveedor) {
        return proveedor != null;
    }

}
