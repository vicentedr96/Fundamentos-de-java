/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas_Dobles;

import java.util.Scanner;

/**
 *
 * @author vicente96
 */
public class Principal {
    
 public static void main(String args[]){
 
/* 
 Lista_Doble lista =new Lista_Doble();
 
 lista.InsertarAlFinal(34);
 lista.InsertarAlFinal(76);
 lista.InsertarAlFinal(27);
 
 lista.recorrerAdelante();
 System.out.println("***");
 lista.recorrerAtras();
 */
Lista_Doble ld=new Lista_Doble ();
Scanner dame=new Scanner (System.in);
 int seleccion=0,dato=0;
 do{
 System.out.println("-1.Salir");
 System.out.println("1.Insertar Numero al final");
 System.out.println("2.Busqueda por referencia");
 System.out.println("3.Recorrer hacia adelante");
 System.out.println("4.Recorrer hacia atras");
 System.out.println("5.Obtener Posicion Por Referencia");
 System.out.println("6.Insertar Numero al Principio");
 System.out.println("7.Editar Por Referencia");
 System.out.println("8.Editar Por Posicion");
 System.out.println("9.Vaciar Lista");
 System.out.println("10.Eliminar Por Referencia");
 System.out.println("11.Eliminar Primero");
 System.out.println("12.Eliminar Ultimo");
 System.out.println("13.Obtener Tamaño");
 System.out.println("14.Obtener Dato Por Posicion");
 System.out.println("15.Insertar Por Referencia");
 System.out.println("16.InsertatPorPosicion");
 System.out.println("17.Cortar");
 
 
 seleccion=dame.nextInt();
 int aux=0,aux1=0;
 switch(seleccion){
 
     case 1:
         System.out.println("Dato a insertar");
         aux=dame.nextInt();
         ld.InsertarAlFinal(aux);
     break;

     case 2:
         System.out.println("Que dato buscas");
         aux=dame.nextInt();
         System.out.println( ld.busqueda(aux));
         
     break;
     
     case 3:
         System.out.println("Recorrido hacia adelante");
         ld.recorrerAdelante();
     break;
     
     case 4:
        System.out.println("Recorrido hacia atras");
        ld.recorrerAtras();
     break;  
     
     case 5:
        System.out.println("Dame el dato");
        dato=dame.nextInt();
        aux1=ld.obtenerPosicionReferencia(dato);
        System.out.println("Esta en la posicion:  "+aux1 ); 
         
     break;
     
     case 6:
         
        System.out.println("Dato a insertar: ");
        dato=dame.nextInt();
        ld.InsertarInicio(dato);
     break;
     
     case 7:
        System.out.println("Dato de referencia a modificar");
        aux1=dame.nextInt();
        System.out.println("Dato a insertar:");
        dato=dame.nextInt();
        ld.editarPorReferencia(aux1, dato);
     break;
     
     case 8:
         System.out.println("Dame la posicion ");
         aux1=dame.nextInt();
         System.out.println("Dato a insertar:");
         dato=dame.nextInt();
         ld.editarPorPosicion(aux1, dato);
         
     break;
     
     case 9:
        ld.vaciarLista();
        System.out.println("Se vacio la lista");
    
     break;
     
     case 10:
         System.out.println("Dame la referencia");
         dato=dame.nextInt();
         ld.eliminarPorReferencia(dato);
     
     break;
     
     case 11:
         ld.eliminarPrimero();
         System.out.println("Se ha elminado el primero");
     break;
     
     case 12:
         
         ld.eliminarUltimo();
         System.out.println("Se ha eliminado el ultimo");
         
     break;
     
     case 13:
         System.out.println("El tamaño es: "+ld.obtenerSize());

     break;
     
     case 14:
     
         System.out.println("Obtener Dato por posicion:");
         dato=dame.nextInt();
         System.out.println(ld.obtenerDatoPorPosicion(dato));
         
     break;
     
     case 15:
     
         System.out.println("Insertar Por Refencia,dame la referencia");
         dato=dame.nextInt();
         System.out.println("Insertar Valor");
         aux1=dame.nextInt();
         ld.insertarPorReferencia(dato,aux1);
         
         
     break;
     
     
     case 16:
      
         System.out.println("Insertar Por Posicion,dame la posicion");
         dato=dame.nextInt();
         System.out.println("Insertar Valor");
         aux1=dame.nextInt();
         ld.insertarPorPosicion(dato, aux1);
         
      break;
      
     case 17:
         
         System.out.println("Cortar desde: ");
         dato=dame.nextInt();
         ld.cortar(dato);
     
     default:
         
       System.out.println("No valido");
    
 }
 
 }while(seleccion!=-1);
 
 
 }
   
}
