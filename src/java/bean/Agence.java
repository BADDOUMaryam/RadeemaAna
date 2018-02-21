/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author hp
 */
@Entity
public class Agence implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nom;
    private String adresse;
    private Long tel;
    @OneToMany(mappedBy = "agence")
    private List<Reclamation> reclamations;
    @OneToMany(mappedBy = "agence")
    private List<FactureEau> factureEaus;
    @OneToMany(mappedBy = "agence")
    private List<FactureElectricite> factureElectricites;

    public Agence() {
    }

    public Agence(String id) {
        this.id = id;
    }

    public Agence(String id, String nom, String adresse, Long tel) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
    }

    public List<FactureEau> getFactureEaus() {
        return factureEaus;
    }

    public void setFactureEaus(List<FactureEau> factureEaus) {
        this.factureEaus = factureEaus;
    }

    public List<FactureElectricite> getFactureElectricites() {
        return factureElectricites;
    }

    public void setFactureElectricites(List<FactureElectricite> factureElectricites) {
        this.factureElectricites = factureElectricites;
    }
    

    public List<Reclamation> getReclamations() {
        return reclamations;
    }

    public void setReclamations(List<Reclamation> reclamations) {
        this.reclamations = reclamations;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
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
        if (!(object instanceof Agence)) {
            return false;
        }
        Agence other = (Agence) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agence{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", tel=" + tel + '}';
    }


}
