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
/*
--EXPLICATION DE LA CLASSE SALLE

Le concept de cette classe est de permettre a un employé de créer une salle avec un film
Puis on pourra remplir la salle avec des réservations
On dira que la salle est en placement libre

 */
public class salle {

    private int m_places_libre;
    private int m_places_totales;
    private String m_date;
    private String m_heure;
    private int m_ID_film;
    private int m_ID_salle;
    private Connection con;
    private Statement stmt;
    private String sql;
    private ResultSet res;

//Constructeur pour rajouter une salle
    public salle(int places, String date, String heure, int ID_film, int ID_salle, Connexion c) throws SQLException {
        // AU départ la salle a un nombre de place fixé, et elles sont toutes libres
        this.m_places_libre = places;
        this.m_places_totales = places;
        this.m_date = date;
        this.m_heure = heure;
        this.m_ID_film = ID_film;
        this.m_ID_salle = ID_salle;
        this.Sauvegarder(c);

    }
public salle(int ID_salle)
{
    
    
    
}
    public void Sauvegarder(Connexion c) throws SQLException {
        this.con = c.getConnection();
        this.stmt = this.con.createStatement();

        this.sql = "INSERT INTO salle (ID_salle,places_total,places_libres,date,ID_Film)\n"
                + " VALUES (" + this.m_ID_salle + "," + this.m_places_totales + "," + this.m_places_libre + "," + this.m_date + "," + this.m_ID_film;
        this.stmt.execute(sql);

    }

}
