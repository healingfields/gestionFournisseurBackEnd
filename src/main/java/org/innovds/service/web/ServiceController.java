package org.innovds.service.web;

import org.innovds.data.web.AbstractCrudController;
import org.innovds.fournisseur.domain.Fournisseur;
import org.innovds.fournisseur.service.FournisseurService;
import org.innovds.service.domain.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service/")
public class ServiceController extends AbstractCrudController<Service,Long> {

    @Autowired
    FournisseurService fournisseurService;

//    @Override
//    @PostMapping
//    public Service save(@RequestBody Service object) {
//        Fournisseur fournisseur=object.getFournisseur();
//        fournisseurService.save(fournisseur);
//        fournisseur.getServices().add(object);
//        return super.save(object);
//    }
}
