/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author peraza
 */
public abstract class Telefono {

    private TipoTelefono tipo;
    private String numero;

    public Telefono(TipoTelefono tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public TipoTelefono getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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

    public abstract boolean validar();

}
