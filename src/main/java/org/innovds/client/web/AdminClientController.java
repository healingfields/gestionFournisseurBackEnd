package org.innovds.client.web;

import org.innovds.client.domain.Client;
import org.innovds.data.web.AbstractController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/client")
public class AdminClientController extends AbstractController<Client, Long>{

	@PutMapping("/email")
	public void modifierEmail(String email) {
		System.out.println("email : " + email);
		service.find(null);
	}
}
