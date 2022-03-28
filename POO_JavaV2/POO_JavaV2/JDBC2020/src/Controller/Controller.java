/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Source:  https://www.youtube.com/watch?v=XAowXcmQ-kA&t=1074s
Source: https://www.youtube.com/watch?v=i5UG6ACtnEg&t=782s&ab_channel=1BestCsharpblog
Source: MrSegado et campus
 */
package Controller;

import Controller.Connexion;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
import javax.swing.JFrame;
import View.InterfaceClient;
import View.InterfaceInscriptionClient;
import Model.Client;
import javax.swing.JOptionPane;
import View.Accueil;
import View.InterfaceConnexion;
import View.InterfaceEmployé;
import View.InterfaceFilm;
import View.InterfaceModifEmployé;

/**
 *
 * @author matth
 */
public class Controller {

    

    Client m_client;

    // toutes les methodes en static et les variables
    public Controller() {

    }

    public static void main(String[] s) throws SQLException, ClassNotFoundException {
        AfficheAccueil();
    }

    public Client GetClient() {
        return m_client;
    }
    public void setClient(String User,String mail, String mdp, String membre, String Facture )
    {
        m_client.setUser(User);
        m_client.setMail(mail);
        m_client.setMdp(mdp);
        m_client.setMembre(membre);
        m_client.setFacture(Facture);
    }
    //on inscrit un nouveau client dans la table client
    public static void inscription(String us,String mail, String membre, String facture, String mdp) throws SQLException, ClassNotFoundException {
        

        
        Connexion c = new Connexion("projet", "root", "");
        Connection con = (Connection) c.getConnection();
        //Static String us=m_client.getUser();
        
        //System.out.print("Nom:"+us+" mdp:"+mdp+" Membre:"+membre+" Facture:"+facture+" mail:"+mail);
        PreparedStatement stmt;
        String sql="INSERT INTO clients(User,Mail,Membre,Facture,Password)VALUES (?,?,?,?,?)";
        stmt=con.prepareStatement(sql);
        try{
            
            stmt.setString(1,us );
            stmt.setString(2,mail);
            stmt.setString(3,membre );
            stmt.setString(4,facture);
            stmt.setString(5, mdp);
            stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("inscription ratée");
        }
         
      
    }
    // On verifie dans la table client si le mdp et le mail correspondent pour la connexion
    public static void Connexion(String mail, String mdp)throws SQLException, ClassNotFoundException 
    {    ResultSet test;
        Connexion c = new Connexion("projet", "root", "");
        Connection con = (Connection) c.getConnection();
        PreparedStatement stmt;
        String sql="SELECT * FROM clients WHERE Mail=? and Password=?";
        stmt=con.prepareStatement(sql);
        try{
            stmt.setString(1,mail);
            stmt.setString(2,mdp);
            test=stmt.executeQuery();
            if(test.next())
            {
                JOptionPane.showMessageDialog(null,"Client connecté");
                ///renvoyé dans le cinéma
                //controller.affichecinema();
            }
            else{
                JOptionPane.showMessageDialog(null,"Client pas connecté");
                
            }
            
        }catch(SQLException e){
            System.out.println("inscription ratée");
        }
    }
    //dans la table client permet d'ajouter une reservation si on connait le user
    public static void AjouterReservation(int Id_Reservation,String user)throws SQLException, ClassNotFoundException 
    {    
        Connexion c = new Connexion("projet", "root", "");
        Connection con = (Connection) c.getConnection();
        PreparedStatement stmt;
        String sql="UPDATE clients SET Id_reservation=? WHERE user=?";
        stmt=con.prepareStatement(sql);
        try{
            stmt.setInt(1,Id_Reservation);
            stmt.setString(2,user);
            stmt.executeUpdate();
            
            
        }catch(SQLException e){
            System.out.println("ajout resa raté");
        }
    }
    // On verifie dans la table employe si le mdp et le mail correspondent pour la connexion
    public static void ConnexionEmploye(String mail, String mdp)throws SQLException, ClassNotFoundException 
    {    ResultSet test;
        Connexion c = new Connexion("projet", "root", "");
        Connection con = (Connection) c.getConnection();
        PreparedStatement stmt;
        String sql="SELECT * FROM employe WHERE Mail=? and Password=?";
        stmt=con.prepareStatement(sql);
        try{
            stmt.setString(1,mail);
            stmt.setString(2,mdp);
            test=stmt.executeQuery();
            if(test.next())
            {
                JOptionPane.showMessageDialog(null,"Employé connecté");
                ///renvoyé dans le cinéma
            }
            else{
                JOptionPane.showMessageDialog(null,"Employé pas connecté");
                
            }
            
        }catch(SQLException e){
            System.out.println("inscription ratée");
        }
    }
    //affichage de la page d'accueil
    public static void AfficheAccueil() {
        Accueil Acc = new Accueil();
        Acc.setVisible(true);
        Acc.pack();
        Acc.setLocationRelativeTo(null);
        Acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
   //affichagee de la page d'interface de connexion client
    public static void AfficheInterfaceConnexion() {
        InterfaceConnexion Connex = new InterfaceConnexion();
        Connex.setVisible(true);
        Connex.pack();
        Connex.setLocationRelativeTo(null);
        Connex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  // affichage de la page d'interface Inscription client
    public static void AfficheInterfaceInscription() {
        InterfaceInscriptionClient inscr = new InterfaceInscriptionClient();
        inscr.setVisible(true);
        inscr.pack();
        inscr.setLocationRelativeTo(null);
        inscr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   //affichage de la page interface client avec le choix d'inscription ou connexion
    public static void AfficheInterfaceClient() {
        InterfaceClient Client = new InterfaceClient();
        Client.setVisible(true);
        Client.pack();
        Client.setLocationRelativeTo(null);
        Client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   //affichage de la page de connexion pour les clients
    public static void AfficheInterfaceEmploye() {
        InterfaceEmployé Employ = new InterfaceEmployé();
        Employ.setVisible(true);
        Employ.pack();
        Employ.setLocationRelativeTo(null);
        Employ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
     public static void AfficheInterfaceFilm() {
        InterfaceFilm PageFilm = new InterfaceFilm();
        PageFilm.setVisible(true);
        PageFilm.pack();
        PageFilm.setLocationRelativeTo(null);
        PageFilm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
          public static void AfficheInterfaceModifEmployé() {
        InterfaceModifEmployé ModifEmployé = new InterfaceModifEmployé();
        ModifEmployé.setVisible(true);
        ModifEmployé.pack();
        ModifEmployé.setLocationRelativeTo(null);
        ModifEmployé.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
