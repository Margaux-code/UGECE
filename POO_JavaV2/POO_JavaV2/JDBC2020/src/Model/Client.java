/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

/**
 *
 * @author matth
 */
public class Client {

    private String User = null;
    private String Mail=null;
    private String Mdp = null;
    private String Membre = null;
    private String Facture = null;
    private Boolean Connecte = false;
    private String Id_reservation=null;

    

    public void client(String us, String mail,String mdp, String Mem, String Fac,String Id_resa) {
        User = us;
        Mdp = mdp;
        Membre = Mem;
        Facture = Fac;
        Mail=mail;
        Connecte=true;
        Id_reservation=Id_resa;
    }
    public void afficheClient()
    {
        System.out.print("Nom:"+User+" mdp:"+Mdp+" Membre:"+Membre+" Facture:"+Facture+" mail:"+Mail+"resa:"+Id_reservation);
    }
    public void setReservation(String Id_resa) {
        this.Id_reservation = Id_resa;
    }
    public void setUser(String us) {
        this.User = us;
    }
    public void setMail(String mail) {
        this.Mail = mail;
    }

    public void setConnecte(Boolean Con) {
        this.Connecte = Con;
    }

    public  void setMdp(String mdp) {
        this.Mdp = mdp;
    }

    public void setMembre(String mem) {
        this.Membre = mem;
    }

    public void setFacture(String fact) {
        this.Facture = fact;
    }

    public String getUser() {
        return User;

    }
    public String getMail() {
        return Mail;

    }

    public String getMdp() {
        return Mdp;

    }

    public Boolean getConnecte() {
        return Connecte;
    }

    public String getMembre() {
        return Membre;

    }

    public String getFacture() {
        return Facture;

    }
}