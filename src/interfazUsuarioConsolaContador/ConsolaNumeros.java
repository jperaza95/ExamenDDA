/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazUsuarioConsolaContador;

import java.util.ArrayList;
import logicaNumeros.LogicaNumeros;
import utilidades.Consola;

/**
 *
 * @author peraza
 */
public class ConsolaNumeros {

    private LogicaNumeros logica = new LogicaNumeros();

    public void iniciar() {
        
        String seguir;
        
        do {
            inicializar();
            do {
                pedirNumero();
            } while (!logica.hayResultado());
            
            mostrarResultados();
            seguir=Consola.leer("Correr de nuevo? (s/n)");
            
            
        } while (seguir.equalsIgnoreCase("s"));

    }




    private void ingresarNumero() {
        int valor = Consola.leerInt("Ingrese un valor: ");
        logica.ingresar(valor);
    }

    private void mostrarResultados() {
     ArrayList<Integer> resultado = logica.getResultado();
        for (Integer num : resultado) {
            Consola.println(num);
        }

    }

    private void mostrarFaltan() {
        Consola.println("Faltan ingresar "+logica.getCantidad()+" numeros");
    }

    private void inicializar(){
        while(!logica.iniciar(Consola.leerInt("Cantidad inicial: "))){
            System.out.println("Cantidad no válida");
        }
    }

    private void pedirNumero() {
        System.out.println("Faltan: "+ logica.faltan()+" numeros por ingresar");
        logica.ingresar(Consola.leerInt("Numero: "));
    }
    
}
