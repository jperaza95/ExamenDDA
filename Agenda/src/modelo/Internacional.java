/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author peraza
 */
public class Internacional extends TipoTelefono {


    public Internacional() {
        super("Internacional");
    }
    
    
    @Override
    public void validar(Telefono tel) throws AgendaException{
        String numero = tel.getNumero();
        int desde = -1;
        if(numero.startsWith("+")) desde = 1;
        else if(numero.startsWith("00")) desde = 2;
        
        if(desde == -1) throw new AgendaException("El número debe comenzar con + o 00.");
        char c;
        int digitos=0;
        for(int x=desde; x<numero.length();x++){
            c=numero.charAt(x);
            if(c!=' ' && !Character.isDigit(c)) throw new AgendaException("Solo puede ingresar números o espacios.");
            if(Character.isDigit(c)) digitos++;
        }
        if(digitos<10) throw new AgendaException("Debe ingresar al menos 10 dígitos.");
    }
    

    
    
}
