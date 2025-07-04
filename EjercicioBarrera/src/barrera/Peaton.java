package barrera;


import barrera.EscuchadorBarrera;
import barrera.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author peraza
 */
public class Peaton extends Persona implements EscuchadorBarrera{

    @Override
    public void bajoBarrera() {
        parar();
    }

    @Override
    public void subioBarrera() {
        caminar();
    }

    private void parar() {
        System.out.println("PARAR!!!");
    }

    private void caminar() {
        System.out.println("CAMINAR...-->");
    }
}
