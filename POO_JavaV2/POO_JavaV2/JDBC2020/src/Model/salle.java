/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author marga
 */
/*
--EXPLICATION DE LA CLASSE SALLE

Le concept de cette classe est de permettre a un employé de créer une salle avec un film
Puis on pourra remplir la salle avec des réservations

*/
public class salle {

    private int m_places_libre;
    private int m_place;    
    DateTimeFormatter m_date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private int m_ID_film;
    private int m_ID_salle;

    public salle()

    {
        System.out.println("yyyy/MM/dd HH:mm:ss-> " + this.m_date.format(LocalDateTime.now()));
    }
    

}