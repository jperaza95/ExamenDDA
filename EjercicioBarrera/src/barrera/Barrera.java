/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barrera;

import java.util.ArrayList;

/**
 *
 * @author peraza
 */
public class Barrera {
    private boolean arriba = true;
    
    private ArrayList<EscuchadorBarrera> escuchadores = new ArrayList();
    
    public void agregar(EscuchadorBarrera e){
        if(!escuchadores.contains(e)){
            escuchadores.add(e);
        }
    }
    
    public void quitar(EscuchadorBarrera e){
        escuchadores.remove(e);
    }
    
    public void subir(){
        System.out.println("===SUBIR===");
        if (!arriba) {
            arriba=true;
            avisar();
        }
    }
    
    public void bajar(){
        System.out.println("===BAJAR===");
        if (arriba) {
            arriba=false;
            avisar();
        }
    }    
    

    private void avisar() {
        for (EscuchadorBarrera e : escuchadores) {
            System.out.print(e.getClass().getName()+" : "+e.hashCode()+" ");
            if(arriba) e.subioBarrera();
            else e.bajoBarrera();
        }
    }
    
}
