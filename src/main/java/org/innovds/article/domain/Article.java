package org.innovds.article.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Article extends AbstractPersistable<Long> {
	@NotBlank
	private String name;
	private Long category;

	public Article id(Long id) {
		setId(id);
		return this;
	}
	
}
