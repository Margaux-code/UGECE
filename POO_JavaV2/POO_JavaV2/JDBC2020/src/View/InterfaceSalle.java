/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MyController;

/**
 *
 * @author Alix Parisot
 */
public class InterfaceSalle extends javax.swing.JFrame {

    /**
     * Creates new form interfacesalle
     */
// attribut de la classe 
    private MyController m_controler;
    private int ID_salle;
    private int m_places_totales;
    private int m_places_libre;
    private String m_date;
    private String m_nomfilmselection;
    private int m_idfilm;
//private String m_NomFilmSelection;
// il faut réussir à montrer que c est bien le bon film 

    public InterfaceSalle(MyController controller, int idsalle, int placestotales, int placeslibre, String date, String nomdufilmselection,int idfilm) {
        initComponents();
        this.ID_salle = idsalle;
        this.m_controler = controller;
        this.m_places_totales = placestotales;
        this.m_places_libre = placeslibre;
        this.m_date = date;
        this.m_nomfilmselection = nomdufilmselection;
this.m_idfilm=idfilm;
        System.out.println(idsalle);
        LabelIDsalle.setText(String.valueOf(idsalle));//affichage de l'id du film
        Labelnbplacestotales.setText(String.valueOf(placestotales));// affichage du nombre de places totales
        Labelnbplacelibre.setText(String.valueOf(placeslibre));// affichage nombre de places libres ( restante)
        Labeldatefilm.setText(date);// affichage horaire du film 
        LabelTitrefilm.setText(nomdufilmselection);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LabelIDsalle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelTitrefilm = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Labeldatefilm = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Labelnbplacelibre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Labelnbplacestotales = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ButtonRetour = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Labelplusdeplaces = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SALLE No : ");

        LabelIDsalle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelIDsalle.setText("ID");

        jLabel3.setText("Vous avez sélectionné le film : ");

        LabelTitrefilm.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LabelTitrefilm.setText("Titre du film");

        jLabel5.setText("La séance est le :");

        Labeldatefilm.setText("Heure du film");

        jLabel7.setText("Il reste : ");

        Labelnbplacelibre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Labelnbplacelibre.setText("Nombre de places restantes ");

        jLabel9.setText("places.");

        jLabel2.setText("Nombre de places totales : ");

        Labelnbplacestotales.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Labelnbplacestotales.setText("Nombre de places totales");

        jLabel4.setText("avril 2022");

        ButtonRetour.setText("retour");
        ButtonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRetourActionPerformed(evt);
            }
        });

        jButton2.setText("Prendre une place");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelIDsalle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Labeldatefilm)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Labelnbplacestotales))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Labelnbplacelibre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelTitrefilm))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Labelplusdeplaces)
                                .addGap(104, 104, 104))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonRetour))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel6)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonRetour)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIDsalle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LabelTitrefilm))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Labeldatefilm)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Labelnbplacestotales))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Labelnbplacelibre)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(Labelplusdeplaces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRetourActionPerformed
        this.dispose();
m_controler.AffichageInfoFilm(m_controler,m_idfilm);

    }//GEN-LAST:event_ButtonRetourActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        m_controler.VérificationPlacesDisponibles(m_controler, ID_salle,Labelplusdeplaces);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceSalle(m_controler, ID_salle, m_places_totales, m_places_libre, m_date, m_nomfilmselection, m_idfilm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRetour;
    private javax.swing.JLabel LabelIDsalle;
    private javax.swing.JLabel LabelTitrefilm;
    private javax.swing.JLabel Labeldatefilm;
    private javax.swing.JLabel Labelnbplacelibre;
    private javax.swing.JLabel Labelnbplacestotales;
    private javax.swing.JLabel Labelplusdeplaces;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
