package org.innovds.reference.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.innovds.fournisseur.domain.Fournisseur;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REFERENCE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reference extends AbstractPersistable<Long> {

    private String titreProjet;
    private String secteurActivite;
    private String PresentaionProjet;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;
}
