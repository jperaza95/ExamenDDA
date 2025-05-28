/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNumeros;

import java.util.ArrayList;

/**
 *
 * @author peraza
 */
public class LogicaNumeros {

    public ArrayList<Integer> todos; 
    public ArrayList<Integer> pares; 
    public ArrayList<Integer> impares;
    public int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public boolean iniciar(int cant){
        if (cant>0) {
            cantidad=cant;
            todos=new ArrayList();
            pares = new ArrayList();
            impares = new ArrayList();
            return true;
        }
        return false;
    }
    
    public int faltan(){
        return cantidad;
    }

    
    
    public boolean ingresar(int valor){
        if (faltan()==0) return false; 
        cantidad--;    
        Integer objetoNumero=new Integer(valor);        
        todos.add(valor);
        if (valor%2==0) pares.add(valor);
        else impares.add(valor);
        return true;

    }
    
    public ArrayList<Integer> getResultado(){
        if (hayResultado()) {
            ArrayList<Integer> resultado = todos;
            if(pares.size()>impares.size()) resultado = pares;
            else if(pares.size()<impares.size()) resultado = impares;
            return resultado;
            
        }
        return null;
    
    }
    
    public boolean hayResultado(){
        return faltan()==0 && todos!=null;
    }
    
}
