/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author julio
 */
public class AlarmaSilenciosa implements EscuchadorSensor{

    @Override
    public void hayActividad() {
        llamarPorTelefono();
    }

    @Override
    public void hayReposo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void llamarPorTelefono() {
        System.out.print("Llamando por telefono... "+getClass().getName()+" - " + hashCode());
    }
    
}
