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

/**
 *
 * @author marga
 */
public class reservations {

    private int m_ID_reservation;
    private int m_ID_client;
    private int m_ID_salle;
    private int m_ID_tarif;
    final private Connexion c;
    private Connection con;
    private Statement stmt;
    private String sql;
    private ResultSet res;

    //Constructeur qui va aller chercher toutes les réservations dans la base de données
    public reservations(int ID_reservation, Connexion co) throws SQLException {
        this.con = co.getConnection();
        this.stmt = this.con.createStatement();
        this.sql = "SELECT ID_Salle, ID_Tarif, Id_clients ID_Film FROM `resrvations` WHERE ID_Reservation =" + ID_reservation;
        res = this.stmt.executeQuery(this.sql);
        this.m_ID_client = res.getInt("Id_clients");
        this.m_ID_reservation = ID_reservation;
        this.m_ID_salle = res.getInt("ID_Salle");
        this.m_ID_tarif = res.getInt("ID_Tarif");

        this.c = co;
    }

    // Constructeur quand on veut créer une nouvelle réservations
    public reservations(int ID_reservation, int ID_client, int ID_salle, int ID_tarif, Connexion co) {
        this.m_ID_reservation = ID_reservation;
        this.m_ID_client = ID_client;
        this.m_ID_salle = ID_salle;
        this.c = co;
        this.m_ID_tarif = ID_tarif;
        this.Sauvegarde();
    }

    //Fonction privée permettant de sauvegarder les réservations dans la base de donnée
    private void Sauvegarde() {

    }

}
