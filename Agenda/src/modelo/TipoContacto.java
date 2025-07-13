/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author peraza
 */
public class TipoContacto {
    String nombre;

    public TipoContacto(String nom) {
        setNombre(nom);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
 
        this.nombre = nombre.toUpperCase();
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    @Override
    public boolean equals(Object o){
        return nombre.equals(((TipoContacto)o).getNombre());
    }

    public void Validar() throws AgendaException {
        if(nombre.trim().isEmpty()|| nombre == null) throw new AgendaException("El nombre no puede estar vacío.");
  
    }
    
    
    
}
