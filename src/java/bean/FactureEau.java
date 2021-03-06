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
public class FactureEau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFacture;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date periodeFact;

    private double montantHT;
    private double prixUHT;
    private double Tva;
    private double montantTTC;

    @ManyToOne
    private Client client;
    @ManyToOne
    private Agence agence;
    @OneToMany(mappedBy = "factureEau")
    private List<TrancheEau> trancheEaus;
    @OneToMany(mappedBy = "factureEau")
    private List<Consommation> consommations;
    @OneToMany(mappedBy = "factureEau")
    private List<Paiement> paiements;

    public FactureEau() {
    }

    public FactureEau(Long id) {
        this.id = id;
    }

    public FactureEau(Long id, Date dateFacture, Date periodeFact, double montantHT, double prixUHT, double Tva, double montantTTC) {
        this.id = id;
        this.dateFacture = dateFacture;
        this.periodeFact = periodeFact;
        this.montantHT = montantHT;
        this.prixUHT = prixUHT;
        this.Tva = Tva;
        this.montantTTC = montantTTC;
    }

    public Agence getAgence() {
        return agence;
    }

    public Date getPeriodeFact() {
        return periodeFact;
    }

    public void setPeriodeFact(Date periodeFact) {
        this.periodeFact = periodeFact;
    }

    public List<TrancheEau> getTrancheEaus() {
        return trancheEaus;
    }

    public void setTrancheEaus(List<TrancheEau> trancheEaus) {
        this.trancheEaus = trancheEaus;
    }

    public List<Consommation> getConsommations() {
        return consommations;
    }

    public void setConsommations(List<Consommation> consommations) {
        this.consommations = consommations;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    public double getTva() {
        return Tva;
    }

    public void setTva(double Tva) {
        this.Tva = Tva;
    }

    public double getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(double montantHT) {
        this.montantHT = montantHT;
    }

    public double getPrixUHT() {
        return prixUHT;
    }

    public void setPrixUHT(double prixUHT) {
        this.prixUHT = prixUHT;
    }

    public double getMontantTTC() {
        return montantTTC;
    }

    public void setMontantTTC(double montantTTC) {
        this.montantTTC = montantTTC;
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
        if (!(object instanceof FactureEau)) {
            return false;
        }
        FactureEau other = (FactureEau) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FactureEau{" + "id=" + id + ", dateFacture=" + dateFacture + ", periodeFact=" + periodeFact + ", montantHT=" + montantHT + ", prixUHT=" + prixUHT + ", Tva=" + Tva + ", montantTTC=" + montantTTC + '}';
    }

}
