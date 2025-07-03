/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author peraza
 */
public class Internacional extends Telefono {



    public Internacional(TipoTelefono tipo, String numero) {
        super(tipo, numero);
    }

    public Internacional() {
    }
    
    
    @Override
    public void validar() throws AgendaException{
        int desde = -1;
        if(getNumero().startsWith("+")) desde = 1;
        else if(getNumero().startsWith("00")) desde = 2;
        
        if(desde == -1) throw new AgendaException("El número debe comenzar con + o 00.");
        char c;
        int digitos=0;
        for(int x=desde; x<getNumero().length();x++){
            c=getNumero().charAt(x);
            if(c!=' ' && !Character.isDigit(c)) throw new AgendaException("Solo puede ingresar números o espacios.");
            if(Character.isDigit(c)) digitos++;
        }
        if(digitos<10) throw new AgendaException("Debe ingresar al menos 10 dígitos.");
    }
    
//        @Override
//    public boolean validar() {
//        String numero = getNumero();
//        
//        if(numero.startsWith("00")){   
//            return validarSubCadena(numero,2);
//        }else if(numero.startsWith("+")){
//            return validarSubCadena(numero,1);
//        }
//        return false;
//    }
//    
//    private boolean validarSubCadena(String cadena, int posInicial){
//        
//        String subCadena=cadena.substring(posInicial, cadena.length()); //subcadena luego de los primeros caracteres
//        
//        String sinEspacios = eliminarEspacios(subCadena); //subCadena sin espacios
//        
//        if(subCadena.length()<10) return false;
//        if(!esNumero(sinEspacios))return false;
//        setNumero(eliminarEspacios(cadena));
//        return true;  
//    }
//
//    private boolean esNumero(String valor) {
//        try {
//            Double.parseDouble(valor);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }
//
//    private String eliminarEspacios(String subCadena) {
//        String resultado = "";
//        for (int i = 0; i < subCadena.length(); i++) {
//            char letra = subCadena.charAt(i);
//            if(letra == ' ') resultado+="";
//            else resultado+=letra;
//        }
//        
//        return resultado;
//    }
    
    
    
}
