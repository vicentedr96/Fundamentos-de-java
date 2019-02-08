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
public class Listas_Enlazadas {
    
    private Nodo primero;
    private int size;
    
    public Listas_Enlazadas(){
    primero=null;
    size=0; 
    }
    
  public int obtenerSize(){  
  return size;
  }
  
 public int obtenerPosicionReferencia(int referencia){
 
 if(busqueda(referencia)){
 
 Nodo temp=primero; // creo una copia
 int contador=0;// para contar la posicion

 while(temp.getDatos()!=referencia){ //mienstras no se ha el valor buscado
 temp=temp.getEnlace();
 contador++;
 }
 return contador; // doy la posicion
 }else{
 
 System.out.println("inexistente");
 return -1;
 }}
    
  public int ObtenerDato1Index(int index){//reparar****empieza desde 0
  //1,2,3,4
  int contador=0;
  Nodo temporal=primero;
  
  while(contador<index){//2<2
  temporal=temporal.getEnlace();//2
  contador++;//1
  }
  return temporal.getDatos();
  }
  
  
    
  public void visualizar(){
  
  Nodo temporal=primero;
  while(temporal!=null){
  
  System.out.println("Dato1: "+temporal.getDatos());
  System.out.println("Dato2: "+temporal.getDato2());
  temporal=temporal.getEnlace();
  } }
  
  
 public boolean busqueda (int referencia){
 
 Nodo aux=primero; // copia de la lista
 boolean encontrado=false; 
 
 while(aux!=null && encontrado!=true){ // mientras se ha disntino a null y mientras se ha true
 
 if(referencia==aux.getDatos()){
 encontrado=true;
 }else{
 aux=aux.getEnlace();  
 }}
 return encontrado;
 }  
  
 public void cortar(int index){
    
 int contador=0;
 Nodo temporal=primero;
 while(contador<index-1){
   
 temporal=temporal.getEnlace();
 contador++;
 }
 temporal.setEnlace(null);
 size=index;
    
  }
  
 public void vaciarLista(){

 primero.setEnlace(null);
 primero=primero.getEnlace();
 
 }
  
  public boolean estaVacio(){
    
  if(primero==null){
  return true;
  }else{
    
  return false;}
  } 
  

    
 
    

    
  public void EliminarPrimero(){
  if(estaVacio()){

  }else{
  primero = primero.getEnlace();
  size--;
  }
  }
    
    
  public void EliminarUltimo(){
  if(estaVacio()){

  }else{
  Nodo temp=primero;
    
  while(temp.getEnlace().getEnlace()!=null){
  temp=temp.getEnlace();
    
  }
  temp.setEnlace(null);
  size--;
  }
    // 1.2.3.4.5
    //1,2,3,4-null-
        
    
    }
    
 public void eliminarPorPosicion(int index){
    
 if(index>=0 && index<size){       
 if(index==0){
        
 primero=primero.getEnlace();
        
 }else{
        
    //1 -> 2-> 3 ->4 ->5->6
    //1 ->2->4->5->6
    // con elemtos con no se han la cabeza
 int contador=0;
 Nodo temporal= primero;
 while(contador< index-1){ //uno antes
     
 temporal=temporal.getEnlace(); 
 contador++;
 }
 temporal.setEnlace(temporal.getEnlace().getEnlace()); // me brinco hasta el siguiente
   
 }
 size--;
 }else{
 System.out.println("no valido");
 }
 }
 
 public void eliminarPorReferencia(int referencia){
 
 if(busqueda(referencia)){
 
 if(primero.getDatos()==referencia){
 
 this.EliminarPrimero();
 }else{
 
 Nodo temp=primero;
 while(temp.getEnlace().getDatos()!=referencia){
 temp=temp.getEnlace();
 }
 Nodo siguiente=temp.getEnlace().getEnlace();
 temp.setEnlace(siguiente);
 size--;
// temp.setEnlace(temp.getEnlace().getEnlace()); es similar
 }
 }else{}} 

 
 
 

  public void  InsertarInicio(int dato,String dato2){
    
  if(primero==null){
        
  primero=new Nodo(dato,dato2);
        
  }else{
        
    Nodo temp=primero; // la copia de la cabeza
    Nodo nuevo=new Nodo(dato,dato2);//aislado        
    nuevo.setEnlace(temp);//enlazo nuevo nodo a la cabeza 8-->1-->null
    primero=nuevo;//actualizo 
       }
    size++;
    
  }

    
 public void insertarAlFinal2(int d,String d2){
      
       
 if(primero==null){ // en caso de que se ha el primero
    
 primero=new Nodo(d,d2); 
    
 }else{      
 Nodo nuevo=new Nodo(d,d2);  // creo el nodo
 Nodo tempF=primero; //hago una copia de cabeza

 while(tempF.getEnlace()!=null){ //comparo si el siguiente nodo no este vacio 
 tempF=tempF.getEnlace();
  }
 tempF.setEnlace(nuevo); //enlazo
  //primero=tempF; //actualizo
 }
 size++; 
 }
    
  
         
public void insertarPorReferencia(int referencia, int valor,String valor2){
        // Define un nuevo nodo.
 Nodo nuevo = new Nodo(valor,valor2);
   
        // Verifica si la lista contiene elementos
 if (this.estaVacio()) {
 this.InsertarInicio(valor, valor2);
 }else { // colocar buscar para verificar que exista
     if(busqueda(referencia)){
         
                // Crea ua copia de la lista.
                Nodo aux = primero;
                // Recorre la lista hasta llegar al nodo de referencia.
                while (aux.getDatos() != referencia) {
                    aux = aux.getEnlace();
                }
                // Crea un respaldo de la continuación de la lista.
                Nodo siguiente = aux.getEnlace();
                // Enlaza el nuevo nodo despues del nodo de referencia.
                aux.setEnlace(nuevo);
                // Une la continuacion de la lista al nuevo nodo.
                nuevo.setEnlace(siguiente);

                // Incrementa el contador de tamaño de la lista.
                size++;
        }else{ }
 
 }  }

  
        
 public void insertarPorPosicion(int referencia,int valor,String valor2){//checar el size
    
 if(referencia>=0 && referencia<=size){
    
 Nodo nuevo =new Nodo(valor,valor2);    
        
    if(referencia==0){
        
    this.InsertarInicio(valor, valor2);
        
    }else{
        
    if(referencia==size){
        
    this.insertarAlFinal2(valor, valor2);
        
    }else{
        
    Nodo temp=primero;
    int contador=0;
        
    while(contador<referencia-1){  //  1.2.3  .4.5.6     
    temp=temp.getEnlace();
    contador++;
        }
        
    Nodo siguiente=temp.getEnlace(); // la parte que sigue 4.5.6
    nuevo.setEnlace(siguiente); /// el nodo aislado ahora tiene referencia a siguiente n 4.5.6
    temp.setEnlace(nuevo);// 1.2.3.n.4.5.6
     size++;
       }
       }
      
       }
       }
    
 

    

    


 public void editarPorPosicion(int posicion,int valor,String valor2){
 
 if(posicion>=0 && posicion<size){
 
 if(posicion==0){
 
     primero.setDatos(valor);
     primero.setDato2(valor2);
     
 }else{
 
 // en caso que el nodo a eliminar este en medio
  Nodo temp=primero; //copia de la cabeza
  int i=0;
  
  while(i<posicion){ // lo recorro hasta llegar
  temp=temp.getEnlace();
  i++;
  }
  temp.setDatos(valor);
  temp.setDato2(valor2);
  } }
  }
 
 public void editarPorReferencia(int referencia,int valor,String valor2){
     
  if(busqueda(referencia)){
  
  Nodo temp=primero;
  
  while(temp.getDatos()!=referencia){
  temp=temp.getEnlace();
  }
  temp.setDatos(valor);
  temp.setDato2(valor2);
  }
 }
 
 
 
 

  



}