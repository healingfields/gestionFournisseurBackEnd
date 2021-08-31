package org.innovds.produit.web;

import org.innovds.data.web.AbstractCrudController;
import org.innovds.produit.domain.Produit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produit")
public class ProduitController extends AbstractCrudController<Produit,Long> {
}
