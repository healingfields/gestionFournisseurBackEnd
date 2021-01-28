package org.innovds.article.domain;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Category extends AbstractPersistable<Long> {

	
	private String name;

}
