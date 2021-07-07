/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author danie
 */

import java.util.Arrays;
import javax.swing.DefaultListModel;

public class ArregloCircular{//Cola implementada como arreglo circular
    
    Producto arregloCirc[];//Este es el arreglo circular como tal que almacena lo que quieran almacenar
    int front;
    int back;
    public int size;

    public ArregloCircular(int length){
        int potencia = 4;
        while(potencia<=length){
            potencia = potencia*2;
        }
        this.arregloCirc = new Producto [potencia];
        this.front = 0;
        this.back = 0;
    }

    public ArregloCircular buscarPorNombre(String nombreABuscar){
        ArregloCircular arrResultadoDeBusqueda = new ArregloCircular(this.arregloCirc.length);
        Producto auxP;
        for(int i =0; i<size; i++){//En enl analisis asintotico, n es this.arregloCirc.length      
                
                auxP = this.peek();//Esto se realiza n veces    

            if(nombreABuscar.equals(auxP.getNombre())){//La accion ralizada aqui se realiza n veces
                arrResultadoDeBusqueda.encolar(this.desencolar());
            }   else{
                this.desencolar();
            }
            this.encolar(auxP);//Tambien se raliza n veces
        }
        return arrResultadoDeBusqueda;
    }
        
    
    public void rellenarModelo(DefaultListModel modelo){
        ArregloCircular arrAux = new ArregloCircular(this.arregloCirc.length);
            for(int i =0; i<this.arregloCirc.length; i++){
              
            Producto auxP = this.peek();

            modelo.addElement(this.desencolar());

            this.encolar(auxP);
        }
    }
    



     public ArregloCircular filtrarPorMarca(String marcaAFiltrar){
        ArregloCircular arrResultadoDeBusqueda = new ArregloCircular(this.arregloCirc.length);
        Producto auxP;
        for(int i =0; i<this.arregloCirc.length; i++){
                
               // System.out.println(this.size);
               // System.out.println(i);
                auxP = this.peek();
                        //System.out.println(auxP.getMarca()+" "+marcaAFiltrar);

            if(marcaAFiltrar.equals(auxP.getMarca())){

                arrResultadoDeBusqueda.encolar(this.desencolar());

            }   else{
                this.desencolar();
            }
            this.encolar(auxP);
        }
        return arrResultadoDeBusqueda;
    }

    public ArregloCircular ordenarPorPrecio(Boolean menorAmayor){//ordena de menor a mayor (el menor queda al principio) si menorAmayor = 1, si no al reves
        Producto arrProductos[] = (Producto []) new Comparable[this.size];
        ArregloCircular arrCircProductosOrdenado = new ArregloCircular(this.arregloCirc.length);
        for(int i=0; i<size;i++){
            arrProductos[i] =  this.desencolar();
        }
        Arrays.sort(arrProductos);
        if(menorAmayor){
            for(int i = 0; i<size; i++){
                arrCircProductosOrdenado.encolar(arrProductos[i]);
            }
        }else{
            for(int i = 0; i<size; i++){
                arrCircProductosOrdenado.encolar(arrProductos[size-i]);
            }
        }

        return arrCircProductosOrdenado;
    }

    public ArregloCircular filtrarPorCategoria(String categoriaAFiltrar){
        ArregloCircular arrResultadoDeBusqueda = new ArregloCircular(this.arregloCirc.length);
        Producto auxP;
        System.out.println(this.arregloCirc.length);
        for(int i =0; i<this.arregloCirc.length; i++){
                
                auxP = this.peek();

            if(categoriaAFiltrar.equals(auxP.getCategoria())){
                arrResultadoDeBusqueda.encolar(this.desencolar());
            }   else{
                this.desencolar();
            }
            this.encolar(auxP);
        }
        return arrResultadoDeBusqueda;
    }

    

    public void encolar(Producto objeto){
        arregloCirc[back] = objeto;
        this.back = this.next(back);
        //System.out.println(back);
        if(this.back==front){
            this.expandArray();
        }
        this.size++;
    }

    public void expandArray(){
        Producto[] arregloAuxiliar = new Producto[2*arregloCirc.length];
        int i = front;
        this.front = 0;
        this.back = this.arregloCirc.length;
        for(int u = 0; u<this.arregloCirc.length; u++){
            arregloAuxiliar[u] = this.arregloCirc[i];
            i=this.next(i);
        }
        this.arregloCirc = new Producto[arregloAuxiliar.length];
        this.arregloCirc = arregloAuxiliar;
    }

    public void shrinkArray(){
        Producto[] arregloAuxiliar = new Producto[arregloCirc.length/2];
        for(int u = 0; u<this.arregloCirc.length/2; u++){
            arregloAuxiliar[u] = this.arregloCirc[u];
        }
        this.arregloCirc = new Producto[arregloAuxiliar.length];
        this.arregloCirc = arregloAuxiliar;
    }

    public int next(int index){
        if(index==this.arregloCirc.length-1){
            return 0;
        }else{
            return index+1;
        }
    }

    public int behind(int index){
        if(index==0){
            return arregloCirc.length-1;
        }else{
            return index-1;}
    }

    public Producto desencolar(){
        this.size--;
        int auxInt = this.front;
        this.front = this.next(front);

        return arregloCirc[auxInt];
    }

    public Producto peek(){

        return this.arregloCirc[front];
    }

    public void print(){
        Producto auxProd; 
        for(int i =0; i<size;i++){
            auxProd =  this.peek();
            System.out.println(this.desencolar());
            this.encolar(auxProd);  

        }
    }  
}
