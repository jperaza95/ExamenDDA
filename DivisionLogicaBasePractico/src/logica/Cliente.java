/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.time.LocalDate;

/**
 *
 * @author magda
 */
public class Cliente {
    
    private String nombre;
    private String cedula;

    public Cliente(String cedula, String nombre) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Cliente() {
        
    }

    public String getCedula() {
        return cedula;
    }

    public boolean setCedula(String unaCedula) {
        String bkup = cedula;
       if(verificarCedula(unaCedula)){
           cedula = unaCedula;
           return true;
       }else{
           cedula = bkup; 
            return false;
       }
       
       
    }
    
    public boolean verificarCedula(String cedula){
        boolean ok = false;
        if (cedula !=null){
            int digitos = cedula.length();
            String numeros = "0123456789";
            boolean soloNumeros = true;
            cedula = cedula.toLowerCase();
            for (int x=0;x<cedula.length()&&soloNumeros;x++){
                String d = cedula.charAt(x)+"";
                if (!numeros.contains(d)){
                    soloNumeros = false;
                }
            }
           
            if (soloNumeros && digitos>=6&&digitos<=8){
                ok = true;
            }    
        }
        return ok;        
    
    }
    
    public boolean verificarNombre(){
          return this.getNombre()!=null && !this.getNombre().trim().equals("");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }

    public boolean validar() {
        return verificarCedula(cedula) && verificarNombre();
    }
    
    @Override
   public boolean equals(Object o){
       Cliente c = (Cliente) o;
       return cedula.equals(c.getCedula());
             
   }
   
   

    
}
