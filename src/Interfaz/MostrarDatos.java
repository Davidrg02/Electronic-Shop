/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import javax.swing.JOptionPane;
import Clases.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author usuario
 */
public class MostrarDatos extends javax.swing.JFrame {

    private String nombreCaracteristica;
    private String nombreComponente;
    private String nombreCategoriaMarca;
    DefaultListModel modelo = new DefaultListModel();
    
    public MostrarDatos(String nombreComponente, String nombreCaracteristica) {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.nombreCaracteristica = nombreCaracteristica;
        this.nombreComponente = nombreComponente;
        this.mostrarEnJlist();
    }

    public MostrarDatos(String nombreComponente, String nombreCaracteristica, String nombreCategoriaMarca) {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.nombreCaracteristica = nombreCaracteristica;
        this.nombreComponente = nombreComponente;
        this.nombreCategoriaMarca = nombreCategoriaMarca;
        this.mostrarEnJlist();
    }

    public void mostrarEnJlist() {

        Lector lector = new Lector();
        ArregloCircular productosCola = lector.AgregarProductosColaArrCirc("datos10k.txt", 10001);
        ArregloCircular colaProductosFiltradosMarca = productosCola.filtrarPorMarca("Quiv");
        //colaProductosFiltradosMarca.print();
        ArregloCircular colaProductosFiltradosCategoria = productosCola.filtrarPorCategoria("Empresarial");
        // colaProductosFiltradosCategoria.print();

        Pila productosPila = lector.AgregarProductosPila("datos10k.txt", 10001);
        //Pila pilaProductosFiltradosNombre = productosPila.buscarPorNombre("Memoria_RAM");
        //pilaProductosFiltradosNombre.print();          

        Arbol productosArbol = lector.AgregarProductosArbol("datos10k.txt");
        Pila pilaProductosFiltradosNombre = null;
        //Imprimir productos en orden de precio ascendente
        //productosArbol.imprimirArbolEnOrden(productosArbol.root);
        //System.out.println(productosArbol.root.altura);
        
        if (nombreComponente.compareTo("Grafica") == 0) {
            pilaProductosFiltradosNombre = productosPila.buscarPorNombre("Tarjeta_Grafica");
        }
        if (nombreComponente.compareTo("Procesador") == 0) {
           pilaProductosFiltradosNombre = productosPila.buscarPorNombre("Procesador");
        }
        if (nombreComponente.compareTo("Madre") == 0) {
            pilaProductosFiltradosNombre = productosPila.buscarPorNombre("Tarjeta_Madre");
        }
        if (nombreComponente.compareTo("Ram") == 0) {
            pilaProductosFiltradosNombre = productosPila.buscarPorNombre("Tarjeta_Madre");
        }
                   
            if (nombreCaracteristica.compareTo("Precio") == 0) {

                Arbol arbolPrecio = new Arbol();

                while (pilaProductosFiltradosNombre.estaVacia() != true) {
                    arbolPrecio.insertar(pilaProductosFiltradosNombre.pop());
                }              
               
                arbolPrecio.rellenarModeloEnOrden(modelo);

                jList1.setModel(modelo);
            }
             else if (nombreCaracteristica.compareTo("Marca") == 0) {//Esto se hace con cola
                
                ArregloCircular colaMarca = new ArregloCircular(10);
                        
                while(pilaProductosFiltradosNombre.estaVacia() != true) {
                    colaMarca.encolar(pilaProductosFiltradosNombre.pop());
                }
                
                ArregloCircular colaFiltradaMarca = colaMarca.filtrarPorMarca(nombreCategoriaMarca);
                
                colaFiltradaMarca.rellenarModelo(modelo);
                jList1.setModel(modelo);


            } else if (nombreCaracteristica.compareTo("Opinion") == 0) {//Esto se hace con lista
                
                   ListaEnlazada listaOpinion = new ListaEnlazada();
                           
                while (pilaProductosFiltradosNombre.estaVacia() != true) {
                    listaOpinion.insertarInicio(pilaProductosFiltradosNombre.pop());
                }
                
                ListaEnlazada listaOpinionBueno = listaOpinion.filtrarOpinion("bueno");
                ListaEnlazada listaOpinionRegular = listaOpinion.filtrarOpinion("regular");
                ListaEnlazada listaOpinionMalo = listaOpinion.filtrarOpinion("malo");
              
                   listaOpinionBueno.rellenarModelo(modelo);
                   listaOpinionRegular.rellenarModelo(modelo);
                   listaOpinionMalo.rellenarModelo(modelo);
                   
                jList1.setModel(modelo);

            } else if (nombreCaracteristica.compareTo("Categoria") == 0) {//Esto se hace con cola
                
                ArregloCircular colaMarca = new ArregloCircular(10);
                        
                while (pilaProductosFiltradosNombre.estaVacia() != true) {
                    colaMarca.encolar(pilaProductosFiltradosNombre.pop());
                }
                
                ArregloCircular colaFiltradaCategoria = colaMarca.filtrarPorCategoria(nombreCategoriaMarca);
                
                
                colaFiltradaCategoria.rellenarModelo(modelo);
                jList1.setModel(modelo);

            }
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();
        flecha = new javax.swing.JLabel();
        cp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 58, 188));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setText("ElectronicShop");
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 490, 270));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escoge el producto que quieres comprar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 560, 120));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setText("COMPRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 110, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 630, 410));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_menu_64px.png"))); // NOI18N
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        copy.setForeground(new java.awt.Color(255, 255, 255));
        copy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copy.setText("2021 ElectronicShop todos los derechos reservados");
        jPanel1.add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 300, 20));

        flecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_double_down_64px.png"))); // NOI18N
        jPanel1.add(flecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        cp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_copyright_64px.png"))); // NOI18N
        jPanel1.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int selectedIndex = jList1.getSelectedIndex();
    if (selectedIndex != -1) {
        modelo.remove(selectedIndex);
    }
    JOptionPane.showMessageDialog(null,"Compra Realizada con exito");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel cp;
    private javax.swing.JLabel flecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
