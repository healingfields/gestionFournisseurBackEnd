package org.innovds.data.web;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Persistable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class AbstractReadController<T extends Persistable<ID>, ID> extends AbstractController<T, ID> {

	@GetMapping("/{id}")
	public Optional<T> findOne(@PathVariable ID id) {
		return service.findOne(id);
	}

	@GetMapping
	public <DTO> Page<DTO> find(String filter, Pageable pageable) {
		return service.find(filter, pageable);
	}

}