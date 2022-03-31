/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.Connexion;
import java.sql.SQLException;
import javax.mail.internet.*;
import java.util.Properties;
import javax.mail.*;

/**
 *
 * @author marga
 */
// Classe permettant de gerer les differentes salles et réservations
// En plus cette classe permet d'envoyer des emails
public class Gestionnaire_reservation {

    private reservations m_historique_resa;
    private salle m_cine_salles;
    private tarifs m_prix;

    //Code pour envoyer un email venant de https://waytolearnx.com/2020/03/envoyer-un-mail-avec-java-en-utilisant-gmail.html
    public static void send(String from, String pwd, String to, String sub, String msg) {
        //Propriétés
        Properties p = new Properties();
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.socketFactory.port", "465");
        p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.port", "465");
        //Session
        Session s = Session.getDefaultInstance(p,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, pwd);
            }
        });
        //composer le message
        try {
            MimeMessage m = new MimeMessage(s);
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(sub);
            m.setText(msg);
            //envoyer le message
            Transport.send(m);
            System.out.println("Message envoyé avec succès");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public tarifs get_tarifs() {
        return m_prix;
    }

    public salle get_salles() {
        return m_cine_salles;
    }

    public reservations get_resa() {
        return m_historique_resa;
    }

    public Gestionnaire_reservation(Connexion c) throws SQLException {
        this.m_historique_resa = new reservations(c);
        this.m_cine_salles = new salle(c);
        this.m_prix = new tarifs(c);
    }

    public void places(int id_client, int id_salle, int tarif) {
        this.m_historique_resa.ajout_reservations(id_client, id_salle, tarif);
        this.m_cine_salles.prendre_une_place(id_salle);

    }

  /*  public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connexion c = new Connexion("bdd ugece", "root", "");
        Gestionnaire_reservation.send(
                "cinema.ugece@gmail.com",
                "UGECE2022!",
                "margaux.langautier@gmail.com",
                "Bienvenue dans le cinema ugece",
                "mail de test!"
        );
      
      

    }*/

   
}
