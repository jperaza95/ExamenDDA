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

    @Override
    public boolean validar() {
       return getNumero().length()==8 && esNumerico();
                
    }
    
    
    
}
