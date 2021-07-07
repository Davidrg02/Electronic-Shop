/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Producto implements Comparable<Producto>{

    public int id;
    public int precio;
    private String nombre;
    private String categoria;
    public String opinion;
    private String marca;

    public Producto(int id,int precio, String nombre, String categoria, String opinion, String marca) {
        this.precio = precio;
        this.nombre = nombre;
        this.categoria = categoria;
        this.opinion = opinion;
        this.marca = marca;
        this.id = id;
    }

    public Producto(int precio){
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: "+ getId()+"   \n"+"Nombre: " + getNombre() + "   \n" + "Precio: " + getPrecio() + "   \n" + "Categoria: " + getCategoria() + "    \n"
                + "Marca: " + getMarca() + "    \n" + "Opinion: " + getOpinion() +" \n";
    }
    @Override
    public int compareTo(Producto productoAComparar){
        if(this.precio>productoAComparar.precio)
            return 1;
        else if(this.precio<productoAComparar.precio)
            return -1;
        else 
            return 0;
    }
   
    

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }



}