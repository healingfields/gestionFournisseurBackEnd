package org.innovds.fournisseur.service;

import org.innovds.compte.service.CompteService;
import org.innovds.data.service.AbstractGenericService;
import org.innovds.fournisseur.domain.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FournisseurService extends AbstractGenericService<Fournisseur,Long> {
    @Autowired
    CompteService compteService;

    @Override
    public Fournisseur save(Fournisseur entity) {
        log.info("saved successfully");
        log.info(String.valueOf(entity));
        return super.save(entity);
    }
}
