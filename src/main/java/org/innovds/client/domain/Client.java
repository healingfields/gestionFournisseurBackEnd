package org.innovds.client.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Client extends AbstractPersistable<Long> {
	@NotBlank
	private String name;
	private String email;
	private String tel;

	public Client id(Long id) {
		setId(id);
		return this;
	}
	
}
