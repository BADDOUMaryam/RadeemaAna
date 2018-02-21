/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author sabrine
 */
@Entity
public class TrancheElectricite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private double prix;
    private double minT;
    private double maxT;
    private double montantTotal;
    @ManyToOne
    private FactureElectricite facture;
    @OneToMany(mappedBy = "trancheElectricite")
    private List<Consommation> consommations;

    public TrancheElectricite() {
    }

    public TrancheElectricite(String id) {
        this.id = id;
    }

    public TrancheElectricite(String id, double prix, double minT, double maxT, double montantTotal) {
        this.id = id;
        this.prix = prix;
        this.minT = minT;
        this.maxT = maxT;
        this.montantTotal = montantTotal;
    }

    public List<Consommation> getConsommations() {
        return consommations;
    }

    public void setConsommations(List<Consommation> consommations) {
        this.consommations = consommations;
    }
 
    public FactureElectricite getFacture() {
        return facture;
    }

    public void setFacture(FactureElectricite facture) {
        this.facture = facture;
    }
  
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getMinT() {
        return minT;
    }

    public void setMinT(double minT) {
        this.minT = minT;
    }

    public double getMaxT() {
        return maxT;
    }

    public void setMaxT(double maxT) {
        this.maxT = maxT;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        if (!(object instanceof TrancheElectricite)) {
            return false;
        }
        TrancheElectricite other = (TrancheElectricite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrancheElectricite{" + "id=" + id + ", prix=" + prix + ", minT=" + minT + ", maxT=" + maxT + ", montantTotal=" + montantTotal + '}';
    }


}
