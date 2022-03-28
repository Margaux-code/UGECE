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
import Model.films;
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
public class MyController {

    
     
    Client m_client;
    
    

    // toutes les methodes en static et les variables
    public MyController() {

    }

    public static void main(String[] s) throws SQLException, ClassNotFoundException {
        
        MyController c=new MyController();
        c.AfficheAccueil(c);
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
    public void inscription(String us,String mail, String membre, String facture, String mdp, MyController control) throws SQLException, ClassNotFoundException {
        

        
        Connexion c = new Connexion("bdd ugece", "root", "");
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
        AfficheInterfaceFilm(control);
         
      
    }
    // On verifie dans la table client si le mdp et le mail correspondent pour la connexion
    public void checkLoginMdp(String mail, String mdp,MyController control)throws SQLException, ClassNotFoundException 
    {    ResultSet test;
        Connexion c = new Connexion("bdd ugece", "root", "");
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
                AfficheInterfaceFilm(control);
                ///renvoyé dans le cinéma
                //controller.affichecinema();
            }
            else{
                JOptionPane.showMessageDialog(null,"Client pas connecté");
                AfficheInterfaceConnexion(control);
                
            }
            
        }catch(SQLException e){
            System.out.println("inscription ratée");
        }
        
    }
    //dans la table client permet d'ajouter une reservation si on connait le user
    public void AjouterReservation(int Id_Reservation,String user)throws SQLException, ClassNotFoundException 
    {    
        Connexion c = new Connexion("bdd ugece", "root", "");
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
    public void ConnexionEmploye(String mail, String mdp,MyController control)throws SQLException, ClassNotFoundException 
    {    ResultSet test;
        Connexion c = new Connexion("bdd ugece", "root", "");
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
                AfficheInterfaceFilm(control);
                ///renvoyé dans le cinéma
            }
            else{
                JOptionPane.showMessageDialog(null,"Employé pas connecté");
                AfficheInterfaceEmploye(control);
            }
            
        }catch(SQLException e){
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

}
