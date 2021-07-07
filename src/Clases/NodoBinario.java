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
public class NodoBinario{
    Producto contenido;
    NodoBinario p;
    NodoBinario left; 
    NodoBinario right;
    public int altura;
    int desbalance ;
    Arbol arbolPrincipal;

    public NodoBinario(Producto cont, NodoBinario p, NodoBinario left, NodoBinario rigth, Arbol arbolPrincipal){
        this.contenido = cont;
         this.p=p;
         this.left=left; 
         this.right=rigth;
         this.arbolPrincipal = arbolPrincipal;
         this.altura = 0;
    }
    

    public NodoBinario(Producto cont, Arbol arbolPrincipal){
        this.contenido = cont;
        p=null;
        left=null; 
        right=null;
        altura = 0;
        this.arbolPrincipal = arbolPrincipal;
    }
    
    public NodoBinario(){
         p=null;
         left=null; 
         right=null;
    }

    public void calcularDesbalance(){
        if(this.left!=null && this.right!=null){
             this.desbalance = this.right.altura-this.left.altura;//recalcular el factor de balanceo
            //System.out.println("Alturas hijos real:"+this.contenido.id+" " + this.right.altura+" "+this.left.altura);
        }else if(this.left==null&&this.right==null){
                        this.desbalance = 0;
        }else if(this.left==null){
          this.desbalance = this.right.altura+1;//recalcular el factor de balanceo
    //System.out.println("Alturas left null hijos real:"+this.contenido.id+" " + this.right.altura);

        }else if(this.right == null){
             //System.out.println("Alturas right null hijos real:"+this.contenido.id+" " + this.left.altura);
            this.desbalance = -1-this.left.altura;
        }
            
    }


    public int calcularAltura(){//Con este metodo de paso se hacen rotaciones para que el arbol sea AVL
        int alturaRight = 0;
        int alturaLeft = 0;
        
        if(this.contenido.id == 26){
            //System.out.println("ID 26: "+alturaRight+" "+alturaLeft);
            }
        
        if((this.left==null) && (this.right==null)){
            this.altura = 0;
            return 0;
        }
            
        
        
        
        if(this.right!=null)
            alturaRight= this.right.calcularAltura();

        if(this.left!=null)
            alturaLeft = this.left.calcularAltura();
        
        
        
        //System.out.println("Alturahijos id: "+this.contenido.id+" " + alturaRight+" "+alturaLeft);

        this.calcularDesbalance();//Se calcula el desbalance para saber si hay que balancear antes de seguir calculando alturas
        //Hacer rotaciones acorde con el desbalance
        //System.out.println("Desbalance " +this.contenido.id+ " Precio: "+this.contenido.precio+ ": " + this.desbalance);
        
        NodoBinario nodoReemplazo;

        if(this.desbalance==2){
            //this.arbolPrincipal.imprimirArbolPreorden(this);
            //System.out.println("Altura: "+this.altura);
            if(this.right.desbalance==1){
                nodoReemplazo = rotacionSimple(true, this);
                //System.out.println("Simple");
            }
            else{
                
                nodoReemplazo = rotacionDoble(true, this);
                //System.out.println("Doble");
            }
            //System.out.println("/b Arbol ordenado/b");
            //this.arbolPrincipal.imprimirArbolPreorden(nodoReemplazo);
            
            return nodoReemplazo.calcularAltura();
            
        }else if(this.desbalance == -2){
            if(this.left.desbalance==-1)
            nodoReemplazo = rotacionSimple(false,this);
            else   
            nodoReemplazo = rotacionDoble(false, this);
            
            return nodoReemplazo.calcularAltura();
            
        }
        
        
        //Esto no se ejecuta si this estaba desbalanceado
        this.calcularDesbalance();
        
        
        
        
        this.altura = Math.max(alturaLeft,alturaRight)+1;
        //System.out.println("desbalance:" + this.desbalance);
        return this.altura;
        

        
    }


    public NodoBinario rotacionSimple(boolean derecha,NodoBinario nodo){//si derecha == true, la rotacion es derecha derecha. si no, es izquierda izquierda
        
        NodoBinario tmp;

        if(derecha){
            tmp = nodo.right;
        
            nodo.right = tmp.left;
            if(tmp.left!=null)
                tmp.left.p = nodo;
            tmp.left = nodo;
            //System.out.println("derder: "+nodo.contenido);
        }else{
            tmp = nodo.left;
            nodo.left = tmp.right;
            if(tmp.right!=null)
                tmp.right.p = nodo;
            tmp.right = nodo;
            //System.out.println("izqizq: "+ nodo.contenido);
        }
        arbolPrincipal.transplantar(nodo,tmp);
        //System.out.println("root: "+ arbolPrincipal.root.contenido);
        nodo.p = tmp;
        return tmp;
    }

    public NodoBinario rotacionDoble(boolean derechaIzquierda, NodoBinario nodo){
      
        NodoBinario nodoReemplazo;
        if(derechaIzquierda){
            rotacionSimple(false, nodo.right);
            nodoReemplazo = rotacionSimple(true, nodo);
        }else{
            rotacionSimple(true,this.left);
            nodoReemplazo = rotacionSimple(false,nodo);
        }

        return nodoReemplazo;
    }
  
    
}
