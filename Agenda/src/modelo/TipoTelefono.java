/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author peraza
 */
public abstract class TipoTelefono {
    private String nombre;

    public TipoTelefono(String nombre) {
        this.nombre = nombre;
    }
    
    public TipoTelefono(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public boolean esNumerico(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public abstract void validar(Telefono tel) throws AgendaException;
    
}
