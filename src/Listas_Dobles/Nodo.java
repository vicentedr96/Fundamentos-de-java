/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas_Dobles;

/**
 *
 * @author vicente96
 */
public class Nodo {
    
    private int dato;
    Nodo enlaceAdelante;
    Nodo enlaceAtras;
    
    public Nodo(int entrada){
    
    dato=entrada;
    enlaceAdelante=null;
    enlaceAtras=null;
    
    }
    
    public Nodo(){
    
    enlaceAdelante=null;
    enlaceAtras=null;

    }
    
    
    public int getDato(){
    return dato; 
    }
    
    public void setDato(int dato){
    this.dato=dato;
    }
    
    public Nodo getEnlaceAdelante(){
    return enlaceAdelante;
    }
    
    public void setEnlaceAdelante(Nodo enlace){
    enlaceAdelante=enlace;
    }
    
    public Nodo getEnlaceAtras(){
    return enlaceAtras;
    }
    
    public void setEnlaceAtras(Nodo enlace){
    this.enlaceAtras=enlace;
    }
    
    
    
    
    
}
