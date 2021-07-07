/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.DefaultListModel;




public class Arbol{
    
    
    
    public NodoBinario root;
    public Arbol(){
    }
    
    public void rellenarModeloEnOrden( DefaultListModel modelo){
        rellenarModeloEnOrdenAux(this.root,modelo);
    }
    
    public void rellenarModeloEnOrdenAux(NodoBinario nodo, DefaultListModel modelo){
        if(nodo.left!=null)
        rellenarModeloEnOrdenAux(nodo.left,modelo);
        
           modelo.addElement(nodo.contenido);
            
        if(nodo.right!=null)
        rellenarModeloEnOrdenAux(nodo.right,modelo);
        
    }


    public void imprimirArbolEnOrden(NodoBinario nodo){
        if(nodo!=null){
            this.imprimirArbolEnOrden(nodo.left);
            System.out.println(nodo.contenido);
            this.imprimirArbolEnOrden(nodo.right); 
        }
        
    }
     public Producto productosArbolEnOrden(NodoBinario nodo){
         Producto producto = null;
         if(nodo!=null){
            this.imprimirArbolEnOrden(nodo.left);
             producto = (nodo.contenido);
            this.imprimirArbolEnOrden(nodo.right); 
        }
        return producto;
    }

 
    public void imprimirArbolPreorden(NodoBinario nodo){
        if(nodo!=null){
            System.out.print(nodo.contenido+ " ");
            this.imprimirArbolPreorden(nodo.left);
            this.imprimirArbolPreorden(nodo.right);
        }
    }



    public void imprimirArbolPosorden(NodoBinario nodo){
        if(nodo!=null){
            this.imprimirArbolPosorden(nodo.left);
            this.imprimirArbolPosorden(nodo.right);
            System.out.println(nodo.contenido);
        }
        
    }

    public NodoBinario search(Producto contenidoABuscar){
        NodoBinario nodo = this.root;
        while((nodo!=null)&&(nodo.contenido!=contenidoABuscar)){
            if(nodo.contenido.compareTo(contenidoABuscar)<=0)
                nodo = nodo.right;
            else
                nodo = nodo.left;
       }
       return nodo;

    }

    public NodoBinario maximum(NodoBinario nodo){
        while(nodo.right!=null){
            nodo = nodo.right;
        }
        return nodo;
    }

    public NodoBinario minimum(NodoBinario nodo){
        while(nodo.left!=null){
            nodo = nodo.left;
        }
        return nodo;
    }

    public NodoBinario sucesor(NodoBinario nodo){
        if(nodo.right!=null)
            return this.minimum(nodo.right);

        if(nodo == this.maximum(this.root))
            return null;

        NodoBinario y = nodo.p;
        while((y!=null)&&(y.right==nodo)){
            nodo = y;
            y = y.p;
        }

        return y;//verificar que esto funcione en los casos en donde el nodo es el maximo del arbol y no hay subarbol derecho
    }

    public NodoBinario predecesor(NodoBinario nodo){
        if(nodo.left!=null)
            return this.maximum(nodo.left);

        if(nodo == this.minimum(this.root))
            return null;
        NodoBinario y = nodo.p;
        while((y!=null)&&(y.left==nodo)){
            nodo = y;
            y = y.p;
        }
        return y;
    }

    public void transplantar(NodoBinario u,NodoBinario v){//Este metodo transplanta un arbol con root u por un arbol con root v
        
        if(u.p==null)
            this.root = v;
        else if(u.p.left == u)
            u.p.left = v;
        else    
            u.p.right = v;

        if(v!=null)
            v.p = u.p;
    }

    public void borrarNodo(NodoBinario z){
        if(z.left == null){
            this.transplantar(z, z.right);
        }else if(z.right == null){
            this.transplantar(z, z.left);
        }else{
            NodoBinario y = minimum(z.right);
            if(y.p != z){
                NodoBinario x = y.right;
                this.transplantar(y, x);
                y.right = z.right;
                y.right.p = y;
            }
            this.transplantar(z,y);
                y.left = z.left;
                z.left.p =y;
        }
    }

    public void insertar(Producto contenido){
        NodoBinario nuevoNodo = new NodoBinario(contenido,this);
        this.insertar(nuevoNodo);
    }

    public void insertar(NodoBinario z){
        if(z.arbolPrincipal!=this)//En caso de que se ingrese un nodo de otro arbol a este arbol, se necesita que el nodo sepa cual es su root
            z.arbolPrincipal = this;
        
        NodoBinario y = null;
        NodoBinario x = this.root;
        // if(this.root!=null)
        // System.out.println(this.root.contenido);
        while(x!=null){//En esta parte se baja por el arbol mirando cual es mayor o menor
            y = x;
            //System.out.println("y="+y.contenido);
            if(x.contenido.compareTo(z.contenido)<=0)//x.contenido<z.contenido
                x = x.right;
            else
                x = x.left;
        }

        z.p = y;
        
        if(y==null){//En caso de que el arbol este vacio
            this.root = z;
        }else if(z.contenido.compareTo(y.contenido)<=0){//>z.contenido<y.contenido Aqui se decide a q lado de y poner al nodo
            y.left = z;
        }else
            y.right = z;

        this.root.calcularAltura();
        //System.out.println("arbol:");
        //this.imprimirArbolPreorden(root);
        // if(y!=null){
        //     int desbalanceAntiguo = y.desbalance;
        //     y.calcularDesbalance();
            
        //     if(desbalanceAntiguo != y.desbalance){
                
        //         while(y!=null){
        //             y.altura++;
        //             y = y.p;
        //         }
        //     }
            
        // }
    }



    // public void cambiarPadre(Nodo nodoACambiar,Nodo nodoACambiar){

    //     if(this.p!=null){
    //         if(this.p.left == this)
    //             this.p.left = nodoACambiar;
    //         else    
    //             this.p.right = nodoACambiar;
    //     }else{
    //         this.root = 
    //     }
    // }

    public boolean isEmpty(){
        return root==null;
    }

    public void makeEmpty(){
        root = null;
    }

    

}