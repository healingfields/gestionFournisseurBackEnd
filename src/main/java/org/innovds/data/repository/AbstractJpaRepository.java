package org.innovds.data.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public abstract class AbstractJpaRepository<T, ID> implements IGenericJpaRepository<T, ID> {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	private EntityManager entityManager;
	private Class<T> domainClass;
	private JpaRepository<T, ID> repository;

	@Override
	public void setDomainClass(Class<T> domainClass) {
		this.domainClass = domainClass;
		repository = new SimpleJpaRepository<T, ID>(domainClass, entityManager);
	}

	public Class<T> getDomainClass() {
		return domainClass;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
		log.trace("inject entityManager");
	}

	@Override
	@Transactional
	public <S extends T> S save(S entity) {
//		findBy("LastNAa")
		return repository.save(entity);
	}

	@Override
	@Transactional
	public <S extends T> S saveAndFlush(S entity) {
		return repository.saveAndFlush(entity);
	}

	@Override
	@Transactional
	public <S extends T> List<S> saveAll(Iterable<S> entities) {
		return repository.saveAll(entities);
	}

	@Override
	@Transactional
	public void deleteById(ID id) {
		repository.deleteById(id);
	}

	@Override
	@Transactional
	public void delete(T entity) {
		repository.delete(entity);
	}

	@Override
	@Transactional
	public void deleteAll(Iterable<? extends T> entities) {
		repository.deleteAll(entities);
	}

	@Override
	@Transactional
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	@Transactional
	public void deleteInBatch(Iterable<T> entities) {
		repository.deleteInBatch(entities);
	}

	@Override
	@Transactional
	public void deleteAllInBatch() {
		repository.deleteAllInBatch();
	}

	@Override
	@Transactional
	public void flush() {
		repository.flush();
	}

	@Override
	public Optional<T> findById(ID id) {
		return repository.findById(id);
	}

	@Override
	public T getOne(ID id) {
		return repository.getOne(id);
	}

	@Override
	public <S extends T> Optional<S> findOne(Example<S> example) {
		return repository.findOne(example);
	}

	@Override
	public List<T> findAllById(Iterable<ID> ids) {
		return repository.findAllById(ids);
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public <DTO> Page<DTO> find(String criteria, Pageable pageable) {
//		return repository.findAll(pageable);
		return null;
	}

	@Override
	public List<T> findAll(Sort sort) {
		return repository.findAll(sort);
	}

	@Override
	public <S extends T> List<S> findAll(Example<S> example) {
		return repository.findAll(example);
	}

	@Override
	public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
		return repository.findAll(example, pageable);
	}

	@Override
	public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
		return repository.findAll(example, sort);
	}

	@Override
	public boolean existsById(ID id) {
		return repository.existsById(id);
	}

	@Override
	public <S extends T> boolean exists(Example<S> example) {
		return repository.exists(example);
	}

	@Override
	public <S extends T> long count(Example<S> example) {
		return repository.count(example);
	}

	@Override
	public long count() {
		return repository.count();
	}

}