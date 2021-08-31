package org.innovds.ressourcehumaine.web;

import org.innovds.data.web.AbstractCrudController;
import org.innovds.ressourcehumaine.domain.RessourceHumaine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ressourceHumaine/")
public class RessourceHumaineController extends AbstractCrudController<RessourceHumaine,Long> {
}
