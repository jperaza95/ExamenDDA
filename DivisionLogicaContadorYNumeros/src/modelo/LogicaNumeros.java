/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import utilidades.Observable;

/**
 *
 * @author peraza
 */
public class LogicaNumeros extends Observable{

    public ArrayList<Integer> todos; 
    public ArrayList<Integer> pares; 
    public ArrayList<Integer> impares;
    public int cantidad;

    
    public int getCantidad() {
        return cantidad;
    }

    private void setCantidad (int c){
        this.cantidad = c;
        avisar(Eventos.cambioCantidad);
    }
    
    public enum Eventos{cambioCantidad,hayResultado}
    
    public void iniciar(int cant) throws NumerosException{
        if (cant<0) throw new NumerosException("La cantidad debe ser > 1");
        setCantidad(cant);
        todos=new ArrayList();
        pares = new ArrayList();
        impares = new ArrayList(); 

    }

    
    
    public int faltan(){
        return cantidad;
    }

    
    public void ingresar(int numero) throws NumerosException{
        
        if(numero<0) throw new NumerosException("El número no puede ser negativo");
        if(numero==0) {
            setCantidad(0);
        } 
        if (faltan()!=0){
            setCantidad(cantidad-1);
            Integer objetoNumero=new Integer(numero);        
            todos.add(objetoNumero);
            if (numero%2==0) pares.add(objetoNumero);
            else impares.add(objetoNumero);
        }
        
        if(hayResultado()) avisar(Eventos.hayResultado);


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