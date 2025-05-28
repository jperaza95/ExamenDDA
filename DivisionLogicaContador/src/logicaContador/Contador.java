/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaContador;

/**
 *
 * @author peraza
 */
public class Contador {
    private int valor;

    public int getValor() {
        return valor;
    }
    public void sumar(){      
        valor+=2;
    }
    public void restar(){
        valor-=5;
        if(valor<0) valor=0;
    }
}
