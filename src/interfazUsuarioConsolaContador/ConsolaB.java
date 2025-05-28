/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazUsuarioConsolaContador;

import java.util.ArrayList;
import logicaContador.Contador;
import utilidades.Consola;

/**
 *
 * @author peraza
 */
public class ConsolaB {
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
        System.out.println("El contador vale: "+contador.getValor());
    }

    private int procesarOpcion() {
        ArrayList<String> opciones = new ArrayList();
        opciones.add("SUMAR");
        opciones.add("RESTAR");
        opciones.add("SALIR");
        return Consola.menu(opciones);

    }
    
}
