/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barrera;

/**
 *
 * @author peraza
 */
public class Automovil extends Vehiculo implements EscuchadorBarrera{

    @Override
    public void bajoBarrera() {
        frenar();
    }

    @Override
    public void subioBarrera() {
        arrancar();    
    }

    private void frenar() {
        System.out.println("FRENARR!!!!");
    }

    private void arrancar() {
        System.out.println("ARRANCARR!!!");
    }
    
}
