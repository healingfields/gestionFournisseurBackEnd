package org.innovds.client.web;

import org.innovds.client.domain.Client;
import org.innovds.data.web.AbstractCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController extends AbstractCrudController<Client, Long> {


}
