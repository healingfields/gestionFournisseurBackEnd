package org.innovds.produit.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.innovds.fournisseur.domain.Fournisseur;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "PRODUIT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit extends AbstractPersistable<Long> {

    private String nom;
    private String type;
    private String description;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;
}
