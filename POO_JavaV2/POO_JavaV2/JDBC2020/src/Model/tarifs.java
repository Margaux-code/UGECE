/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author marga
 */
import Controller.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tarifs {

    private Integer ID_tarif;
    private Integer prix_enfant;
    private Integer prix_senior;
    private Integer prix_regulier;
    private Integer plein_tarif;
    private Connection con;
    private Statement stmt;
    private String sql;
    private ResultSet res;

    public tarifs(Connexion c) throws SQLException {
        //Code de récupération des données venant de https://waytolearnx.com/2020/06/recuperer-les-donnees-dune-base-de-donnee-select-jdbc-java.html
        try {
            this.con = c.getConnection();
            this.stmt = this.con.createStatement();
            this.sql = "SELECT ID_Tarif,prix_enfant,prix_senior,prix_regulier,plein_tarif FROM tarifs";
            this.res = this.stmt.executeQuery(this.sql);
            int i = 0;
            while (res.next()) {

                //Récupérer par nom de colonne
                this.ID_tarif = res.getInt("ID_Tarif");
                this.prix_enfant = res.getInt("prix_enfant");
                this.prix_regulier = res.getInt("prix_regulier");
                this.prix_senior = res.getInt("prix_senior");
                this.plein_tarif = res.getInt("plein_tarif");

                //Afficher les valeurs
                System.out.print("ID film: " + this.ID_tarif);
                System.out.print(",prix enfant : " + this.prix_enfant);
                System.out.print(", prix regulier : " + this.prix_regulier);
                System.out.println(", plein tarif: " + this.plein_tarif);
                i++;
            }

            //étape 6: fermez l'objet de connexion
        } catch (SQLException e) {
            //System.out.println(e);

        }

    }

    public Integer getEnfant() {
        return this.prix_enfant;
    }

    public Integer getSenior() {
        return this.prix_senior;
    }

    public Integer getRegulier() {
        return this.prix_regulier;
    }

    public Integer getPleinTarif() {
        return this.plein_tarif;
    }

    public void setEnfant(Integer prix) throws SQLException {
        this.prix_enfant = prix;
        this.sql = "UPDATE tarifs SET prix_enfant = " + this.prix_enfant;
        stmt.execute(sql);
    }

    public void setSenior(Integer prix) throws SQLException {
        this.prix_senior = prix;
        this.sql = "UPDATE tarifs SET prix_senior = " + this.prix_senior;
        stmt.execute(sql);
    }

    public void setRegulier(Integer prix) throws SQLException {
        this.prix_regulier = prix;
        this.sql = "UPDATE tarifs SET prix_regulier = " + this.prix_regulier;
        stmt.execute(sql);
    }

    public void setPleinTarif(Integer prix) throws SQLException {
        this.plein_tarif = prix;
        this.sql = "UPDATE tarifs SET plein_tarif = " + this.plein_tarif;
        stmt.execute(sql);
    }


}

