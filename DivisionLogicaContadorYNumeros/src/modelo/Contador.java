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
public class Contador extends Observable{
    
    private int valor=1;
    
    public enum Eventos{cambioValor}
    
    public void sumar(){
        valor+=1;
        avisar(Eventos.cambioValor);
    }
    public void restar() throws ContadorException{
        if(valor==0) throw new ContadorException("El contador no puede ser negativo");
        valor-=1;
        avisar(Eventos.cambioValor);
    }
    
    public int getValor(){
        return valor;
    }
    

    
}
