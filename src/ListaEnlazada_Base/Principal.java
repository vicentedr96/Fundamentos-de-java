/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazada_Base;

/**
 *
 * @author vicente96
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
Listas_Enlazadas lista=new Listas_Enlazadas();

/**lista.InsertarInicio(1,"Juna");
lista.InsertarInicio(2,"yami");
lista.InsertarInicio(3,"diego");
lista.InsertarInicio(4,"perla");
lista.InsertarInicio(5,"perla2");



lista.visualizar();
System.out.println(lista.getDato1Index(0));
lista.insertarPorReferencia(1,999,"nuevo");
lista.visualizar();
    
         */

    lista.insertarAlFinal2(1, "juan");
    lista.insertarAlFinal2(2, "pedro");
    lista.insertarAlFinal2(3, "santiago");
    lista.insertarAlFinal2(4, "perla");

  lista.eliminarPorReferencia(4);
    lista.visualizar();
    System.out.println("***"+lista.ObtenerDato1Index(0));

    

 
    }}
