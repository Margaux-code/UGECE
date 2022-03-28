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
public class salle {

    private int m_places_libre;
    private int m_place;    
    DateTimeFormatter m_date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public salle()

    {
        System.out.println("yyyy/MM/dd HH:mm:ss-> " + this.m_date.format(LocalDateTime.now()));
    }

}