/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author peraza
 */
public class Celular extends TipoTelefono {


    public Celular(){
       super("Celular");
    }
    

    @Override
    public void validar(Telefono tel) throws AgendaException{
        String numero = tel.getNumero();

        if (numero.length()!=9 || !esNumerico(numero)) throw new AgendaException("Debe ingresar 9 dígitos");
        if (!numero.startsWith("09")) throw new AgendaException("El número debe comenzar con 09");
                
    }
    
}
