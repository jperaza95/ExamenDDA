/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author peraza
 */
public class Fijo extends Telefono{

    public Fijo(TipoTelefono tipo, String numero) {
        super(tipo, numero);
    }

    public Fijo() {
    }
    
    

    @Override
    public void validar() throws AgendaException{
       if(getNumero().length()!=8 || !esNumerico()) throw new AgendaException("Debe ingresar 8 dígitos.");
                
    }
    
    
    
}
