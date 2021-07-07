
package Clases;


import java.nio.BufferUnderflowException;


public class ArbolBusquedaBinario<T extends Comparable<? super T>>
{
    private static class NodoBinario<T>{
        T elemento;
        // The data in the node
        NodoBinario<T> izquierda;
        // Left child
        NodoBinario<T> derecha; // 

        public NodoBinario(T elemento, NodoBinario<T> izquierda, NodoBinario<T> derecha) {
            this.elemento = elemento;
            this.izquierda = izquierda;
            this.derecha = derecha;
        }
    }

    private NodoBinario<T> raiz;

    public ArbolBusquedaBinario( ){
        raiz = null;
    }

    public void vaciarArbol( ){
        raiz = null;
    }

    public boolean estaVacio( ){
        return raiz == null;
    }

    public void insertarElemento( T elemento ){
        raiz = insertNodo( elemento, raiz );
    }


    private NodoBinario<T> insertNodo( T elemento, NodoBinario<T> nodo ){
        if( nodo == null )
            return new NodoBinario<>( elemento, null, null );
        int compareResult = elemento.compareTo( nodo.elemento );
        if( compareResult < 0 )
            nodo.izquierda = insertNodo( elemento, nodo.izquierda );
        else if( compareResult > 0 )
            nodo.derecha = insertNodo( elemento, nodo.derecha );
        return nodo;
    }

    public boolean contenerElemento( T elemento ){
        return contains( elemento, raiz );
    }

    private boolean contains( T elemento, NodoBinario<T> nodo ){
        if( nodo == null )
            return false;
        int compareResult = elemento.compareTo( nodo.elemento );
        if( compareResult < 0 )
            return contains( elemento, nodo.izquierda );
        else if( compareResult > 0 )
            return contains( elemento, nodo.derecha );
        else
            return true;
        
    }


    public T encontrarMinimoElemento( )
    {
        if( estaVacio( ) )
            throw new BufferUnderflowException( );
        return encontrarMinimoNodo( raiz ).elemento;
    }

    private NodoBinario<T> encontrarMinimoNodo( NodoBinario<T> nodo ){
        if( nodo == null )
            return null;
        else if( nodo.izquierda == null )
            return nodo;
        return encontrarMinimoNodo( nodo.izquierda );


    }

    public void eliminarElemento( T elemento ){
        raiz = eliminarNodo( elemento, raiz );
    }


    private NodoBinario<T> eliminarNodo( T elemento, NodoBinario<T> nodo ){
        if( nodo == null )
            return nodo;
        // Item not found; do nothing
        int compareResult = elemento.compareTo( nodo.elemento );
        if( compareResult < 0 )
            nodo.izquierda = eliminarNodo( elemento, nodo.izquierda );
        else if( compareResult > 0 )
            nodo.derecha = eliminarNodo( elemento, nodo.derecha );
        else if( nodo.izquierda != null && nodo.derecha != null ) // Two children
        {
            nodo.elemento = encontrarMinimoNodo( nodo.derecha ).elemento;
            nodo.derecha = eliminarNodo( nodo.elemento, nodo.derecha );
        }
        else
            nodo = ( nodo.izquierda != null ) ? nodo.izquierda : nodo.derecha;
        return nodo;
    }

    private int altura( NodoBinario<T> nodo ){
        if( nodo == null )
            return -1;
        else
            return 1 + Math.max( altura(nodo.izquierda), altura(nodo.derecha) );
    }
}