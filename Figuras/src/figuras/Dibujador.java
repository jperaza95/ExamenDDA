/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author julio
 */
public class Dibujador {
    public void dibujar(Figura[] lista, int maxArea){
        Figura f;
        for(int x=0;x<lista.length;x++){
            f=lista[x];
            if (f.area()<maxArea) {
                System.out.println(f.dibujar());
            }
        }
    }
}
