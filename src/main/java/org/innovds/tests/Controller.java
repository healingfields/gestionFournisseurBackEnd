package org.innovds.tests;

public abstract class Controller<T, ID> {

	private Service<T, ID> service;
	
	public void setService(Service<T, ID> service) {
		this.service = service;
	}
}
