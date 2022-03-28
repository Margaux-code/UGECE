/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Source:  https://www.youtube.com/watch?v=XAowXcmQ-kA&t=1074s
//suivi du turtoriel 
//interface faite en utilisant les outils "Design" de Netbeans
 */
package View;

import Controller.MyController;


/**
 *
 * @author matth
 */
public class InterfaceClient extends javax.swing.JFrame {
     MyController m_controler;
    /**
     * Creates new form InterfaceClient
     */
    public InterfaceClient(MyController c) {
        initComponents();
        m_controler=c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        RetourAccueil = new javax.swing.JLabel();
        ButtonIncsriptionClient = new javax.swing.JButton();
        BoutonConnexionClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(108, 122, 137));

        jPanel4.setBackground(new java.awt.Color(3, 138, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Client");

        RetourAccueil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RetourAccueil.setForeground(new java.awt.Color(255, 255, 255));
        RetourAccueil.setText("Retour");
        RetourAccueil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RetourAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetourAccueilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(RetourAccueil)
                .addGap(82, 82, 82))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RetourAccueil))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        ButtonIncsriptionClient.setBackground(new java.awt.Color(52, 45, 113));
        ButtonIncsriptionClient.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ButtonIncsriptionClient.setForeground(new java.awt.Color(255, 255, 255));
        ButtonIncsriptionClient.setText("Inscription");
        ButtonIncsriptionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIncsriptionClientActionPerformed(evt);
            }
        });

        BoutonConnexionClient.setBackground(new java.awt.Color(52, 45, 113));
        BoutonConnexionClient.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        BoutonConnexionClient.setForeground(new java.awt.Color(255, 255, 255));
        BoutonConnexionClient.setText("Connexion");
        BoutonConnexionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonConnexionClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BoutonConnexionClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonIncsriptionClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(BoutonConnexionClient)
                .addGap(32, 32, 32)
                .addComponent(ButtonIncsriptionClient)
                .addGap(0, 136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonIncsriptionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIncsriptionClientActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        m_controler.AfficheInterfaceInscription(m_controler);
    }//GEN-LAST:event_ButtonIncsriptionClientActionPerformed

    private void BoutonConnexionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonConnexionClientActionPerformed
        // TODO add your handling code here:
       
        this.dispose();
        m_controler.AfficheInterfaceConnexion(m_controler);
    }//GEN-LAST:event_BoutonConnexionClientActionPerformed

    private void RetourAccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetourAccueilMouseClicked
        // TODO add your handling code here:
        this.dispose();
        m_controler.AfficheAccueil(m_controler);
    }//GEN-LAST:event_RetourAccueilMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceClient(m_controler).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonConnexionClient;
    private javax.swing.JButton ButtonIncsriptionClient;
    private javax.swing.JLabel RetourAccueil;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
