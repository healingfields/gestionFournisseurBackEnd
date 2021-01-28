package org.innovds.article.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Article extends AbstractPersistable<Long> {
	@NotBlank
	private String name;
	private Double pu;
	private Long category;

	public Article id(Long id) {
		setId(id);
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPu() {
		return pu;
	}

	public void setPu(Double pu) {
		this.pu = pu;
	}

	public Long getCategory() {
		return category;
	}

	public void setCategory(Long category) {
		this.category = category;
	}

}
