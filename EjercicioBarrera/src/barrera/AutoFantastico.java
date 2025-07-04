/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barrera;

/**
 *
 * @author peraza
 */
public class AutoFantastico extends Automovil{

    @Override
    public void subioBarrera() {
        
    }

    @Override
    public void bajoBarrera() {
        saltar();
    }

    private void saltar() {
        System.out.println("!!  SALTAR !!!");
    }
    
    
    
}
