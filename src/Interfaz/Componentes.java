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
public class Componentes extends javax.swing.JFrame {

    private final String usuario;


    /**
     * Creates new form Menu
     */
    public Componentes(String usuario) {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.usuario = usuario;
            
    
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
        graficaB = new javax.swing.JButton();
        ramB = new javax.swing.JButton();
        procesadorB = new javax.swing.JButton();
        madreB = new javax.swing.JButton();
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
        jLabel1.setText("¿Qué producto deseas comprar?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 140, 280, -1));

        t.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setText("ElectronicShop");
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        precio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/graphic-card.png"))); // NOI18N
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, 110));

        marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ram-memory.png"))); // NOI18N
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        opinion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cpu.png"))); // NOI18N
        jPanel1.add(opinion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mainboard.png"))); // NOI18N
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        graficaB.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        graficaB.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        graficaB.setText("Tarjeta Grafica");
        graficaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaBActionPerformed(evt);
            }
        });
        jPanel1.add(graficaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 120, 30));

        ramB.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        ramB.setText("Memoria RAM");
        ramB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramBActionPerformed(evt);
            }
        });
        jPanel1.add(ramB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 120, 30));

        procesadorB.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        procesadorB.setText("Procesador");
        procesadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesadorBActionPerformed(evt);
            }
        });
        jPanel1.add(procesadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 120, 30));

        madreB.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        madreB.setText("Tarjeta Madre");
        madreB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                madreBActionPerformed(evt);
            }
        });
        jPanel1.add(madreB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 120, 30));

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

    private void graficaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaBActionPerformed
        if (usuario.compareTo("Comprador") == 0) {
            Comprador menuComprador = new Comprador("Grafica");
            menuComprador.setVisible(true);
            this.setVisible(false);
        } else {
            DatosVendedor menu = new DatosVendedor();
            menu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_graficaBActionPerformed

    private void ramBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramBActionPerformed
        // TODO add your handling code here:
        if (usuario.compareTo("Comprador") == 0) {
            Comprador menuComprador = new Comprador("Ram");
            menuComprador.setVisible(true);
            this.setVisible(false);
        } else {
            DatosVendedor menu = new DatosVendedor();
            menu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ramBActionPerformed

    private void procesadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesadorBActionPerformed
        // TODO add your handling code here:
        if (usuario.compareTo("Comprador") == 0) {
           Comprador menuComprador = new Comprador("Procesador");
            menuComprador.setVisible(true);
            this.setVisible(false);
        } else {
            DatosVendedor menu = new DatosVendedor();
            menu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_procesadorBActionPerformed

    private void madreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_madreBActionPerformed
        
        if (usuario.compareTo("Comprador") == 0) {
           Comprador menuComprador = new Comprador("Madre");
            menuComprador.setVisible(true);
            this.setVisible(false);
        } else {
            DatosVendedor menu = new DatosVendedor();
            menu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_madreBActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel cp;
    private javax.swing.JLabel flecha;
    private javax.swing.JButton graficaB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton madreB;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel opinion;
    private javax.swing.JLabel precio;
    private javax.swing.JButton procesadorB;
    private javax.swing.JButton ramB;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
