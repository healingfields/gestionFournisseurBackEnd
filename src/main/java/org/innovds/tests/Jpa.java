package org.innovds.tests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Jpa<T, ID> {

	private Class<T> domaineClass;
}
