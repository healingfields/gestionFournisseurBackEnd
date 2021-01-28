package org.innovds.tests;

import java.io.Serializable;

import org.springframework.core.ResolvableType;
import org.springframework.data.domain.Persistable;

public abstract class Service<T, ID> {

	private Jpa<T, ID> jpa;
	
	public void setJpa(Jpa<T, ID> jpa) {
		this.jpa = jpa;
		ResolvableType resolvableType = ResolvableType.forClassWithGenerics(this.getClass(), Persistable.class, Serializable.class);
		System.out.println(resolvableType);
		System.out.println(resolvableType.getGeneric(0));
	}
	
	
}
