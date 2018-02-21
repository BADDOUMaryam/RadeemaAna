/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author sabrine
 */
@Entity
public class Consommation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int consMois ;
    private int consAnnee;
    private Double consommation ;
   
    private String type ;
    @ManyToOne
    private Client client ;
    @ManyToOne
     private TrancheEau trancheEau;
    @ManyToOne
    private TrancheElectricite trancheElectricite;
    @ManyToOne
    private FactureEau factureEau;
    @ManyToOne
    private FactureElectricite factureElectricite;

    public Consommation() {
    }

    public Consommation(Long id) {
        this.id = id;
    }

    public Consommation(Long id, int consMois, int consAnnee, Double consommation, String type) {
        this.id = id;
        this.consMois = consMois;
        this.consAnnee = consAnnee;
        this.consommation = consommation;
        this.type = type;
    }

    public FactureEau getFactureEau() {
        return factureEau;
    }

    public void setFactureEau(FactureEau factureEau) {
        this.factureEau = factureEau;
    }

    public FactureElectricite getFactureElectricite() {
        return factureElectricite;
    }

    public void setFactureElectricite(FactureElectricite factureElectricite) {
        this.factureElectricite = factureElectricite;
    }



    public TrancheEau getTrancheEau() {
        return trancheEau;
    }

    public void setTrancheEau(TrancheEau trancheEau) {
        this.trancheEau = trancheEau;
    }

    public TrancheElectricite getTrancheElectricite() {
        return trancheElectricite;
    }

    public void setTrancheElectricite(TrancheElectricite trancheElectricite) {
        this.trancheElectricite = trancheElectricite;
    }
 

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getConsMois() {
        return consMois;
    }

    public void setConsMois(int consMois) {
        this.consMois = consMois;
    }

    public int getConsAnnee() {
        return consAnnee;
    }

    public void setConsAnnee(int consAnnee) {
        this.consAnnee = consAnnee;
    }

   

    public Double getConsommation() {
        return consommation;
    }

    public void setConsommation(Double consommation) {
        this.consommation = consommation;
    }




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
        if (!(object instanceof Consommation)) {
            return false;
        }
        Consommation other = (Consommation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consommation{" + "id=" + id + ", consMois=" + consMois + ", consAnnee=" + consAnnee + ", consommation=" + consommation + ", type=" + type + '}';
    }

 
 
}
