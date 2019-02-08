/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazada_Base;

import java.util.Random;

/**
 *
 * @author vicente96
 */
public class MainNumAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random random = new Random();
        Listas_Enlazadas lista=new Listas_Enlazadas();
        int n,d;
       //for(int i=0; i<10; i++){
       //int x=random.nextInt(6-3+1)+3;
       //System.out.println(x);
       //rnd.nextInt(HASTA-DESDE+1)+DESDE
        //}
        
        n=random.nextInt(10-1+1)+1;
        
        for(; n>0; n--){
        
        d=random.nextInt(5-1+1)+1;
        lista.InsertarInicio(d, "juana");
            
        }
        
        System.out.println("Elementos generado al aar");
        lista.visualizar();
        
        
        
    }
    
}
