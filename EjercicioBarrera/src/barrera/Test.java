/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barrera;

/**
 *
 * @author peraza
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barrera b = new Barrera();
        b.agregar(new Peaton());
        b.agregar(new Automovil());
        b.agregar(new Peaton());
        b.agregar(new Automovil());
        b.agregar(new AutoFantastico());

        b.bajar();
        b.subir();
        System.out.println("--FIN--");
    }
    
}
