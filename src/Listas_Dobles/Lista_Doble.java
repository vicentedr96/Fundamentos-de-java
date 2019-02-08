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
public class Lista_Doble {
    
    
 private Nodo primero;
 private Nodo ultimo;
 private int size;
 
 public Lista_Doble(){
 
 primero=null;
 ultimo=null;
 size=0;
 
 }
    
 public void InsertarAlFinal(int dato){

// primero =34 ultimo=34  
// primero =34 ultimo=76  
// null <-- 34 --> null   76
// null <-- 34 --> 76
// null <-- 34 --> <---76   
Nodo nuevo;
nuevo=new Nodo(dato);// aislado

if(estaVacia()){
primero=nuevo;
primero.enlaceAdelante=null;
primero.enlaceAtras=null;
ultimo=primero;
}else{
// 76
    ultimo .enlaceAdelante=nuevo;
    nuevo.enlaceAtras=ultimo;
    nuevo.enlaceAdelante=null;
    ultimo=nuevo;
}
 size++;
 }
 // de atras para adelante
public void recorrerAtras(){

Nodo aux= new Nodo();
aux=ultimo;// primero

while(aux!=null){
System.out.println(aux.getDato());
aux=aux.getEnlaceAtras();// siguiente 
}}

public void recorrerAdelante(){

Nodo aux=new Nodo();
aux=primero;

while(aux!=null){
System.out.println(aux.getDato());
aux=aux.getEnlaceAdelante();
}}
 
 
 
 public boolean estaVacia(){
 
  if(primero==null){
  return true;
  }else{
  return false;}
   
  }
 
 public void editarPorReferencia(int referencia,int valor){
 
 if(busqueda(referencia)){
 
 Nodo temp=primero;
 
 while(temp.getDato()!=referencia){
 temp=temp.getEnlaceAdelante();
 }
 temp.setDato(valor);
 }else{}
 
 
 }
 
 public void editarPorPosicion(int posicion,int dato){
 
 if(posicion>=0 && posicion<size){
 
   if(posicion==0){
   
   primero.setDato(dato);
 
   }else{
   
   Nodo temp=primero;
   int i=0;
   
   while(i<posicion){
   temp=temp.getEnlaceAdelante();
   i++;
   
   }
   temp.setDato(dato);
   
   }
 
 }else{
 
 }
 
 
 }
 
 
 public boolean busqueda(int referencia){
 
 Nodo aux=primero;
 boolean encontrado=false;
 
 while(aux!=null && encontrado!=true){
 
 if(referencia==aux.getDato()){
 encontrado=true;
 }else{
 aux=aux.getEnlaceAdelante();
 }}
 return encontrado;
 
 }
 
 public int obtenerPosicionReferencia(int referencia){
 
 if(busqueda(referencia)){
 
 Nodo temp=primero;
 int contador=1;
 
 while(temp.getDato()!=referencia){
 temp=temp.getEnlaceAdelante();
 contador++;
 }
 return contador;
 }else{
 
 return -1;

 }
 }
 
 public void InsertarInicio(int dato){
 
    Nodo nuevo=new Nodo(dato);//Nodo aislado
     
 if(primero==null){
  primero=nuevo;
  primero.enlaceAdelante=null;
  primero.enlaceAtras=null;
  ultimo=primero;
 
 }else{
    nuevo.enlaceAtras=null;// null<--8
    nuevo.enlaceAdelante=primero;//enlazo el nodo adelante a la cabeza 8-->1
    primero.enlaceAtras=nuevo;//enlazo hacia atras  8<--1
    primero=nuevo;  
                              //null<--8--><--1-->
 }size++;
 }
 
public void vaciarLista(){

   primero.setEnlaceAdelante(null);
   primero=primero.getEnlaceAdelante();

}

public void eliminarPorReferencia(int referencia){

if(busqueda(referencia)){

if(primero.getDato()==referencia){

this.eliminarPrimero();
}else{

Nodo temp=primero; //null<--1--><--2--><--3-->null
while(temp.getEnlaceAdelante().getDato()!=referencia){
temp=temp.getEnlaceAdelante();
}              
Nodo siguiente=temp.getEnlaceAdelante().getEnlaceAdelante(); // 3-->
Nodo atras=temp.getEnlaceAdelante().getEnlaceAdelante();//<--3
// enlazo
atras.setEnlaceAtras(temp);//1<--3<---
temp.setEnlaceAdelante(siguiente); //1-->3-->
size--;
}}else{}
}

public void eliminarPrimero(){

if(estaVacia()){

}else{

primero=primero.getEnlaceAdelante();
primero.setEnlaceAtras(null);
size--;
}
}

public void eliminarUltimo(){

if(estaVacia()){
//null<--8--><--4--><--3-->null
}else{
ultimo=ultimo.enlaceAtras;
ultimo.setEnlaceAdelante(null);
size--;
}
}

public int obtenerSize(){
return size;
}

public int obtenerDatoPorPosicion(int index){

int contador=0;
Nodo temporal=primero;

while(contador<index){
temporal=temporal.getEnlaceAdelante();
contador++;
}
return temporal.getDato();
}

public void insertarPorReferencia(int referencia,int valor){// falta hacia atras

Nodo nuevo=new Nodo(valor);

if(estaVacia()){
this.InsertarInicio(valor);    
}else{

if(busqueda(referencia)){

Nodo aux=primero;
while(aux.getDato()!=referencia){
aux=aux.getEnlaceAdelante();
}// null--><--1--><--2--><--3-->null
Nodo siguiente=aux.getEnlaceAdelante(); //3--->null

aux.setEnlaceAdelante(nuevo);//null<--1--->nuevo
nuevo.setEnlaceAtras(aux);//null<--1---><---nuevo
nuevo.setEnlaceAdelante(siguiente);//null--><--1--->nuevo-->  3-->null
siguiente.setEnlaceAtras(nuevo);//null--><--1--->nuevo---><---3--->null

size++;
}else{}

} }

public void insertarPorPosicion(int referencia,int valor){

if(referencia>=0 && referencia<=size){

    Nodo nuevo=new Nodo(valor);
    if(referencia==0){
    
    this.InsertarInicio(valor);
    }else{
    
     if(referencia==size){
     this.InsertarAlFinal(valor);
     }else{
     
     Nodo temp=primero;    
     int contador=0;    
     while(contador<referencia-1){ //  1.2.3  .4.5.6     
     temp=temp.getEnlaceAdelante();
     contador++;
     }
     Nodo siguiente=temp.getEnlaceAdelante();// la parte que sigue 4.5.6
     
     temp.setEnlaceAdelante(nuevo); //null<--1--->nuevo
     nuevo.setEnlaceAtras(temp);//null<--1---><---nuevo
     nuevo.setEnlaceAdelante(siguiente);//null--><--1--->nuevo-->  3-->null
     siguiente.setEnlaceAtras(nuevo);//null--><--1--->nuevo---><---3--->null

     size++;
     
     }
  
    }}}

public void cortar(int index){

 int contador=0;
 Nodo temporal=primero;
 while(contador<index-1){
 
 temporal=temporal.getEnlaceAdelante();
 contador++;
 }
 temporal.setEnlaceAdelante(null);
 size=index;


}

public void eliminarPorPosicion(int index){
if(index>=0 && index<=size){

if(index==0){

primero=primero.getEnlaceAdelante();
primero.setEnlaceAtras(null);
}else{

Nodo temp=primero;    
     int contador=0;    
     while(contador<index-1){ //  1.2.3  .4.5.6     
     temp=temp.getEnlaceAdelante();
     contador++;
     }
     Nodo siguiente=temp.getEnlaceAdelante();// la parte que sigue 4.5.6
     temp.setEnlaceAdelante(siguiente);
     siguiente.setEnlaceAtras(temp);

}



}


    
    
}




 
 
 
 
 
 
 
 
}
