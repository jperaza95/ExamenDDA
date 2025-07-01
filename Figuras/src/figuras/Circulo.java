/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author julio
 */
public class Circulo extends Figura{
    
    private int radio;

    public Circulo(int id, String color, int radio) {
        super(id, color);
        this.radio=radio;
    }

    @Override
    public String dibujar() {
        return "Soy un circulo de radio "+ radio + ", color " + getColor()+ " y área "+area();
        
    }

    @Override
    public int area() {
        return (int)Math.PI*radio*radio;
    }
    
}
