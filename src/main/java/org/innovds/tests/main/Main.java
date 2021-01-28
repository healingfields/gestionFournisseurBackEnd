package org.innovds.tests.main;

import org.innovds.tests.Jpa;

public class Main {

	void ex1() {
		Jpa<Contact, Long> jpa = new Jpa<Contact, Long>();
		ContactService cs = new ContactService();
		cs.setJpa(jpa);
	}
	
	public Main() {
		ex1();
	}

	public static void main(String[] args) {
		new Main();
	}

}
