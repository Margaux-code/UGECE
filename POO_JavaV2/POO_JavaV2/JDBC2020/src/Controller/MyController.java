/*
Source:  https://www.youtube.com/watch?v=XAowXcmQ-kA&t=1074s
Source: https://www.youtube.com/watch?v=i5UG6ACtnEg&t=782s&ab_channel=1BestCsharpblog
Source: MrSegado et campus
 */
package Controller;

// liste de tous les imports que nous utilisons dans le projet
import Controller.Connexion;

//import model
import Model.Client;// appel de la classe client
import Model.SalleSolo;
import Model.films;// appel de la classe films
import Model.reservations;
import Model.tarifs;// appel de la classe tarifs
import Model.salle;// appel de la classe salle
//import view
import View.InterfaceClient;
import View.InterfaceInscriptionClient;
import View.Accueil;
import View.InterfaceConnexion;
import View.InterfaceEmployé;
import View.InterfaceFilm;// vue de la page d'accueil du cinéma ( où l'on va sélectionner les films)
import View.InfoFilm;// affichage des informations d'un film
import View.InterfaceModifEmployé;
import View.InterfacePaiement;// affichage de la page de paiement
import View.InterfaceReservations;
import View.InterfaceSalle;//affichage du début de la réservation ( après la sélection d'un salle)

//java/javax
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;// permet d'associé un string à un URL
import javax.imageio.ImageIO;// associé l'url à un image
import javax.swing.ImageIcon;// afficher l'image en type Icon

/**
 *
 * @author matth
 */
public class MyController {

    Client m_client;
    private films f;
    private tarifs m_tarif;
    private reservations m_historique_resa;
    private salle m_cine_salles;
    private salle m_s;

    // toutes les methodes en static et les variables
    public MyController() throws SQLException, ClassNotFoundException {

        Connexion c = new Connexion("bdd ugece", "root", "");//Connection à la base de donnée

        f = new films(c);// Chargement des films
        m_tarif = new tarifs(c);
        m_client = new Client();
        m_s = new salle(c);
        this.m_historique_resa = new reservations(c);
        this.m_cine_salles = new salle(c);

    }

    // toutes les methodes en static et les variables
    public MyController(Client client_tampon) throws SQLException, ClassNotFoundException {

        Connexion c = new Connexion("bdd ugece", "root", "");//Connection à la base de donnée
        f = new films(c);// Chargement des films
        m_tarif = new tarifs(c);
        m_client = client_tampon;
        m_s = new salle(c);
        this.m_historique_resa = new reservations(c);
        this.m_cine_salles = new salle(c);

    }

    public static void main(String[] s) throws SQLException, ClassNotFoundException {

        MyController c = new MyController();
        c.AfficheAccueil(c);
    }

    public Client GetClient() {
        return m_client;
    }

    public void setClient(String User, String mail, String mdp, String membre, String Facture, int Id_client) {
        m_client.setUser(User);
        m_client.setMail(mail);
        m_client.setMdp(mdp);
        m_client.setMembre(membre);
        m_client.setFacture(Facture);
        m_client.setId(Id_client);
    }

    //on garde les informations du client connecté dans notre controler
    public void CookieClient(String mail, MyController Control) throws SQLException, ClassNotFoundException {
        ResultSet test;
        String us;
        String mdp;
        String membre;
        String facture;
        int Id_client;
        Connexion c = new Connexion("bdd ugece", "root", "");
        Connection con = (Connection) c.getConnection();
        PreparedStatement stmt;
        String sql = "SELECT * FROM clients WHERE Mail=?";
        stmt = con.prepareStatement(sql);
        try {
            stmt.setString(1, mail);
            test = stmt.executeQuery();
            if (test.next()) {
                //on recupere les infos du client à partir de la bdd pour set les données de notre client
                us = test.getString("User");
                mdp = test.getString("Password");
                membre = test.getString("Membre");
                facture = test.getString("Facture");
                Id_client = test.getInt("Id_client");
                //on initialise un client connecte
                Control.setClient(us, mail, mdp, membre, facture, Id_client);
                //m_client.afficheClient();
                ///renvoyé dans le cinéma
                //controller.affichecinema();
            } else {
                //JOptionPane.showMessageDialog(null,"Client pas connecté");
                //AfficheInterfaceConnexion(control);

            }
        } catch (SQLException e) {
            System.out.println("inscription ratée");
        }

    }

    //on inscrit un nouveau client dans la table client
    public void inscription(String us, String mail, String membre, String facture, String mdp, MyController control) throws SQLException, ClassNotFoundException {

        Connexion c = new Connexion("bdd ugece", "root", "");
        Connection con = (Connection) c.getConnection();
        //Static String us=m_client.getUser();

        //System.out.print("Nom:"+us+" mdp:"+mdp+" Membre:"+membre+" Facture:"+facture+" mail:"+mail);
        PreparedStatement stmt;
        String sql = "INSERT INTO clients(User,Mail,Membre,Facture,Password,Id_client)VALUES (?,?,?,?,?,null)";
        stmt = con.prepareStatement(sql);
        try {
            stmt.setString(1, us);
            stmt.setString(2, mail);
            stmt.setString(3, membre);
            stmt.setString(4, facture);
            stmt.setString(5, mdp);
            stmt.executeUpdate();
        } catch (SQLException e) {

            System.out.println("inscription ratée");
        }
        CookieClient(mail, control);
        AfficheInterfaceFilm(control);

    }

    // On verifie dans la table client si le mdp et le mail correspondent pour la connexion
    public void checkLoginMdp(String mail, String mdp, MyController control) throws SQLException, ClassNotFoundException {
        ResultSet test;
        Connexion c = new Connexion("bdd ugece", "root", "");
        Connection con = (Connection) c.getConnection();
        PreparedStatement stmt;
        String sql = "SELECT * FROM clients WHERE Mail=? and Password=?";
        stmt = con.prepareStatement(sql);
        try {
            stmt.setString(1, mail);
            stmt.setString(2, mdp);
            test = stmt.executeQuery();
            if (test.next()) {
                JOptionPane.showMessageDialog(null, "Client connecté");
                CookieClient(mail, control);
                AfficheInterfaceFilm(control);
                //m_client.afficheClient();
                ///renvoyé dans le cinéma
                //controller.affichecinema();
            } else {
                JOptionPane.showMessageDialog(null, "Client pas connecté");
                AfficheInterfaceConnexion(control);

            }

        } catch (SQLException e) {
            System.out.println("inscription ratée");
        }

    }

    //dans la table client permet d'ajouter une reservation si on connait le user
    public void AjouterReservation(int Id_Reservation, String user) throws SQLException, ClassNotFoundException {
        Connexion c = new Connexion("bdd ugece", "root", "");
        Connection con = (Connection) c.getConnection();
        PreparedStatement stmt;
        String sql = "UPDATE clients SET Id_reservation=? WHERE user=?";
        stmt = con.prepareStatement(sql);
        try {
            stmt.setInt(1, Id_Reservation);
            stmt.setString(2, user);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("ajout resa raté");
        }
    }

    // On verifie dans la table employe si le mdp et le mail correspondent pour la connexion
    public void ConnexionEmploye(String mail, String mdp, MyController control) throws SQLException, ClassNotFoundException {
        ResultSet test;
        Connexion c = new Connexion("bdd ugece", "root", "");
        Connection con = (Connection) c.getConnection();
        PreparedStatement stmt;
        String sql = "SELECT * FROM employe WHERE Mail=? and Password=?";
        stmt = con.prepareStatement(sql);
        try {
            stmt.setString(1, mail);
            stmt.setString(2, mdp);
            test = stmt.executeQuery();
            if (test.next()) {
                JOptionPane.showMessageDialog(null, "Employé connecté");
                AfficheInterfaceModifEmployé(control);
                ///renvoyé dans le cinéma
            } else {
                JOptionPane.showMessageDialog(null, "Employé pas connecté");
                AfficheInterfaceEmploye(control);
            }

        } catch (SQLException e) {
            System.out.println("inscription ratée");
        }
    }

    //affichage de la page d'accueil
    public void AfficheAccueil(MyController c) {
        Accueil Acc = new Accueil(c);
        Acc.setVisible(true);
        Acc.pack();
        Acc.setLocationRelativeTo(null);
        Acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //affichagee de la page d'interface de connexion client

    public void AfficheInterfaceConnexion(MyController c) {
        InterfaceConnexion Connex = new InterfaceConnexion(c);
        Connex.setVisible(true);
        Connex.pack();
        Connex.setLocationRelativeTo(null);
        Connex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // affichage de la page d'interface Inscription client

    public void AfficheInterfaceInscription(MyController c) {
        InterfaceInscriptionClient inscr = new InterfaceInscriptionClient(c);
        inscr.setVisible(true);
        inscr.pack();
        inscr.setLocationRelativeTo(null);
        inscr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //affichage de la page interface client avec le choix d'inscription ou connexion

    public void AfficheInterfaceClient(MyController c) {
        InterfaceClient Client = new InterfaceClient(c);
        Client.setVisible(true);
        Client.pack();
        Client.setLocationRelativeTo(null);
        Client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //affichage de la page de connexion pour les clients

    public void AfficheInterfaceEmploye(MyController c) {
        InterfaceEmployé Employ = new InterfaceEmployé(c);
        Employ.setVisible(true);
        Employ.pack();
        Employ.setLocationRelativeTo(null);
        Employ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void AfficheInterfaceFilm(MyController c) {
        InterfaceFilm PageFilm = new InterfaceFilm(c);
        PageFilm.setVisible(true);
        PageFilm.pack();
        PageFilm.setLocationRelativeTo(null);
        PageFilm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void AfficheInterfaceModifEmployé(MyController c) {
        InterfaceModifEmployé ModifEmployé = new InterfaceModifEmployé(c);
        ModifEmployé.setVisible(true);
        ModifEmployé.pack();
        ModifEmployé.setLocationRelativeTo(null);
        ModifEmployé.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void AffichageInfoFilm(MyController c, int id) {
        javax.swing.JLabel LabelAffiche = new javax.swing.JLabel();
        InfoFilm InterfaceInfoFilm = new InfoFilm(c, f.getNom(id), f.getGenre(id), f.getIntrigue(id), f.getRealisateur(id), f.getActeur(id), id, f.getAnnee(id));
        InterfaceInfoFilm.setVisible(true);
        InterfaceInfoFilm.pack();
        InterfaceInfoFilm.setLocationRelativeTo(null);
        InterfaceInfoFilm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void AfficheClientConnecte(javax.swing.JLabel Bouton, MyController control) {
        if (control.GetClient().getUser() == null) {
            Bouton.setForeground(Color.white);
            Bouton.setText("Pas Connecté");
        } else {
            Bouton.setForeground(Color.white);
            Bouton.setText(control.GetClient().getUser());
        }
    }

    public void AffichageFilm(javax.swing.JLabel LabelFilmID0, javax.swing.JLabel LabelFilmID1, javax.swing.JLabel LabelFilmID2, javax.swing.JLabel LabelFilmID3, javax.swing.JLabel LabelFilmID4, javax.swing.JLabel LabelFilmID5) {
        AfficherFilm0(LabelFilmID0);

        AfficherFilm1(LabelFilmID1);

        AfficherFilm2(LabelFilmID2);

        AfficherFilm3(LabelFilmID3);

        AfficherFilm4(LabelFilmID4);

        AfficherFilm5(LabelFilmID5);
    }

    public void ChoisirFilm(int id, MyController control, javax.swing.JLabel LabelFilm) {
        if (id == 0) {
            control.AfficherFilm0(LabelFilm);
        }
        if (id == 1) {
            control.AfficherFilm1(LabelFilm);
        }
        if (id == 2) {
            control.AfficherFilm2(LabelFilm);
        }
        if (id == 3) {
            control.AfficherFilm3(LabelFilm);
        }
        if (id == 4) {
            control.AfficherFilm4(LabelFilm);
        }
        if (id == 5) {
            control.AfficherFilm5(LabelFilm);
        }
    }

    public void AfficherFilm0(javax.swing.JLabel LabelFilmID0) {

        try {
            URL url = new URL(f.getURL(0));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID0.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void AfficherFilm1(javax.swing.JLabel LabelFilmID1) {

        try {

            URL url = new URL(f.getURL(1));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID1.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void AfficherFilm2(javax.swing.JLabel LabelFilmID2) {

        try {
            URL url = new URL(f.getURL(2));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID2.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void MettreAJourPrixFilm(String PleinTarif, String PRegulier, String PSenior, String PEnfant) throws SQLException {
        Integer PrixEnfant = Integer.valueOf(PEnfant);
        Integer PrixPleinTarif = Integer.valueOf(PleinTarif);
        Integer PrixSenior = Integer.valueOf(PSenior);
        Integer PrixRegulier = Integer.valueOf(PRegulier);
        if ((0 <= PrixPleinTarif) && (PrixPleinTarif <= 20) && (0 <= PrixEnfant) && (PrixEnfant <= 20) && (0 <= PrixSenior) && (PrixSenior <= 20) && (0 <= PrixRegulier) && (PrixRegulier <= 20)) {
            m_tarif.setPleinTarif(PrixPleinTarif);
            m_tarif.setEnfant(PrixEnfant);
            m_tarif.setSenior(PrixSenior);
            m_tarif.setRegulier(PrixRegulier);

        }
    }

    public void AfficherFilm3(javax.swing.JLabel LabelFilmID3) {

        try {
            URL url = new URL(f.getURL(3));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID3.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void AfficherFilm4(javax.swing.JLabel LabelFilmID4) {

        try {
            URL url = new URL(f.getURL(4));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID4.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void AfficherFilm5(javax.swing.JLabel LabelFilmID5) {

        try {
            URL url = new URL(f.getURL(5));
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            LabelFilmID5.setIcon(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

// permettra de générer l'action d'un comboBox: içi la comboBox présent dans InfoFilm qui permet de sélectionner une classe
    public void ComboBoxInfoFilm(MyController c, javax.swing.JComboBox combobox, int id_film) {

        ArrayList<Integer> resafilm = m_s.getResa_film(id_film);
        for (int i = 0; i < resafilm.size(); i++) {

            combobox.addItem(m_s.getsalle(resafilm.get(i)));

        }
        combobox.setBounds(50, 50, 90, 20);
        combobox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // setTitre();

                AffichageInterfaceSalle(c, ((SalleSolo) combobox.getSelectedItem()).getID());
            }
        });
    }

// méthode qui va nous permettre d'appeler la classe view interfaceSalle
    public void AffichageInterfaceSalle(MyController c, int idsalle) {
//InterfaceSalle InterfaceSalle = new InterfaceSalle();
        InterfaceSalle InterSalle = new InterfaceSalle(c, idsalle, m_s.get_places_totales(idsalle), m_s.get_places_libres(idsalle), m_s.get_date(idsalle), f.getNom(m_s.get_ID_film(idsalle)), m_s.get_ID_film(idsalle));
        InterSalle.setVisible(true);
        InterSalle.pack();
        InterSalle.setLocationRelativeTo(null);
        InterSalle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void VérificationPlacesDisponibles(MyController c, int idsalle, javax.swing.JLabel Label) {
// on fait une boucle if else pour vérifier si il reste des places ou pas 
        if (m_s.get_places_libres(idsalle) != 0) {
// on affiche la nouvelle page: interfacePaiement 
            AffichageInterfacePaiement(c, idsalle);
        } else {
// affichage d'un message dans le Label
            Label.setText("plus de places disponibles");
        }
    }

    public void AffichageInterfacePaiement(MyController c, int idsalle) {

        String membre = m_client.getMembre();
        String user;

        int prix;
//On fait des if et pas un switch au cas où l'utilisateur n'est pas connecté pour que le prix se set quand même
// Sinon vu que membre n'était pas initialisé ça ne marchait pas 
        if ("Regulier".equals(membre)) {
            prix = m_tarif.getRegulier();
            user = m_client.getUser();
        } else if ("Enfant".equals(membre)) {
            prix = m_tarif.getEnfant();
            user = m_client.getUser();
        } else if ("Senior".equals(membre)) {
            prix = m_tarif.getSenior();
            user = m_client.getUser();
        } else {
            prix = m_tarif.getPleinTarif();
            if (!"PleinTarif".equals(membre)) {
                user = "Invitee";
                membre = "Plein tarif";
            } else {
                user = m_client.getUser();
            }

        }

        InterfacePaiement InterfacePaiement = new InterfacePaiement(c, idsalle, prix, membre, user, f.getNom(m_s.get_ID_film(idsalle)));
        InterfacePaiement.setVisible(true);
        InterfacePaiement.pack();
        InterfacePaiement.setLocationRelativeTo(null);
        InterfacePaiement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void Prendre_place(int idSalle, int tarif, String user) throws SQLException, ClassNotFoundException {
        this.m_cine_salles.prendre_une_place(idSalle);

        this.m_historique_resa.ajout_reservations(user, idSalle, tarif);
        Client client_tampon = this.m_client;
        MyController c = new MyController(client_tampon);
        AfficheInterfaceFilm(c);

    }

    public void AfficheReservations(MyController c) {
        String reservations = m_historique_resa.getResa(m_client.getUser());
        InterfaceReservations Reservation = new InterfaceReservations(reservations,c);
                
       
        Reservation.setVisible(true);
        Reservation.pack();
        Reservation.setLocationRelativeTo(null);
        Reservation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
