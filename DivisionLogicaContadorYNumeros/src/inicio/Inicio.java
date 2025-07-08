/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inicio;

import vistaEscritorio.ContadorFrame;
import iuEscritorio.VentanaNumeros;
import modelo.Contador;
import modelo.LogicaNumeros;

/**
 *
 * @author peraza
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contador logica = new Contador();
        new ContadorFrame(logica).setVisible(true);
        new ContadorFrame(logica).setVisible(true);
        new ContadorFrame(logica).setVisible(true);
                
        //InterfazUsuarioContadorA iu = new InterfazUsuarioContadorA(logica);
        //iu.iniciar();
        
        /*LogicaNumeros logica = new LogicaNumeros();
        new VentanaNumeros(logica).setVisible(true);
        new VentanaNumeros(logica).setVisible(true);
        new VentanaNumeros(logica).setVisible(true);*/
        
    }
    
}
