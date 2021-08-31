package org.innovds.ressourceMateriel.web;

import org.innovds.data.web.AbstractCrudController;
import org.innovds.ressourceMateriel.domain.RessourceMateriel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ressourceMateriels")
public class RessourceMaterielController extends AbstractCrudController<RessourceMateriel,Long> {
}
