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
    private int Id_Client;

    

    public void client(String us, String mail,String mdp, String Mem, String Fac,int  Id_client) {
        User = us;
        Mdp = mdp;
        Membre = Mem;
        Facture = Fac;
        Mail=mail;
        Connecte=true;
        Id_Client=Id_client;
    }
    public void afficheClient()
    {
        System.out.print("Nom:"+User+" mdp:"+Mdp+" Membre:"+Membre+" Facture:"+Facture+" mail:"+Mail+"id:"+Id_Client);
    }
    public void setId(int Id_client) {
        this.Id_Client = Id_client;
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
