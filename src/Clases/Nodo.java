/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Nodo {
	public Producto dato;
	public Nodo siguienteNodo;

	public Nodo(Producto dato) {
		this.dato = dato;
	}

	public Producto getDato() {
		return dato;
	}

	public void setDato(Producto dato) {
		this.dato = dato;
	}

	public Nodo getSiguienteNodo() {
		return siguienteNodo;
	}

	public void setSiguienteNodo(Nodo siguienteNodo) {
		this.siguienteNodo = siguienteNodo;
	}

}
