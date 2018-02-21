/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author sabrine
 */
@Entity
public class Avertissemnt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String texte;
    private Long amende;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateLimite;
    @ManyToOne
    private Client client ;
    @ManyToOne
    private Paiement paiement;

    public Avertissemnt() {
    }

    public Avertissemnt(Long id) {
        this.id = id;
    }

    public Avertissemnt(Long id, String texte, Long amende, Date dateLimite) {
        this.id = id;
        this.texte = texte;
        this.amende = amende;
        this.dateLimite = dateLimite;
    }
 
    
    
    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Long getAmende() {
        return amende;
    }

    public void setAmende(Long amende) {
        this.amende = amende;
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
        if (!(object instanceof Avertissemnt)) {
            return false;
        }
        Avertissemnt other = (Avertissemnt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avertissemnt{" + "id=" + id + ", texte=" + texte + ", amende=" + amende + ", dateLimite=" + dateLimite + ", client=" + client + ", paiement=" + paiement + '}';
    }


}
