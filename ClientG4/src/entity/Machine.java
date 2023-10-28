/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Machine implements Serializable {

    private int id;
    private String ref;
    private String marque;
    private double prix;
    private Salle salle;
    private Date dateAchat;
    private static final long serialVersionUID = 2271470953592136426L;

    public Machine() {
    }

    public Machine(String ref, String marque, double prix, Salle salle ,Date dateAchat) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
        this.dateAchat =dateAchat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", ref=" + ref + ", marque=" + marque + ", prix=" + prix + ", salle=" + salle +", date=" + dateAchat + '}';
    }
}
