/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaConsola;

import controlador.ControladorContador;
import controlador.VistaContador;
import java.util.ArrayList;
import modelo.Contador;
import utilidades.Consola;
import vistaEscritorio.ContadorFrame;

/**
 *
 * @author peraza
 */
public class ContadorConsola implements VistaContador
{
    ControladorContador controlador;
    
    public ContadorConsola(Contador c){
        controlador = new ControladorContador(c, this);
        pedirOpcion();
    }
    
    @Override
    public void mostrarValor(int valor) {
        System.out.println("VALOR: "+ valor);
    }

    @Override
    public void crearNuevaVista(Contador contador) {
        new ContadorFrame(contador).setVisible(true);
    }

    private void pedirOpcion() {
        ArrayList<String> opciones = new ArrayList();
        opciones.add("Sumar");
        opciones.add("Restar");
        opciones.add("Nueva");
        opciones.add("Salir");
        int op;
        
        do{
            op=Consola.menu(opciones);
            switch(op){
                case 0 :controlador.sumar();break;
                case 1 :controlador.restar();break;
                case 2: controlador.crearNuevaIUParaEsteContador();break;
                
            }
        }while(op!=3);
        controlador.salir();
        System.out.println("***FIN***");
    }

    @Override
    public void mostrarError(String message) {
        System.out.println("Error "+message);
    }
    
}
