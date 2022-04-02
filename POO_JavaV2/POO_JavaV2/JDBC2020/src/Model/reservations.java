/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author marga
 */
public class reservations {

    private ArrayList<Integer> m_ID_reservation = new ArrayList<>();
    private ArrayList<String> m_ID_client = new ArrayList<>();
    private ArrayList<Integer> m_ID_salle = new ArrayList<>();
    private ArrayList<Integer> m_ID_tarif = new ArrayList<>();
    final private Connexion c;
    private Connection con;
    private Statement stmt;
    private String sql;
    private ResultSet res;

    //Constructeur qui va aller chercher toutes les réservations dans la base de données
    public reservations(Connexion co) throws SQLException {
        this.con = co.getConnection();
        this.stmt = this.con.createStatement();
        this.c = co;
        try {
            this.sql = "SELECT ID_Salle, ID_Tarif, Id_clients,  ID_Reservation FROM `reservations` ";
            res = this.stmt.executeQuery(this.sql);
            while (res.next()) {
                this.m_ID_client.add(res.getString("Id_clients"));
                this.m_ID_reservation.add(res.getInt("ID_Reservation"));
                this.m_ID_salle.add(res.getInt("ID_Salle"));
                this.m_ID_tarif.add(res.getInt("ID_Tarif"));
            }

        } catch (SQLException e) {
            System.out.println(e);

        }

    }    
    public String getResa(String User)
    {
       String salut =""; 

       try {
           
            this.sql = "SELECT ID_salle, ID_Reservation, ID_tarif FROM `reservations` WHERE ID_clients = '" + User + "'";
            res = stmt.executeQuery(sql);
            
            while (res.next())
            {
              salut += "<html>Reservation a la salle "+ res.getInt("ID_salle");
              salut += " Numero de votre reservation "+ res.getInt("ID_reservation");
              salut+= " Vous l'avez payez "+ res.getInt("ID_tarif")+ " €          ";
              salut += "    ";
            }
           
       }catch (SQLException e) {
            System.out.println(e);
        }
       salut += "<html>";
      
     return salut;   
    }
    
    
    //  créer une nouvelle réservation
    public void ajout_reservations(String ID_client, int ID_salle, int ID_tarif) {

        this.m_ID_client.add(ID_client);
        this.m_ID_salle.add(ID_salle);
        this.m_ID_reservation.add(this.m_ID_tarif.size());
        this.m_ID_tarif.add(ID_tarif);
        this.Sauvegarde();
    }

    //Fonction privée permettant de sauvegarder les réservations dans la base de donnée
    private void Sauvegarde() {
        int id_tampon = this.m_ID_reservation.size() - 1;
        try {
            this.sql = "DELETE FROM `reservations` WHERE ID_Reservation = " + id_tampon;
            this.stmt.execute(sql);
            this.sql = "INSERT INTO reservations (ID_salle,ID_Reservation,Id_clients,ID_tarif)\n"
                    + " VALUES ('" + this.m_ID_salle.get(id_tampon) + "','" + this.m_ID_reservation.get(id_tampon) + "','" + this.m_ID_client.get(id_tampon) + "','" + this.m_ID_tarif.get(id_tampon) + "')";
            this.stmt.execute(sql);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    //Fonction pour pouvoir faire des stats  
    public ArrayList<Integer> getPrix()
    {
        return this.m_ID_tarif;
    }
    
        public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connexion c = new Connexion("bdd ugece", "root", "");
        reservations r = new reservations(c);
       

    }
      
      
}
