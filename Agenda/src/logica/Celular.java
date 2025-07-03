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
    public boolean validar() {
        return getNumero().length()==9 && esNumerico() && getNumero().startsWith("09");
    }
    
}
