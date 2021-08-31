package org.innovds.fournisseur.web;

import org.innovds.certification.domain.Certification;
import org.innovds.data.web.AbstractCrudController;
import org.innovds.fournisseur.domain.Fournisseur;
import org.innovds.partenaire.domain.Partenaire;
import org.innovds.produit.domain.Produit;
import org.innovds.reference.domain.Reference;
import org.innovds.ressourceMateriel.domain.RessourceMateriel;
import org.innovds.ressourcehumaine.domain.RessourceHumaine;
import org.innovds.service.domain.Service;
import org.innovds.service.service.ServiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.cert.Certificate;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController extends AbstractCrudController<Fournisseur,Long> {
    protected Logger log = LoggerFactory.getLogger(this.getClass());



    @Override
    @PostMapping
    public Fournisseur save(@RequestBody  Fournisseur object) {
        for(Service service:object.getServices()){
            service.setFournisseur(object);
        }
        for(RessourceMateriel ressourceMateriel:object.getRessourceMateriels()){
           ressourceMateriel.setFournisseur(object);

        }
        for(RessourceHumaine ressourceHumaine:object.getRessourceHumaines()){
            ressourceHumaine.setFournisseur(object);
        }
        for(Partenaire partenaire:object.getPartenaires()){
            partenaire.setFournisseur(object);
        }
        for(Produit produit:object.getProduits()){
            produit.setFournisseur(object);
        }
        for(Certification certification:object.getCertifications()){
            certification.setFournisseur(object);
        }
        for(Reference reference:object.getReferences()){
            reference.setFournisseur(object);
        }
       log.info(String.valueOf(object.getServices()));
        return super.save(object);
    }


}
