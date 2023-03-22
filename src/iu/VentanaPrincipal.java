/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import modelo.Xogo;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Timer;

/**
 *
 * @author a22alejandrofc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Xogo xogo;
    private Timer tiempo;
    private int centesimas = 0;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;
    private int dificultad = 1;
    private int caidaFicha;
    private int aumento = 2;
    private ArrayList<Integer> nivelesAlcanzados = new ArrayList();


    /**
     * Creates new form VentanaPrincipal
     */

    private void Tiempo() {
        String texto = (minutos <= 9 ? "0" : "") + minutos + ":"
                + (segundos <= 9 ? "0" : "") + segundos + ":" + (centesimas <= 9 ? "0" : "") + centesimas;

        temporizador.setText(texto);
    }

    public VentanaPrincipal() {

        initComponents();
        botonMedio.setSelected(true);
        declararImagenes();
    }
    
        private void declararImagenes() {
        botonFacil.setSelectedIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Images/facil_verde.png")));
        botonFacil.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Images/facil_negro.png")));
        botonMedio.setSelectedIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Images/medio_amarillo.png")));
        botonMedio.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Images/medio_negro.png")));
        botonDificil.setSelectedIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Images/dificil_rojo.png")));
        botonDificil.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Images/dificil_negro.png")));
    }
    
    public void mostrarNumeroLinas() {
        String valorAnterior = lblLblnumlinas.getText();
        lblLblnumlinas.setText(xogo.getNumeroLineas() + "");
        if(!valorAnterior.equals(lblLblnumlinas.getText()) && xogo.getNumeroLineas()%5==0){
            dificultad++;
        }
    }
    
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimas++;
            caidaFicha++;
            if (centesimas == 100) {
                segundos++;
                centesimas = 0;
                mostrarNumeroLinas();
            }
            if (comprobarCaida()) {
                xogo.moverFichaAbaixo();
                caidaFicha = 0;
                aumentarVelocidad();
            }
            if (dificultad>=5 && segundos== 30 && centesimas == 00){
                xogo.engadirLineas();
            }
            if (segundos == 60) {
                minutos++;
                segundos = 0;
                if(dificultad >= 5){
                    xogo.engadirLineas();
                }
            }
            if (minutos == 60) {
                horas++;
                minutos = 0;
            }
           
            Tiempo();
        }

    };

        
    private boolean comprobarCaida() {
        return caidaFicha == 85 - 5 * dificultad;
    }
    
    private void aumentarVelocidad() {
        if (!nivelAlcanzado(xogo.getNumeroLineas())) {
            nuevosNivelesAlcanzados(xogo.getNumeroLineas());
        }
    }
    
    private void nuevosNivelesAlcanzados(int nivel){
        while(nivel>0 && dificultad<15){
            if (nivel % 5 == 0 && !nivelesAlcanzados.contains(nivel)) {
                dificultad += aumento;
            }
            if(!nivelesAlcanzados.contains(nivel)){
                nivelesAlcanzados.add(nivel);
            }
            nivel--;
        }
        if(dificultad>15){
            dificultad=15;
        }
    }

    private boolean nivelAlcanzado(int nivel) {
        Iterator<Integer> niveles = nivelesAlcanzados.iterator();
        while (niveles.hasNext()) {
            if (niveles.next() == nivel) {
                return true;
            }
        }
        return false;
    }
    
    public void pintarCadrado(JLabel lblCadrado) {
        panelXogo.add(lblCadrado);
        panelXogo.updateUI();
    }

    
    public void borrarCadrado(JLabel lblCadrado){
        panelXogo.remove(lblCadrado);
        panelXogo.updateUI();
    }
    
    public void mostrarFinDoXogo(){
        gameOver.setVisible(true);
        exit.setVisible(true);
        panelXogo.setVisible(false);
        cajaPuntuación.setVisible(false);
        cajaTiempo.setVisible(false);
        lblLblnumlinas.setVisible(false);
        temporizador.setVisible(false);
        pausa.setVisible(false);
        tiempo.stop(); 
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
        panelPrincipal = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        gameOver = new javax.swing.JLabel();
        panelXogo = new javax.swing.JPanel();
        labelFondo = new javax.swing.JLabel();
        panelLabels = new javax.swing.JPanel();
        temporizador = new javax.swing.JLabel();
        cajaTiempo = new javax.swing.JLabel();
        lblLblnumlinas = new javax.swing.JLabel();
        cajaPuntuación = new javax.swing.JLabel();
        pausa = new javax.swing.JToggleButton();
        botonesDificultad = new javax.swing.ButtonGroup();
        iniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonFacil = new javax.swing.JRadioButton();
        botonMedio = new javax.swing.JRadioButton();
        botonDificil = new javax.swing.JRadioButton();

        jFrame1.setBackground(new java.awt.Color(153, 153, 153));
        jFrame1.setLocation(new java.awt.Point(250, 0));
        jFrame1.setMinimumSize(new java.awt.Dimension(700, 950));
        jFrame1.setResizable(false);
        jFrame1.getContentPane().setLayout(null);

        panelPrincipal.setBackground(new java.awt.Color(84, 81, 81));
        panelPrincipal.setLayout(null);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/es.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        panelPrincipal.add(exit);
        exit.setBounds(230, 390, 220, 100);

        gameOver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Diseño sin título.png"))); // NOI18N
        panelPrincipal.add(gameOver);
        gameOver.setBounds(170, 150, 350, 430);
        gameOver.getAccessibleContext().setAccessibleParent(panelPrincipal);

        panelXogo.setBackground(new java.awt.Color(0, 0, 0));
        panelXogo.setMaximumSize(new java.awt.Dimension(320, 640));
        panelXogo.setMinimumSize(new java.awt.Dimension(320, 640));
        panelXogo.setPreferredSize(new java.awt.Dimension(320, 640));
        panelXogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelXogoKeyPressed(evt);
            }
        });

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tetris4_transparente.png"))); // NOI18N
        labelFondo.setText("jLabel4");
        labelFondo.setMaximumSize(new java.awt.Dimension(320, 640));
        labelFondo.setMinimumSize(new java.awt.Dimension(320, 640));
        labelFondo.setPreferredSize(new java.awt.Dimension(320, 640));

        javax.swing.GroupLayout panelXogoLayout = new javax.swing.GroupLayout(panelXogo);
        panelXogo.setLayout(panelXogoLayout);
        panelXogoLayout.setHorizontalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXogoLayout.createSequentialGroup()
                .addComponent(labelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelXogoLayout.setVerticalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXogoLayout.createSequentialGroup()
                .addComponent(labelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelXogo);
        panelXogo.setBounds(6, 16, 320, 640);

        panelLabels.setBackground(new java.awt.Color(84, 81, 81));
        panelLabels.setLayout(null);

        temporizador.setFont(new java.awt.Font("Source Serif Pro Black", 1, 36)); // NOI18N
        temporizador.setLabelFor(cajaTiempo);
        temporizador.setText("00:00:00:00");
        panelLabels.add(temporizador);
        temporizador.setBounds(200, 340, 210, 70);

        cajaTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/scorre (3).png"))); // NOI18N
        panelLabels.add(cajaTiempo);
        cajaTiempo.setBounds(150, 250, 320, 202);

        lblLblnumlinas.setFont(new java.awt.Font("Source Serif Pro Black", 1, 36)); // NOI18N
        lblLblnumlinas.setText("0");
        panelLabels.add(lblLblnumlinas);
        lblLblnumlinas.setBounds(290, 80, 120, 80);

        cajaPuntuación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/scorre (2).1.png"))); // NOI18N
        panelLabels.add(cajaPuntuación);
        cajaPuntuación.setBounds(150, 10, 320, 187);

        pausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button (2).png"))); // NOI18N
        pausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausaActionPerformed(evt);
            }
        });
        panelLabels.add(pausa);
        pausa.setBounds(220, 500, 194, 60);
        pausa.getAccessibleContext().setAccessibleParent(panelLabels);

        panelPrincipal.add(panelLabels);
        panelLabels.setBounds(237, 6, 910, 810);

        jFrame1.getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(-5, -2, 1110, 1430);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 900));
        setResizable(false);

        iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button (1).png"))); // NOI18N
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        iniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iniciarKeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tetris.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 300));
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/628a738ebc2ec7ad957f4072.png"))); // NOI18N

        botonesDificultad.add(botonFacil);
        botonFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/scorre (5).png"))); // NOI18N
        botonFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacilActionPerformed(evt);
            }
        });

        botonesDificultad.add(botonMedio);
        botonMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/scorre (7).png"))); // NOI18N
        botonMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedioActionPerformed(evt);
            }
        });

        botonesDificultad.add(botonDificil);
        botonDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/scorre (9).png"))); // NOI18N
        botonDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDificilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonFacil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(botonMedio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(botonDificil)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(518, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void pausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausaActionPerformed

        if (tiempo.isRunning()) {
            tiempo.stop();
            xogo.setPausa(true);
        } else {
            tiempo.start();
            panelXogo.requestFocus();
            xogo.setPausa(false);
        }

        // TODO add your handling code here:

    }//GEN-LAST:event_pausaActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed

        iniciarPartida();
    }//GEN-LAST:event_iniciarActionPerformed

    private void iniciarPartida() {
        panelXogo.removeAll();
        panelXogo.updateUI();
        gameOver.setVisible(false);
        exit.setVisible(false);
        jFrame1.setVisible(true);
        xogo = new Xogo(this);
        xogo.xenerarNovaFicha();
        xogo.setPausa(false);
        panelXogo.setFocusable(true);
        panelXogo.setVisible(true);
        cajaPuntuación.setVisible(true);
        cajaTiempo.setVisible(true);
        lblLblnumlinas.setVisible(true);
        temporizador.setVisible(true);
        pausa.setVisible(true);
        panelXogo.requestFocus();
        tiempo = new Timer(10, acciones);
        centesimas = 0;
        segundos = 0;
        minutos = 0;
        horas = 0;
        panelXogo.add(labelFondo);
        tiempo.start();
    }

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2KeyPressed

    private void iniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iniciarKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarKeyPressed

    private void panelXogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelXogoKeyPressed

        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_DOWN) {
            getXogo().moverFichaAbaixo();
        }
        if (key == KeyEvent.VK_RIGHT) {
            getXogo().moverFichaDereita();
        }
        if (key == KeyEvent.VK_LEFT) {
            getXogo().moverFichaEsquerda();
        }
        if (key == KeyEvent.VK_UP) {
            getXogo().rotarFicha();
        }
        repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_panelXogoKeyPressed

    private void botonFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacilActionPerformed
        dificultad=1;
        aumento = 2;
    }//GEN-LAST:event_botonFacilActionPerformed

    private void botonMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedioActionPerformed
        dificultad = 3;
        aumento = 2;
    }//GEN-LAST:event_botonMedioActionPerformed

    private void botonDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDificilActionPerformed
        dificultad = 5;
        aumento = 3;
    }//GEN-LAST:event_botonDificilActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        this.dispose();
        jFrame1.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

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
    private javax.swing.JRadioButton botonDificil;
    private javax.swing.JRadioButton botonFacil;
    private javax.swing.JRadioButton botonMedio;
    private javax.swing.ButtonGroup botonesDificultad;
    private javax.swing.JLabel cajaPuntuación;
    private javax.swing.JLabel cajaTiempo;
    private javax.swing.JButton exit;
    private javax.swing.JLabel gameOver;
    private javax.swing.JButton iniciar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel lblLblnumlinas;
    private javax.swing.JPanel panelLabels;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelXogo;
    private javax.swing.JToggleButton pausa;
    private javax.swing.JLabel temporizador;
    // End of variables declaration//GEN-END:variables

    public Xogo getXogo() {
        return xogo;
    }

    public void setXogo(Xogo xogo) {
        this.xogo = xogo;
    }

}
