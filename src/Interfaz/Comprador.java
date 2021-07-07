/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;

public class Comprador extends javax.swing.JFrame {

    private final String nombreComponente;

    public Comprador(String nombreComponente) {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.nombreComponente = nombreComponente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        opinion = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        precioB = new javax.swing.JButton();
        marcaB = new javax.swing.JButton();
        opinionB = new javax.swing.JButton();
        categoriaB = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();
        flecha = new javax.swing.JLabel();
        cp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 58, 188));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Cómo te gustaria ordenar el catálogo?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 560, 120));

        t.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setText("ElectronicShop");
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        precio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_money_100px.png"))); // NOI18N
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_etsy_100px.png"))); // NOI18N
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        opinion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_ask_question_100px.png"))); // NOI18N
        jPanel1.add(opinion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_list_100px.png"))); // NOI18N
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        precioB.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        precioB.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        precioB.setText("Precio");
        precioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioBActionPerformed(evt);
            }
        });
        jPanel1.add(precioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, -1));

        marcaB.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        marcaB.setText("Marca");
        marcaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaBActionPerformed(evt);
            }
        });
        jPanel1.add(marcaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 100, -1));

        opinionB.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        opinionB.setText("Opinion");
        opinionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opinionBActionPerformed(evt);
            }
        });
        jPanel1.add(opinionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 100, -1));

        categoriaB.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        categoriaB.setText("Categoria");
        categoriaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaBActionPerformed(evt);
            }
        });
        jPanel1.add(categoriaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 100, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 630, 410));

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

    private void precioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioBActionPerformed
        MostrarDatos menuDatos = new MostrarDatos(nombreComponente, "Precio");
        menuDatos.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_precioBActionPerformed

    private void marcaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaBActionPerformed
        // TODO add your handling code here:
        Marcas marcas = new Marcas(nombreComponente);
        marcas.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_marcaBActionPerformed

    private void opinionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opinionBActionPerformed
        // TODO add your handling code here:
        MostrarDatos menuDatos = new MostrarDatos(nombreComponente, "Opinion");
        menuDatos.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_opinionBActionPerformed

    private void categoriaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaBActionPerformed
        // TODO add your handling code here
        Categorias categorias = new Categorias(nombreComponente);
        categorias.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_categoriaBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel categoria;
    private javax.swing.JButton categoriaB;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel cp;
    private javax.swing.JLabel flecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel marca;
    private javax.swing.JButton marcaB;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel opinion;
    private javax.swing.JButton opinionB;
    private javax.swing.JLabel precio;
    private javax.swing.JButton precioB;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
