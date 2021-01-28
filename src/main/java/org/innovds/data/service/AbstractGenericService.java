package org.innovds.data.service;

import java.util.List;
import java.util.Optional;

import org.innovds.data.exceptions.NotFoundException;
import org.innovds.data.repository.IGenericJpaRepository;
import org.innovds.util.ReflectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public abstract class AbstractGenericService<T, ID> implements IGenericService<T, ID> {
	private IGenericJpaRepository<T, ID> repository;

	private Logger log = LoggerFactory.getLogger(this.getClass());

//	@PostConstruct
//	public void init() {
//		log.trace("init " + this.getClass());
//	}

	@SuppressWarnings("unchecked")
	@Autowired
	public void setRepository(IGenericJpaRepository<T, ID> repository) {
		this.repository = repository;
		log.trace("===> " + this.getClass().getName() + " : inject repository");
		Class<?> domainClass = ReflectUtils.findParameterType(this, 0);
		if (domainClass != null) {
			setDomainClass((Class<T>) domainClass);
			log.trace(this.getClass().getName() + " : "  + domainClass);
		}
	}

	public void setDomainClass(Class<T> domainClass) {
		repository.setDomainClass(domainClass);
	}

	@Override
	public Optional<T> findOne(ID id) {
		return repository.findById(id);
	}

	@Override
	public Page<T> find(String filter, Pageable pageable) {
		return repository.findAll(pageable);
//		return repository.find(filter, pageable);
	}

	@Override
	public List<T> find(String filter) {
		return repository.findAll();
	}

	@Override
	public long count(String filter) {
		return repository.count();
	}

	@Override
	public T save(T entity) {
		return repository.save(entity);
	}

	@Override
	public T update(T entity) {
		return repository.save(entity);
	}

	@Override
	public Void delete(ID id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NotFoundException();
		}
		return null;
	}

}