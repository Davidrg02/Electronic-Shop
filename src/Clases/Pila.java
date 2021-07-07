/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.EmptyStackException;

import javax.management.RuntimeErrorException;

public class Pila {

    Producto arregloDinamico[];//Este es el arreglo Dinamico como tal que almacena lo que quieran almacenar
    int top;
    // int back;
    public int size;

    Pila(int length) {
        this.arregloDinamico = new Producto[length];

        this.size = 0;
        this.top = -1;
    }

    public Pila buscarPorNombre(String nombreABuscar) {
        Pila arrResultadoDeBusqueda = new Pila(this.arregloDinamico.length);
        Pila pilaAux = new Pila(this.arregloDinamico.length);

        Producto auxP;
        int auxtop = top;
        for (int i = 0; i < auxtop + 1; i++) {//En el analisis asintotico, n es this.arregloCirc.length

            auxP = this.peek();//Esto se realiza n veces

            if (nombreABuscar.equals(auxP.getNombre())) {//La accion ralizada aqui se realiza n veces
                arrResultadoDeBusqueda.push(this.pop());
            } else {
                this.pop();
            }
            pilaAux.push(auxP);//Tambien se raliza n veces
        }

        for (int i = 0; i < auxtop + 1; i++) {
            this.push(pilaAux.pop());
        }

        return arrResultadoDeBusqueda;
    }

    public void push(Producto objeto) {
        this.top++;
        arregloDinamico[top] = objeto;
        if (this.top == this.arregloDinamico.length) {
            this.expandArray();
        }
    }

    public void expandArray() {
        Producto[] arregloAuxiliar = new Producto[2 * arregloDinamico.length];
        for (int u = 0; u < this.arregloDinamico.length; u++) {
            arregloAuxiliar[u] = this.arregloDinamico[u];
        }
        this.arregloDinamico = new Producto[arregloAuxiliar.length];
        this.arregloDinamico = arregloAuxiliar;
    }

    public void shrinkArray() {
        Producto[] arregloAuxiliar = new Producto[arregloDinamico.length / 2];
        for (int u = 0; u < this.arregloDinamico.length / 2; u++) {
            arregloAuxiliar[u] = this.arregloDinamico[u];
        }
        this.arregloDinamico = new Producto[arregloDinamico.length];
        this.arregloDinamico = arregloAuxiliar;
    }

    public Producto pop() {
        return this.arregloDinamico[top--];
    }

    public Producto peek() {

        return this.arregloDinamico[top];
    }

    public void print() {
        Producto auxProd;
        Pila pilaAux = new Pila(this.arregloDinamico.length);
        int auxtop = this.top;
        for (int i = 0; i < auxtop + 1; i++) {
            auxProd = this.peek();

            System.out.println(this.pop());
            pilaAux.push(auxProd);
        }
        for (int i = 0; i < auxtop + 1; i++) {
            this.push(pilaAux.pop());
        }

    }

    public boolean estaVacia() {
        return (top == -1);
    }
}
