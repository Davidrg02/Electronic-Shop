/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class Marcas extends javax.swing.JFrame {

    private final String nombreComponente;

    /**
     * Creates new form Menu
     */
    public Marcas(String nombreComponente) {
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
        botonQ = new javax.swing.JButton();
        botonR = new javax.swing.JButton();
        botonW = new javax.swing.JButton();
        botonV = new javax.swing.JButton();
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
        jLabel1.setText("Escoge la marca del producto que quieres comprar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 560, 120));

        t.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setText("ElectronicShop");
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        precio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_circled_q_80px.png"))); // NOI18N
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_circled_r_80px.png"))); // NOI18N
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        opinion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_circled_w_80px.png"))); // NOI18N
        jPanel1.add(opinion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_circled_v_80px.png"))); // NOI18N
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        botonQ.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        botonQ.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        botonQ.setText("Quiv");
        botonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQActionPerformed(evt);
            }
        });
        jPanel1.add(botonQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, -1));

        botonR.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        botonR.setText("Ratz");
        botonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRActionPerformed(evt);
            }
        });
        jPanel1.add(botonR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 100, -1));

        botonW.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        botonW.setText("Wabbi");
        botonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonWActionPerformed(evt);
            }
        });
        jPanel1.add(botonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 100, -1));

        botonV.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        botonV.setText("Vims");
        botonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVActionPerformed(evt);
            }
        });
        jPanel1.add(botonV, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 100, -1));

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

    private void botonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQActionPerformed
        MostrarDatos menuDatos  = new MostrarDatos(nombreComponente, "Marca", "Quiv");
        menuDatos.setVisible(true);
        this.setVisible(false);
 

    }//GEN-LAST:event_botonQActionPerformed

    private void botonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRActionPerformed
        // TODO add your handling code here:
        MostrarDatos menuDatos  = new MostrarDatos(nombreComponente, "Marca", "Ratz");
        menuDatos.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_botonRActionPerformed

    private void botonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonWActionPerformed
        // TODO add your handling code here:
        MostrarDatos menuDatos  = new MostrarDatos(nombreComponente, "Marca", "Wabbi");
        menuDatos.setVisible(true);
        this.setVisible(false);
      
    }//GEN-LAST:event_botonWActionPerformed

    private void botonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVActionPerformed
        // TODO add your handling code here
         MostrarDatos menuDatos  = new MostrarDatos(nombreComponente, "Marca", "Vims");
        menuDatos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton botonQ;
    private javax.swing.JButton botonR;
    private javax.swing.JButton botonV;
    private javax.swing.JButton botonW;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel cp;
    private javax.swing.JLabel flecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel opinion;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
