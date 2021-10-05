package com.mycompany.buttonsexample.org.iesfm.buttonExample;

import java.awt.Color;

public class Screen1 extends javax.swing.JFrame {
    
    private Screen1 screen1;
    
    public Screen1() {
        initComponents();
        jBtnRed.setVisible(false);
        jBtnRed.setBackground(Color.red);
        jBtnGreen.setVisible(false);
        jBtnGreen.setBackground(Color.green);
        jBtnReset.setVisible(false);
        jBtnBlue.setVisible(false);
        jBtnBlue.setBackground(Color.blue);
        jLabel1.setText("Pulsa el botond de inicio");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jBtnGreen = new javax.swing.JButton();
        jBtnRed = new javax.swing.JButton();
        jBtnBlue = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jBtnStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ButtonExample");
        setBackground(new java.awt.Color(204, 0, 0));

        jBtnGreen.setText("Verde");
        jBtnGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGreenActionPerformed(evt);
            }
        });

        jBtnRed.setText("Rojo");
        jBtnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRedActionPerformed(evt);
            }
        });

        jBtnBlue.setText("Azul");
        jBtnBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBlueActionPerformed(evt);
            }
        });

        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jBtnStart.setText("Inicio");
        jBtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStartActionPerformed(evt);
            }
        });

        jLabel1.setText("                 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jBtnGreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jBtnRed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jBtnBlue)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnStart)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGreen)
                    .addComponent(jBtnRed)
                    .addComponent(jBtnBlue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnReset)
                    .addComponent(jBtnStart))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStartActionPerformed
        jBtnRed.setVisible(true);
        jBtnGreen.setVisible(true);
        jBtnReset.setVisible(true);
        jBtnBlue.setVisible(true);
        jLabel1.setText(" ");
    }//GEN-LAST:event_jBtnStartActionPerformed

    private void jBtnBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBlueActionPerformed
        jBtnRed.setVisible(false);
        jBtnGreen.setVisible(false);
        jBtnStart.setVisible(false);
        jLabel1.setText("Has pulsado el boton azul");
    }//GEN-LAST:event_jBtnBlueActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        jBtnRed.setVisible(true);
        jBtnGreen.setVisible(true);
        jBtnReset.setVisible(true);
        jBtnStart.setVisible(true);
        jBtnBlue.setVisible(true);
        jLabel1.setText(" ");
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRedActionPerformed
        jBtnBlue.setVisible(false);
        jBtnGreen.setVisible(false);
        jBtnStart.setVisible(false);
        jLabel1.setText("Has pulsado el boton rojo");
    }//GEN-LAST:event_jBtnRedActionPerformed

    private void jBtnGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGreenActionPerformed
        jBtnBlue.setVisible(false);
        jBtnRed.setVisible(false);
        jBtnStart.setVisible(false);
        jLabel1.setText("Has pulsado el boton verde");
    }//GEN-LAST:event_jBtnGreenActionPerformed

    public static void main(String args[]) {
       
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBlue;
    private javax.swing.JButton jBtnGreen;
    private javax.swing.JButton jBtnRed;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
