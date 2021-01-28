package org.innovds.client.domain;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ClientView extends AbstractPersistable<Long> {

	private String name;

}
