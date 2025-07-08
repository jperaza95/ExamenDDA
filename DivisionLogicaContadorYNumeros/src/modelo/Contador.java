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
    public void restar(){
        valor-=1;
        avisar(Eventos.cambioValor);
    }
    
    public int getValor(){
        return valor;
    }
    

    
}
