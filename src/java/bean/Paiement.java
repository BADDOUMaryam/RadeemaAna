/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author sabrine
 */
@Entity
public class Paiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double montant;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePaiement;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePLimite;
    @ManyToOne
    private Client client ;
    @ManyToOne
     private FactureEau factureEau;
    @ManyToOne
    private FactureElectricite factureElectricite ;
    @OneToMany(mappedBy = "paiement")
    private List<Avertissemnt> avertissemnts;
    
    
    public Paiement() {
    }

    public Paiement(Long id) {
        this.id = id;
    }

    public Paiement(Long id, Double montant, Date datePaiement, Date datePLimite) {
        this.id = id;
        this.montant = montant;
        this.datePaiement = datePaiement;
        this.datePLimite = datePLimite;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDatePLimite() {
        return datePLimite;
    }

    public void setDatePLimite(Date datePLimite) {
        this.datePLimite = datePLimite;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public List<Avertissemnt> getAvertissemnts() {
        return avertissemnts;
    }

    public void setAvertissemnts(List<Avertissemnt> avertissemnts) {
        this.avertissemnts = avertissemnts;
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
    
    

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }
    

    public Paiement(Long id, Date datePaiement) {
        this.id = id;
        this.datePaiement = datePaiement;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof Paiement)) {
            return false;
        }
        Paiement other = (Paiement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paiement{" + "id=" + id + ", montant=" + montant + ", datePaiement=" + datePaiement + ", datePLimite=" + datePLimite + '}';
    }
  
 
}
