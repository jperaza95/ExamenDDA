/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

/**
 *
 * @author julio
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dibujador d = new Dibujador();
        Figura[] lista = new Figura[2];
        lista[0] = new Circulo(1,"Blanco",8);
        lista[1] = new Rectangulo(2,"Azul",2,2);
        d.dibujar(lista, 1000);
    }
    
}
