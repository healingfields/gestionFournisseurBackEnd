package org.innovds.certification.domain;

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
@Table(name = "CERTIFICATION")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Certification extends AbstractPersistable<Long> {

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;
}
