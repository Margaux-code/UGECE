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
public class InterfaceFilm extends javax.swing.JFrame {

    MyController m_controler;
    private films film;

    /**
     * Creates new form InterfaceFilm
     */
    public InterfaceFilm(MyController c, films f) {
        initComponents();
        m_controler = c;
        film = f;
        AffichageFilm();
    }

//    public void close(){
//    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
//    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
//    }
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
        titrePageFIlm = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ListeAvantage = new javax.swing.JButton();
        MesReservation = new javax.swing.JButton();
        retourAcceuil = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AfficheFilm1 = new javax.swing.JPanel();
        LabelFilmID0 = new javax.swing.JLabel();
        AfficheFilm4 = new javax.swing.JPanel();
        LabelFilmID1 = new javax.swing.JLabel();
        AfficheFilm2 = new javax.swing.JPanel();
        LabelFilmID2 = new javax.swing.JLabel();
        AfficheFilm5 = new javax.swing.JPanel();
        LabelFilmID3 = new javax.swing.JLabel();
        AfficheFilm6 = new javax.swing.JPanel();
        LabelFilmID5 = new javax.swing.JLabel();
        AfficheFilm3 = new javax.swing.JPanel();
        LabelFilmID4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(3, 138, 255));

        titrePageFIlm.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        titrePageFIlm.setForeground(new java.awt.Color(255, 255, 255));
        titrePageFIlm.setText("Bienvenue sur la page d'acceuil");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titrePageFIlm, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titrePageFIlm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(108, 122, 137));

        ListeAvantage.setBackground(new java.awt.Color(153, 153, 153));
        ListeAvantage.setText("Ma liste Avantage");
        ListeAvantage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MesReservation.setBackground(new java.awt.Color(153, 153, 153));
        MesReservation.setText("Mes reservation");
        MesReservation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MesReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesReservationActionPerformed(evt);
            }
        });

        retourAcceuil.setBackground(new java.awt.Color(153, 153, 153));
        retourAcceuil.setText("Acceuil");
        retourAcceuil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retourAcceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourAcceuilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListeAvantage, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retourAcceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(MesReservation)
                .addGap(35, 35, 35)
                .addComponent(ListeAvantage)
                .addGap(86, 86, 86)
                .addComponent(retourAcceuil)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(108, 122, 137));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Prenez vos reservation parmis les films à l'affiche dans notre cinéma");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout AfficheFilm1Layout = new javax.swing.GroupLayout(AfficheFilm1);
        AfficheFilm1.setLayout(AfficheFilm1Layout);
        AfficheFilm1Layout.setHorizontalGroup(
            AfficheFilm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID0, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        AfficheFilm1Layout.setVerticalGroup(
            AfficheFilm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID0, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AfficheFilm4Layout = new javax.swing.GroupLayout(AfficheFilm4);
        AfficheFilm4.setLayout(AfficheFilm4Layout);
        AfficheFilm4Layout.setHorizontalGroup(
            AfficheFilm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        AfficheFilm4Layout.setVerticalGroup(
            AfficheFilm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AfficheFilm2Layout = new javax.swing.GroupLayout(AfficheFilm2);
        AfficheFilm2.setLayout(AfficheFilm2Layout);
        AfficheFilm2Layout.setHorizontalGroup(
            AfficheFilm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        AfficheFilm2Layout.setVerticalGroup(
            AfficheFilm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AfficheFilm5Layout = new javax.swing.GroupLayout(AfficheFilm5);
        AfficheFilm5.setLayout(AfficheFilm5Layout);
        AfficheFilm5Layout.setHorizontalGroup(
            AfficheFilm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID3, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        AfficheFilm5Layout.setVerticalGroup(
            AfficheFilm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID3, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AfficheFilm6Layout = new javax.swing.GroupLayout(AfficheFilm6);
        AfficheFilm6.setLayout(AfficheFilm6Layout);
        AfficheFilm6Layout.setHorizontalGroup(
            AfficheFilm6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID5, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        AfficheFilm6Layout.setVerticalGroup(
            AfficheFilm6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID5, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AfficheFilm3Layout = new javax.swing.GroupLayout(AfficheFilm3);
        AfficheFilm3.setLayout(AfficheFilm3Layout);
        AfficheFilm3Layout.setHorizontalGroup(
            AfficheFilm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID4, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        AfficheFilm3Layout.setVerticalGroup(
            AfficheFilm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFilmID4, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AfficheFilm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AfficheFilm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AfficheFilm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AfficheFilm5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AfficheFilm6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AfficheFilm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AfficheFilm1, AfficheFilm2, AfficheFilm3, AfficheFilm4, AfficheFilm5, AfficheFilm6});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AfficheFilm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AfficheFilm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AfficheFilm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AfficheFilm5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AfficheFilm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AfficheFilm6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(118, 118, 118))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AfficheFilm1, AfficheFilm2, AfficheFilm3, AfficheFilm4, AfficheFilm5, AfficheFilm6});

        jScrollPane2.setViewportView(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MesReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesReservationActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MesReservationActionPerformed

    private void retourAcceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourAcceuilActionPerformed
        // TODO add your handling code here:
        this.dispose();
        m_controler.AfficheAccueil(m_controler);

    }//GEN-LAST:event_retourAcceuilActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceFilm(m_controler, film).setVisible(true);
            }
        });
    }

    public void AffichageFilm() {
        AfficherFilm0();

        AfficherFilm1();

        AfficherFilm2();

        AfficherFilm3();

        AfficherFilm4();

        AfficherFilm5();
    }

    public void AfficherFilm0() {

        try {
            URL url = new URL(film.getURL(0));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID0.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void AfficherFilm1() {

        try {

            URL url = new URL(film.getURL(1));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID1.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void AfficherFilm2() {

        try {
            URL url = new URL(film.getURL(2));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID2.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void AfficherFilm3() {

        try {
            URL url = new URL(film.getURL(3));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID3.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void AfficherFilm4() {

        try {
            URL url = new URL(film.getURL(4));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID4.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void AfficherFilm5() {

        try {
            URL url = new URL(film.getURL(5));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID5.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AfficheFilm1;
    private javax.swing.JPanel AfficheFilm2;
    private javax.swing.JPanel AfficheFilm3;
    private javax.swing.JPanel AfficheFilm4;
    private javax.swing.JPanel AfficheFilm5;
    private javax.swing.JPanel AfficheFilm6;
    private javax.swing.JLabel LabelFilmID0;
    private javax.swing.JLabel LabelFilmID1;
    private javax.swing.JLabel LabelFilmID2;
    private javax.swing.JLabel LabelFilmID3;
    private javax.swing.JLabel LabelFilmID4;
    private javax.swing.JLabel LabelFilmID5;
    private javax.swing.JButton ListeAvantage;
    private javax.swing.JButton MesReservation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton retourAcceuil;
    private javax.swing.JLabel titrePageFIlm;
    // End of variables declaration//GEN-END:variables
}
