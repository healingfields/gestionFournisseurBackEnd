package org.innovds.fournisseur.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.innovds.certification.domain.Certification;
import org.innovds.compte.domain.Compte;
import org.innovds.partenaire.domain.Partenaire;
import org.innovds.produit.domain.Produit;
import org.innovds.reference.domain.Reference;
import org.innovds.ressourceMateriel.domain.RessourceMateriel;
import org.innovds.ressourcehumaine.domain.RessourceHumaine;
import org.innovds.service.domain.Service;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "FOURNISSEUR")
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur extends AbstractPersistable<Long> {

    private String raisonSocial;
    private Integer ice;
    private String statutJuridique;
    @Column(length = 500)
    private String siegeSociale;
    private String nomGarent;

//    public void setCompte(Compte compte) {
//        compte.setFournisseur(this);

//        this.compte = compte;
//    }
//
//
//    public void setServices(List<Service> services) {
//        for(Service service:services){
//            this.services.add(service);
//            service.setFournisseur(this);
//        }
//
//    }

    private String tel;
    private String email;
    private String anneePremiereVente;
    private String ville;
    private String region;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "compte_id")
    private Compte compte;


    @OneToMany(mappedBy ="fournisseur",cascade = CascadeType.ALL)
    private List<Service> services=new ArrayList<>();

    @OneToMany(mappedBy ="fournisseur",cascade = CascadeType.ALL )
    private List<RessourceMateriel> ressourceMateriels=new ArrayList<>();

    @OneToMany(mappedBy = "fournisseur",cascade = CascadeType.ALL)
    private List<Produit> produits=new ArrayList<>();

    @OneToMany(mappedBy = "fournisseur",cascade = CascadeType.ALL)
    private List<Partenaire> partenaires=new ArrayList<>();

    @OneToMany(mappedBy = "fournisseur",cascade = CascadeType.ALL)
    private List<Certification> certifications=new ArrayList<>();

    @OneToMany(mappedBy = "fournisseur",cascade = CascadeType.ALL)
    private List<RessourceHumaine> ressourceHumaines=new ArrayList<>();

    @OneToMany(mappedBy = "fournisseur",cascade = CascadeType.ALL)
    private List<Reference> references = new ArrayList<>();


}
