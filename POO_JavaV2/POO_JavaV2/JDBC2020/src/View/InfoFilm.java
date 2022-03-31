/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MyController;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import Model.films;

/**
 *
 * @author vdrcy
 */
public class InfoFilm extends javax.swing.JFrame {

    MyController m_controler;
    String m_Nom;
    String m_Genre;
    String m_Intrigue;
    String m_Realisateur;
    String m_Acteur;
    int m_id;
    int m_Annee;

    /**
     * Creates new form InfoFilm
     */
    public InfoFilm(MyController c, String Nom, String Genre, String Intrigue, String Realisateur, String Acteur, int id, int Annee) {
        initComponents();
        this.setLocationRelativeTo(null);
        m_controler = c;
        m_Nom = Nom;
        m_Genre = Genre;
        m_Intrigue = Intrigue;
        m_Realisateur = Realisateur;
        m_Acteur = Acteur;
        m_id = id;
        m_Annee = Annee;
        LabelTitre.setText(Nom);
        LabelGenre.setText(Genre);
        LabelIntrigue.setText(Intrigue);
        LabelRealisateur.setText(Realisateur);
        LabelActeur.setText(Acteur);
        //LabelAnnee.setText(Annee); c'est pas un string
        m_controler.ChoisirFilm(id, m_controler, LabelUrl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * reg-enerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelUrl = new javax.swing.JLabel();
        LabelGenre = new javax.swing.JLabel();
        LabelIntrigue = new javax.swing.JLabel();
        LabelRealisateur = new javax.swing.JLabel();
        LabelActeur = new javax.swing.JLabel();
        LabelAnnee = new javax.swing.JLabel();
        LabelTitre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 138, 255));

        jLabel1.setText("Les details de votre film");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel1)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(108, 122, 137));

        LabelUrl.setText("Url");

        LabelGenre.setText("Genre");

        LabelIntrigue.setText("Intrigue");
        LabelIntrigue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelIntrigueMouseClicked(evt);
            }
        });

        LabelRealisateur.setText("Realisateur");

        LabelActeur.setText("Acteur");

        LabelAnnee.setText("Date");

        LabelTitre.setText("Titre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LabelUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelGenre)
                    .addComponent(LabelAnnee)
                    .addComponent(LabelActeur)
                    .addComponent(LabelRealisateur)
                    .addComponent(LabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIntrigue, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(LabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(LabelGenre)
                        .addGap(39, 39, 39)
                        .addComponent(LabelIntrigue)
                        .addGap(71, 71, 71)
                        .addComponent(LabelRealisateur)
                        .addGap(54, 54, 54)
                        .addComponent(LabelActeur)
                        .addGap(72, 72, 72)
                        .addComponent(LabelAnnee)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelIntrigueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelIntrigueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelIntrigueMouseClicked

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
            java.util.logging.Logger.getLogger(InfoFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoFilm(m_controler, m_Nom, m_Genre, m_Intrigue, m_Realisateur, m_Acteur, m_id, m_Annee).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelActeur;
    private javax.swing.JLabel LabelAnnee;
    private javax.swing.JLabel LabelGenre;
    private javax.swing.JLabel LabelIntrigue;
    private javax.swing.JLabel LabelRealisateur;
    private javax.swing.JLabel LabelTitre;
    private javax.swing.JLabel LabelUrl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
