/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iu;

import java.awt.*;
import javax.swing.*;
import modelo.Ficha;
import modelo.Xogo;
import java.awt.event.KeyEvent;
import javax.swing.border.Border;

/**
 *
 * @author a22alejandrofc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public Xogo xogo = new Xogo(this);

    private void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form VentanaPrincipal
     */
    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(320, 640);
        }

        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Images/tetris2.jpg"));
            grafico.drawImage(Img.getImage(), 0, 0, 320, 640, null);

            /**
             * javax.swing.ImageIcon Imagen = new
             * javax.swing.ImageIcon("/Images/png-transparent-tetris-app-tetris-blitz-android-electronic-arts-red-hot-air-balloon-text-rectangle-logo.png");
             * javax.swing.JLabel Img = new javax.swing.JLabel(Imagen);
             * Img.setSize(200, 200); JLabel1.add(Img);*
             *
             * }
             */
        }
    }

    public VentanaPrincipal() {

        initComponents();
        xogo.xenerarNovaFicha();

    }

    private void iniciarPartida() {

    }

    public void pintarCadrado(JLabel lblCadrado) {

        panelXogo.add(lblCadrado);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        panelXogo = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jFrame1.setMinimumSize(new java.awt.Dimension(700, 900));
        jFrame1.setResizable(false);

        panelXogo.setMaximumSize(new java.awt.Dimension(320, 640));
        panelXogo.setMinimumSize(new java.awt.Dimension(320, 640));
        panelXogo.setPreferredSize(new java.awt.Dimension(320, 640));
        panelXogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelXogoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelXogoLayout = new javax.swing.GroupLayout(panelXogo);
        panelXogo.setLayout(panelXogoLayout);
        panelXogoLayout.setHorizontalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        panelXogoLayout.setVerticalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jToggleButton2.setText("Pausa");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(panelXogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jToggleButton2)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jToggleButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(panelXogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 260, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 900));
        setResizable(false);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\a22alejandrofc\\Downloads\\button.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\a22alejandrofc\\Desktop\\tetrisportada.png")); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 300));
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(336, 336, 336))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jFrame1.setVisible(true);

        Imagen Imagen = new Imagen();
        panelXogo.add(Imagen);
        panelXogo.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void panelXogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelXogoKeyPressed

        int key = evt.getKeyCode();

        if (key == KeyEvent.VK_DOWN) {
            JLabel ficha = new JLabel();
            Border borde;
            borde = BorderFactory.createLineBorder(Color.black);
            ficha.setBorder(borde);
            ficha.setBackground(Color.yellow);
            ficha.setVisible(true);
            ficha.setOpaque(true);
            ficha.setSize(xogo.ladoCadrado, xogo.ladoCadrado);
            xogo.fichaActual.moverAbaixo();
        }
        if (key == KeyEvent.VK_RIGHT) {

            xogo.fichaActual.moverDereita();
        }
        if (key == KeyEvent.VK_LEFT) {

            xogo.fichaActual.moverEsquerda();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_panelXogoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel panelXogo;
    // End of variables declaration//GEN-END:variables

}
