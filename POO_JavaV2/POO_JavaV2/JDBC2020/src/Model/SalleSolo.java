/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alix Parisot
 */
// on crée une classe afilm de générer qu'une seule salle 
public class SalleSolo {

//attribut de la classe 
    private int m_ID_salle;
    private int m_places_totales;
    private int m_places_libre;
    private String m_date;
    private int m_ID_film;

// constructeur de la classe 
    public SalleSolo(int idsalle, int placestotales, int placeslibre, String date, int IDfilm) {
        this.m_ID_salle = idsalle;
        this.m_places_totales = placestotales;
        this.m_places_libre = placeslibre;
        this.m_date = date;
        this.m_ID_film = IDfilm;
    }

    @Override// méthode to string pour permettre d'afficher le numéro de la salle 
    public String toString() {
        return String.valueOf(this.m_ID_salle);
    }

    public int getID() {
        return this.m_ID_salle;
    }

}
