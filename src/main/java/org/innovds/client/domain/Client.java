package org.innovds.client.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.AbstractPersistable;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
