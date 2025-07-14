/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author peraza
 */
public class Fijo extends TipoTelefono{

    public Fijo() {
        super("Fijo");
    }
    

    @Override
    public void validar(Telefono tel) throws AgendaException{
       String numero = tel.getNumero();

       if(numero.length()!=8 || !esNumerico(numero)) throw new AgendaException("Debe ingresar 8 dígitos.");
                
    }


    
    
    
}
