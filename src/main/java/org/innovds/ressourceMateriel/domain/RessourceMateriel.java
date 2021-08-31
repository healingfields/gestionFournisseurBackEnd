package org.innovds.ressourceMateriel.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.innovds.fournisseur.domain.Fournisseur;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "RESSOURCE_MATERIEL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RessourceMateriel extends AbstractPersistable<Long> {

    private String type;
    private String marque;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;
}
