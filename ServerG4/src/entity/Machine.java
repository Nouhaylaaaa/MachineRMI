/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DELL
 */
@Entity
@NamedQuery(
        name = "findMachinesBySalleId",
        query = "SELECT m FROM Machine m WHERE m.salle.id = :salleId"
)
@NamedNativeQuery(name = "findAllNative", query = "select * from machine", resultClass = Machine.class)
public class Machine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     private String ref;
    private String marque;
    private double prix;
    @Temporal(TemporalType.DATE)
    private Date dateAchat;

      @ManyToOne
    private Salle salle;

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
      
      
    public Machine(Integer id, String ref, String marque, double prix, Date dateAchat,Salle salle) {
        this.id = id;
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.dateAchat = dateAchat;
        this.salle= salle;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Machine)) {
            return false;
        }
        Machine other = (Machine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", ref=" + ref + ", marque=" + marque + ", prix=" + prix + '}';
    }

   
    
}
