/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.Connexion;
import java.sql.SQLException;

/**
 *
 * @author marga
 */
// Classe permettant de gerer les differentes salles et réservations
public class Gestionnaire_reservation {
    
    private reservations m_historique_resa;
    private salle m_cine_salles;
    private tarifs m_prix;
    
    public Gestionnaire_reservation(Connexion c) throws SQLException {
        this.m_historique_resa = new reservations(c);
        this.m_cine_salles = new salle(c);
        this.m_prix = new tarifs(c);
    }
    
    public void places(int id_client, int id_salle, int tarif) {
        this.m_historique_resa.ajout_reservations(id_client, id_salle, tarif);
        this.m_cine_salles.prendre_une_place(id_salle);
        
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Connexion c = new Connexion("bdd ugece", "root", "");
        reservations r = new reservations(c);
        r.ajout_reservations(13, 1, 4);
        
    }

    // Faire une fonction qui passe quels films passent dans quels salles
}
