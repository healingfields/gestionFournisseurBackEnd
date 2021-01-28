package org.innovds.client.web;
//package org.innovds.client.web;
//
//import java.util.List;
//
//import org.innovds.client.domain.ClientView;
//import org.innovds.service.GenericService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/client")
//public class ClientViewController {
//
//	
//	private GenericService<ClientView, Long> service;
//	
//	@Autowired
//	public void setService(GenericService<ClientView, Long> service) {
//		this.service = service;
//		System.out.println("==> " + this.getClass().getName() + " : inject service");
//	}
//
//	@GetMapping("/allinfo")
//	public List<ClientView> getAll() {
//		return service.find(null);
//	}
//}
