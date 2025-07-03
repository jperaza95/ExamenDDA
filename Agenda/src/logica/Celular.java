/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author peraza
 */
public class Celular extends Telefono {

    public Celular(TipoTelefono tipo, String numero) {
        super(tipo, numero);
    }

    public Celular() {
    }
    
    

    @Override
    public void validar() throws AgendaException{
        if (getNumero().length()!=9 || !esNumerico()) throw new AgendaException("Debe ingresar 9 dígitos");
        if (!getNumero().startsWith("09")) throw new AgendaException("El número debe comenzar con 09");
                
    }
    
}
