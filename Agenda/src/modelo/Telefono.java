/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import utilidades.Observable;

/**
 *
 * @author peraza
 */
public class Telefono extends Observable{

    private TipoTelefono tipoTelefono;
    private String numero;

    public Telefono(TipoTelefono tipo, String numero){
        this.tipoTelefono = tipo;
        this.numero = numero;
    }

    public Telefono() {
    }
    
    public enum Eventos{contactoModificado}

    public void setTipoTelefono(TipoTelefono tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
    
    

    public TipoTelefono getTipoTelefono() {
        return tipoTelefono;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
    
    

    public boolean equals(Object obj) {
        Telefono t = (Telefono) obj;
        return t.getNumero().equals(getNumero());
    }

    public boolean esNumerico() {
        try {
            Double.parseDouble(getNumero());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void validar() throws AgendaException{
        tipoTelefono.validar(this);
    }

    public void modificar(String num, TipoTelefono tipo) throws AgendaException {
        String numeroBkp = this.numero;
        TipoTelefono tipoTelBkp = this.tipoTelefono;
        
        setNumero(num);
        setTipoTelefono(tipo);
        try {
            validar();
            avisar(Eventos.contactoModificado);
            
        } catch (AgendaException e) {
            setNumero(numeroBkp);
            setTipoTelefono(tipoTelBkp);
            throw e;
            
        }
    }

}
