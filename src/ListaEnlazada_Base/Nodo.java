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
public class Nodo {
    
    int datos;
    Nodo enlace;
    String dato2; //extra
    
    public Nodo(int datos,String datos2){ 
    
    this.datos=datos;
    this.dato2=datos2;//extra
    this.enlace=null;
    
    }
    
    public int getDatos(){
    return datos;
    }
    public void setDatos(int dato){
    this.datos=dato;
    }
    
    public Nodo getEnlace(){
    return enlace;
    }
    public void setEnlace(Nodo siguiente){
    this.enlace=siguiente;
    }
    
    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }
}
