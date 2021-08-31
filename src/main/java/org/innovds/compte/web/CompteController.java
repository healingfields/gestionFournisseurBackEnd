package org.innovds.compte.web;

import org.innovds.compte.domain.Compte;
import org.innovds.data.web.AbstractCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compte")
public class CompteController extends AbstractCrudController<Compte,Long> {
}
