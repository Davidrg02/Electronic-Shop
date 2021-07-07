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

import java.io.BufferedReader;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.util.Scanner;

public class Lector {
	public Lector() {
	}

	public Producto[] AgregarProductosArreglo(String nombreArchivo, Producto[] arregloProductos) {
		String nombreFichero = nombreArchivo;
		// Declarar una variable BufferedReader
		BufferedReader br = null;
		try {
			// Crear un objeto BufferedReader al que se le pasa
			// un objeto FileReader con el nombre del fichero
		      br = new BufferedReader(new FileReader(nombreFichero));
			// Leer la primera l�nea, guardando en un String
			String texto = br.readLine();
			// Repetir mientras no se llegue al final del fichero
			int indice = 0;
			int id =0 ;
			while (texto != null) {
				id++;
				String[] atributosProducto = texto.split(";");

				String nombre = atributosProducto[0];
				int precio = Integer.parseInt(atributosProducto[1]);
				String categoria = atributosProducto[2];
				String marca = atributosProducto[3];
				String opinion = atributosProducto[4];

				// Hacer lo que sea con la l�nea le�da
				Producto auxP = new Producto(id,precio, nombre, categoria, opinion, marca);
				indice++;

				// Leer la siguiente l�nea
				texto = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error de lectura del fichero");
			System.out.println("****************************");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar el fichero");
				System.out.println("****************************");
				System.out.println(e.getMessage());
			}
		}
		return arregloProductos;
	}
        
        public ArregloCircular AgregarProductosColaArrCirc(String nombreArchivo, int length) {

		ArregloCircular arregloProductos = new ArregloCircular(length);

		String nombreFichero = nombreArchivo;
		// Declarar una variable BufferedReader
		BufferedReader br = null;
		try {
			// Crear un objeto BufferedReader al que se le pasa
			// un objeto FileReader con el nombre del fichero
		      br = new BufferedReader(new FileReader(nombreFichero));
			// Leer la primera l�nea, guardando en un String
			String texto = br.readLine();
			// Repetir mientras no se llegue al final del fichero
			int id =0;
			while (texto != null) {
				id++;
				String[] atributosProducto = texto.split(";");

				String nombre = atributosProducto[1];
				int precio = Integer.parseInt(atributosProducto[0]);
				String categoria = atributosProducto[2];
				String marca = atributosProducto[4];
				String opinion = atributosProducto[3];

				// Hacer lo que sea con la l�nea le�da
				Producto auxP = new Producto(id,precio, nombre, categoria, opinion, marca);
				arregloProductos.encolar(auxP);

				// Leer la siguiente l�nea
				texto = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error de lectura del fichero Cola");
			System.out.println("****************************");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar el fichero Cola");
				System.out.println("****************************");
				System.out.println(e.getMessage());
			}
		}
		return arregloProductos;
	}

	public Pila AgregarProductosPila(String nombreArchivo, int length) {

		Pila arregloProductos = new Pila(length);

		String nombreFichero = nombreArchivo;
		// Declarar una variable BufferedReader
		BufferedReader br = null;
		try {
			// Crear un objeto BufferedReader al que se le pasa
			// un objeto FileReader con el nombre del fichero
		      br = new BufferedReader(new FileReader(nombreFichero));
			// Leer la primera l�nea, guardando en un String
			String texto = br.readLine();
			// Repetir mientras no se llegue al final del fichero
			int id = 0;
			while (texto != null) {
				id++;
				String[] atributosProducto = texto.split(";");

				String nombre = atributosProducto[1];
				int precio = Integer.parseInt(atributosProducto[0]);
				String categoria = atributosProducto[2];
				String marca = atributosProducto[4];
				String opinion = atributosProducto[3];

				// Hacer lo que sea con la l�nea le�da
				Producto auxP = new Producto(id,precio, nombre, categoria, opinion, marca);
				arregloProductos.push(auxP);

				// Leer la siguiente l�nea
				texto = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error de lectura del fichero Pila");
			System.out.println("****************************");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar el fichero Pila");
				System.out.println("****************************");
				System.out.println(e.getMessage());
			}
		}
		return arregloProductos;
	}

	

	public Arbol AgregarProductosArbol(String nombreArchivo) {

		Arbol arbolProductos = new Arbol();
		String nombreFichero = nombreArchivo;
		// Declarar una variable BufferedReader
		BufferedReader br = null;
		try {
			// Crear un objeto BufferedReader al que se le pasa
			// un objeto FileReader con el nombre del fichero
		      br = new BufferedReader(new FileReader(nombreFichero));
			// Leer la primera l�nea, guardando en un String
			String texto = br.readLine();
			int id = 0;
			// Repetir mientras no se llegue al final del fichero
			while (texto != null) {
				id++;
				String[] atributosProducto = texto.split(";");

				String nombre = atributosProducto[1];
				int precio = Integer.parseInt(atributosProducto[0]);
				String categoria = atributosProducto[2];
				String marca = atributosProducto[4];
				String opinion = atributosProducto[3];

				// Hacer lo que sea con la l�nea le�da
				Producto auxP = new Producto(id,precio, nombre, categoria, opinion, marca);
				arbolProductos.insertar(auxP);

				// Leer la siguiente l�nea
				texto = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error de lectura del fichero Arbol");
			System.out.println("****************************");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar el fichero Arbol");
				System.out.println("****************************");
				System.out.println(e.getMessage());
			}
		}
		return arbolProductos;
	}	

}



