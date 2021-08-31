package org.innovds.certification.web;

import org.innovds.certification.domain.Certification;
import org.innovds.data.web.AbstractCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("certification/")
public class CertificationController extends AbstractCrudController<Certification,Long> {
}
