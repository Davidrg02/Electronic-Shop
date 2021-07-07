/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.DefaultListModel;

public class ListaEnlazada {
	public Nodo cabeza;

	public ListaEnlazada(Nodo cabeza) {
		this.cabeza = cabeza;
	}

	public ListaEnlazada() {

	}
	// Insertar dato al inicio de la lista
	public void insertarInicio(Producto dato) {
		Nodo nodo = new Nodo(dato);
		nodo.setSiguienteNodo(cabeza);
		cabeza = nodo;
	}
        
        public ListaEnlazada filtrarOpinion(String opinionAFiltrar){
            ListaEnlazada listaAux = new ListaEnlazada();
            Nodo nodo = this.cabeza;
            if(nodo!=null){
               while(nodo.siguienteNodo!=null){
                if(nodo.dato.opinion.equals(opinionAFiltrar)){
                    listaAux.insertarInicio(nodo.dato);
                    // System.out.println("ingreso "+listaAux);
                }
                nodo = nodo.siguienteNodo;
            } 
            }
            
            return listaAux;
        }
        
        public void rellenarModelo(DefaultListModel modelo){
            Nodo nodo = this.cabeza;
            if(nodo!=null){
            while(nodo.siguienteNodo!=null){
                modelo.addElement(nodo.dato);
                nodo = nodo.siguienteNodo;
            }
            }
        }
	
	// Insertar dato al final de la lista
	public void insertarFinal(Producto dato) {
		Nodo nodo = new Nodo(dato);

		if (cabeza == null) {
			cabeza = nodo;
			return;
		}
		nodo.setSiguienteNodo(null);
		Nodo ultimoNodo = cabeza;

		while (ultimoNodo.getSiguienteNodo() != null) {
			ultimoNodo = ultimoNodo.getSiguienteNodo();
		}

		ultimoNodo.setSiguienteNodo(nodo);
		return;
	}
	
	// Insertar un dato despues de un nodo
	public void insertarDespuesNodo(Nodo nodoAnterior, Producto dato) {
		if (nodoAnterior == null) {
			System.out.println("No puede ser nulo el nodo anterior");
		}
		Nodo nodo = new Nodo(dato);
		nodo.setSiguienteNodo(nodoAnterior.getSiguienteNodo());
		nodoAnterior.setSiguienteNodo(nodo);

	}
	
	// Imprimir lista desde la cabeza hasta al final
	public void imprimirLista() {
		Nodo nodoImpresor = cabeza;
		while (nodoImpresor != null) {
			System.out.print(nodoImpresor.getDato() + " ");
			nodoImpresor = nodoImpresor.getSiguienteNodo();
		}
		System.out.println();
	}
	
	public void eliminarDato(Producto dato) {
		Nodo nodoEliminador = cabeza;
		Nodo nodoAnterior = null;

		if (nodoEliminador != null && nodoEliminador.getDato() == dato) {
			cabeza = nodoEliminador.getSiguienteNodo();
		}

		while (nodoEliminador != null && nodoEliminador.getDato() != dato) {
			nodoAnterior = nodoEliminador;
			nodoEliminador = nodoEliminador.getSiguienteNodo();
		}

		if (nodoEliminador == null) {
			System.out.println("El dato no existe");
		}

		nodoAnterior.setSiguienteNodo(nodoEliminador.getSiguienteNodo());
	}

	// Eliminar el nodo por indice
	public void eliminarNodo(int indice) {
		if (cabeza == null) {
			return;
		}

		Nodo nodoEliminador = cabeza;

		if (indice == 0) {
			cabeza = nodoEliminador.getSiguienteNodo();
			return;
		}

		int contadorIndice = 0;

		while (nodoEliminador != null && contadorIndice < indice - 1) {
			nodoEliminador = nodoEliminador.getSiguienteNodo();
			contadorIndice++;
		}

		if (nodoEliminador == null || nodoEliminador.getSiguienteNodo() == null) {
			return;
		}

		Nodo nodo = nodoEliminador.getSiguienteNodo().getSiguienteNodo();
		nodoEliminador.setSiguienteNodo(nodo);

	}
	
	// Se obtiene del dato por indice
	public Producto obtenerDato(int indice) {
		Nodo nodoImpresor = cabeza;
		int contadorNodo = 0;
		Producto dato = null;

		while (nodoImpresor != null) {
			if (contadorNodo == indice) {
				dato = nodoImpresor.getDato();
			}

			contadorNodo++;
			nodoImpresor = nodoImpresor.getSiguienteNodo();

		}
		return dato;
	}
	// Elimina toda la lista
	public void eliminarLista() {
		cabeza = null;
	}

	public Nodo getCabeza() {
		return cabeza;
	}

	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	

}
