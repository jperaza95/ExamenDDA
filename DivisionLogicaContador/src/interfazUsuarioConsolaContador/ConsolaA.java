/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazUsuarioConsolaContador;

import logicaContador.Contador;
import utilidades.Consola;

/**
 *
 * @author peraza
 */
public class ConsolaA {
    private Contador contador = new Contador();
    
    public void mostrar(){
        boolean salir=false;
        do{
            mostrarContador();
            int opcion = procesarOpcion();
            switch (opcion) {
                case 0: contador.sumar(); break;
                case 1: contador.restar();break; 
                case 2: salir=true;break;
            }
            
        }while(!salir);
        System.out.println("*********FIN*********");
    }

    private void mostrarContador() {
        System.out.println("Contador: "+contador.getValor());
    }

    private int procesarOpcion() {
        String letra = Consola.leer("Ingrese 'S' para sumar o 'R' para restar o 'F' para finalizar:\n ");
        letra = letra.toUpperCase();
        if (letra.equals("S")) return 0;
        if (letra.equals("R")) return 1;
        if (letra.equals("F")) return 2;
        return -1;


    }
    
}
