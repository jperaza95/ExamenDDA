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
    private int stock;
    private Proveedor proveedor;
    private int codigo;

    public Producto() {
    }

    public Producto(String nombre, float precio, int stock, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;

        //proveedor.agregar(this);
    }

    public int getStock() {
        return stock;
    }

    public boolean setStock(int unidades) {
        
            if(!validarUnidades(unidades))return false;
            this.stock=unidades;return true;

          
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

    public boolean setPrecio(float precio) {
        if(!validarPrecio(precio)) return false;
        this.precio = precio; return true;

    }

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {

            
            if (nombre.trim().length() <= 0) return false;
            
            this.nombre = nombre;return true;                


    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", unidades=" + stock + ", proveedor=" + proveedor + ", codigo=" + codigo + '}';
    }

    public void setCodigo(int cod) {
        codigo = cod;
    }

    private boolean validarUnidades(int unidades){
        return(unidades > 0); 
    }

    private boolean validarPrecio(float precio) {
     
        return precio>=0;


    }

    public int getCodigo() {
        return codigo;
    }

   public boolean validar() {
        return validarNombre(nombre) && validarProveedor(proveedor) && validarPrecio(precio) && validarUnidades(stock);
    }

    private boolean validarNombre(String nombre)  {
        
        if (nombre==null) return false;
        nombre = nombre.trim();
        return !nombre.equals("");

        
    }

    private boolean validarProveedor(Proveedor proveedor) {
        return proveedor != null;
    }
    
    public void restarDelStock(int cantidad){
        stock= stock - cantidad;
    }

}
