package org.innovds.partenaire.web;

import org.innovds.data.web.AbstractCrudController;
import org.innovds.partenaire.domain.Partenaire;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("partenaire/")
public class PartenaireController extends AbstractCrudController<Partenaire,Long> {
}
