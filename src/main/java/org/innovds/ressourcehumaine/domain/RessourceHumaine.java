package org.innovds.ressourcehumaine.domain;

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
import java.io.File;
import java.sql.Blob;


@Entity
@Table(name = "RESSOURCE_HUMAINE" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RessourceHumaine extends AbstractPersistable<Long> {

    private String civilite;
    private String nom;
    private String prenom;
    private String tel;
    private String postActuel;
    private String experienceTotale;
    private File cv;
    private String niveauEtudes;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;


}
