/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Controller.Connexion;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author marga
 */
import java.util.*;



/**
--INFOS SUR LA CLASSE--

*CHARGEMENT DES FICHIERS*
Pour faire charger les fichiers depuis la base de donnée il faut d'abord créer une conncection comme ceci dans le main :
 Connexion c = new Connexion("bdd ugece", "root", "");
en mettant le nom de votre base à la place de bdd ugece
Ensuite vous pourrez créer un objet film en lui donnant en paramètre la connection
=> La base de donnée sera chargée dans votre objet 

*RECUPERATION DES FILMS*
Des getters ont été écrit, vous pouvez récupérer les attributs un à un
Soit vous pouvez récuperer toute la liste d'un attribut avec getAttributs(), avec un s en attribut et le nom de l'attribut que vous voulez
Soit récupérer un seul attribut avec getAttribut(ID)en mettant en paramètre l'ID

*INFOS GENERALES*
Il y a 7 films dans la base de donnée avec un ID allant de 0 à 6
Si vous voulez les afficher il y a une fonction dans le setter 
 */
public class films {

    private ArrayList<Integer> ID_film = new ArrayList<>();
    private ArrayList<String> Nom = new ArrayList<>();
    private ArrayList<String> genres = new ArrayList<>();
    private ArrayList<String> intrigue = new ArrayList<String>();
    private ArrayList<String> realisateur = new ArrayList<>();
    private ArrayList<String> acteurs = new ArrayList<>();
    private ArrayList<Integer> annee = new ArrayList<>();
    private ArrayList<String> url_image = new ArrayList<>();

    public films(Connexion c) throws SQLException {
        //Code de récupération des données venant de https://waytolearnx.com/2020/06/recuperer-les-donnees-dune-base-de-donnee-select-jdbc-java.html
        try {
            Connection con = c.getConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT ID_Film , Nom, Genres, Intrigue, Realisateur, Acteurs,Annee,url_images FROM films";
            ResultSet res = stmt.executeQuery(sql);
         
            while (res.next()) {

                //Récupérer par nom de colonne
                this.ID_film.add(res.getInt("ID_Film") - 1);

                this.Nom.add(res.getString("Nom"));
                this.genres.add(res.getString("Genres"));
                this.intrigue.add(res.getString("Intrigue"));
                this.realisateur.add(res.getString("Realisateur"));
                this.annee.add(res.getInt("Annee"));
                
                this.url_image.add(res.getString("url_images"));
                this.acteurs.add(res.getString("Acteurs"));
                          
            }

      
            
        } catch (SQLException e) {
            System.out.println(e);

        }

    }

    //Fonctions Getter des attributs
    public ArrayList<String> getNoms() {
        return this.Nom;
    }

    public String getNom(int id) {
        return this.Nom.get(id);
    }

    public ArrayList<String> getGenres() {
        return this.genres;
    }

    public String getGenre(int id) {
        return this.genres.get(id);
    }

    public ArrayList<String> getIntrigues() {
        return this.intrigue;
    }

    public String getIntrigue(int id) {
        return this.intrigue.get(id);
    }

    public ArrayList<String> getRealisateurs() {
        return this.realisateur;
    }

    public String getRealisateur(int id) {
        return this.realisateur.get(id);
    }

    public ArrayList<String> getActeurs() {
        return this.acteurs;
    }

    public String getActeur(int id) {
        return this.acteurs.get(id);
    }

    public ArrayList<Integer> getAnnees() {
        return this.annee;
    }

    public Integer getAnnee(int id) {
        return this.annee.get(id);
    }

    public ArrayList<String> getURLs() {
        return this.url_image;
    }

    public String getURL(int id) {
        return this.url_image.get(id);
    }

    
}
