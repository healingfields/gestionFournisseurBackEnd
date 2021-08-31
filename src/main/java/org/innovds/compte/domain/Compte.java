package org.innovds.compte.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.metamodel.model.domain.internal.AbstractIdentifiableType;
import org.innovds.fournisseur.domain.Fournisseur;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COMPTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Compte extends AbstractPersistable<Long> {

    private String dateCreation;
    private String email;
    private Boolean isVerified;
    private String motDePass;
    @OneToOne(mappedBy = "compte", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private Fournisseur fournisseur;
}
