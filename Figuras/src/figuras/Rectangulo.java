/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author julio
 */
public class Rectangulo extends Figura {
    
    private int ladoA,ladoB;

    @Override
    public String dibujar() {
        return "RECTANGULO HASHCODE "+hashCode();
    }

    public Rectangulo(int id, String color,int ladoA, int ladoB) {
        super(id, color);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public int area() {
        return ladoA*ladoB;
    }
    
}
