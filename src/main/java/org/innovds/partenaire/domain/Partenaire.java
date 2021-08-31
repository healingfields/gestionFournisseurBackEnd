package org.innovds.partenaire.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.innovds.data.service.AbstractGenericService;
import org.innovds.fournisseur.domain.Fournisseur;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "PARTENAIRE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partenaire extends AbstractPersistable<Long> {

    private String codeIce;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fournisseur" )
    private Fournisseur fournisseur;
}
