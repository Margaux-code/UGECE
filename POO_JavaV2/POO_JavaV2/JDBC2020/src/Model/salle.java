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

ATTENTION : la date doit forcément être en format JJ.MM Sans l'année pour que le reste du code corresponde 

 */
public class salle {

    //Attributs de connections à la base de donnée
    private Connection con;
    private Statement stmt;
    private String sql;
    private ResultSet res;
    final private Connexion c;
    //Attributs qui peuvent bouger après le début de la classe
    private ArrayList<Integer> m_ID_salle = new ArrayList<>();
    private ArrayList<Integer> m_places_totales = new ArrayList<>();
    private ArrayList<Integer> m_places_libre = new ArrayList<>();
    private ArrayList<String> m_date = new ArrayList<>();
    private ArrayList<Integer> m_ID_film = new ArrayList<>();

    // Constructeur pour charger les salles qui existent déjà
    public salle(Connexion co) throws SQLException {
        this.c = co;
        try {
            this.con = co.getConnection();
            this.stmt = this.con.createStatement();
            this.sql = "SELECT places_total, places_libres,date,ID_Film, ID_salle FROM `salle`";
            res = this.stmt.executeQuery(sql);
            while (res.next()) {
                this.m_ID_salle.add(res.getInt("ID_salle"));
                this.m_places_libre.add(res.getInt("places_libres"));
                this.m_places_totales.add(res.getInt("places_total"));
                this.m_date.add(res.getString("date"));
                this.m_ID_film.add(res.getInt("ID_Film"));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void ajouter_salle(int places, String date, int ID_film) throws SQLException {

        // AU départ la salle a un nombre de place fixé, et elles sont toutes libres   
        int id_tampon = this.m_ID_salle.size();
        this.m_places_libre.add(places);
        this.m_places_totales.add(places);
        this.m_date.add(date);
        this.m_ID_film.add(ID_film);
        this.m_ID_salle.add(id_tampon);// Met l'id du salle avec 
        System.out.println("ID_ salle :" + this.m_ID_salle.get(id_tampon));
        this.Sauvegarder(id_tampon);

    }

    //Cette fonction remet toutes les places d'une salle à vide et met un nouveau film
    public void changer_film(int ID_film, String date, int ID_salle) throws SQLException {

        this.m_places_libre.set(ID_salle, this.m_places_totales.get(ID_salle));
        this.m_date.set(ID_salle, date);
        this.m_ID_film.set(ID_salle, ID_film);
        this.Sauvegarder(ID_salle);
    }

    //Cette fonction est private, car elle ne doit servir que à l'interieur de la classe pour sauvegarder les données dans la base 
    private void Sauvegarder(int ID_salle) throws SQLException {
        

        try {
            this.sql = "DELETE FROM `salle` WHERE ID_salle = " + ID_salle;
            this.stmt.execute(sql);
            this.sql = "INSERT INTO salle (ID_salle,places_total,places_libres,date,ID_Film)\n"
                    + " VALUES (" + ID_salle + "," + this.m_places_totales.get(ID_salle) + "," + this.m_places_libre.get(ID_salle) + "," + this.m_date.get(ID_salle) + "," + this.m_ID_film.get(ID_salle) + ")";
            this.stmt.execute(sql);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Hello, World!");
        Connexion c = new Connexion("bdd ugece", "root", "");
        salle s = new salle(c);
        String date = "15.06"; 
        s.changer_film(20, date, 0);
     

    }

}
