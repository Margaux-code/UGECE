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
/*
--EXPLICATION DE LA CLASSE SALLE

Le concept de cette classe est de permettre a un employé de créer une salle avec un film
Puis on pourra remplir la salle avec des réservations
On dira que la salle est en placement libre

 */
public class salle {

    //Attributs de connections à la base de donnée
    private Connection con;
    private Statement stmt;
    private String sql;
    private ResultSet res;
    final private Connexion c;
    //Attributs qui peuvent bouger après le début de la classe
    private Integer m_ID_salle;
    private Integer m_places_totales;
    private Integer m_places_libre;
    private String m_date;
    private Integer m_ID_film;

//Constructeur pour rajouter une salle
    public salle(int places, String date, int ID_film, int ID_salle, Connexion co) throws SQLException {
       
        // AU départ la salle a un nombre de place fixé, et elles sont toutes libres
        this.c = co;
        this.con = this.c.getConnection();
        this.stmt = this.con.createStatement();
        this.m_places_libre = places;
        this.m_places_totales = places;
        this.m_date = date;

        this.m_ID_film = ID_film;
        this.m_ID_salle = ID_salle;
        System.out.println("La salle numéro " + this.m_ID_salle + " places totales : " + this.m_places_totales);
        this.Sauvegarder();

    }

    // Constructeur pour charger les salles qui existent déjà
    public salle(int ID_salle, Connexion co) throws SQLException {
        this.c = co;
              try {

            
            this.con = co.getConnection();
            this.stmt = this.con.createStatement();
            this.m_ID_salle = ID_salle;
            this.sql = "SELECT places_total, places_libres,date,ID_Film FROM `salle` WHERE ID_salle= " + this.m_ID_salle;
            res = this.stmt.executeQuery(sql);
            while (res.next()) {
                this.m_places_libre = res.getInt("places_libres");
                System.out.println("BLABLA");
                this.m_places_totales = res.getInt("places_total");
                this.m_date = res.getString("date");
                this.m_ID_film = res.getInt("ID_Film");
                System.out.println("La salle numéro " + this.m_ID_salle + " places totales : " + this.m_places_totales);

            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    //Cette fonction remet toutes les places d'une salle à vide et met un nouveau film
    public void changer_film(int ID_film, String date) throws SQLException {
        this.m_ID_film = ID_film;
        this.m_places_libre = this.m_places_totales;
        this.m_date = date;
        this.Sauvegarder();
    }

    //Cette fonction est private, car elle ne doit servir que à l'interieur de la classe pour sauvegarder les données dans la base 
    private void Sauvegarder() throws SQLException {
        int id_tampon = this.m_ID_salle;
        try {
            this.sql = "DELETE FROM `salle` WHERE ID_salle = " + this.m_ID_salle;
            this.stmt.execute(sql);
            this.sql = "INSERT INTO salle (ID_salle,places_total,places_libres,date,ID_Film)\n"
                    + " VALUES (" + this.m_ID_salle + "," + this.m_places_totales + "," + this.m_places_libre + "," + this.m_date + "," + id_tampon + ")";
            this.stmt.execute(sql);

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("CA marcche passs");
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Hello, World!");
        Connexion c = new Connexion("bdd ugece", "root", "");
        salle s = new salle(1, c);
        // s.changer_film(3, "13/10");

    }

}
