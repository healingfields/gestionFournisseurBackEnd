package org.innovds.article.service;

import java.util.List;
import java.util.Optional;

import org.innovds.article.domain.Article;
import org.innovds.article.dto.ArticleDto;
import org.innovds.data.service.AbstractGenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ArticleService extends AbstractGenericService<Article, Long> {
//	
//	public ArticleService(GenericJpaRepository<Article, Long> repository) {
//		super(repository);
//	}
//
//	@PostConstruct
//	public void init() {
//		super.init();
//		setDomainClass(Article.class);
//	}

//	private IGenericService<Client, Long> clientService;
//	
//	@Autowired
//	public void setClientService(IGenericService<Client, Long> clientService) {
//		this.clientService = clientService;
//		clientService.setDomainClass(Client.class);
//	}
//	
	@Override
	public Article save(Article object) {
		log.info("Article service specific save");
		return super.save(object);
	}

	@Override
	public Page<ArticleDto> find(String filter, Pageable pageable) {
//		List<ArticleDto> resultList = repository.createQuery("select a.name as name, a.pu as pu from Article a", ArticleDto.class).getResultList();
//		List<ArticleDto> resultList = repository.createQuery("select new ArticleDto(a.name, a.pu) from Article a", ArticleDto.class).getResultList();
		List<ArticleDto> resultList = repository
				.createQuery("select new org.innovds.article.dto.ArticleDto(a.id, a.name, a.pu) from Article a",
						ArticleDto.class)
				.getResultList();
//		return super.find(filter);
//		TypedQuery<ArticleDto> createQuery = repository.createQuery("select a.name as name, a.pu as pu from Article a", ArticleDto.class);
//		createQuery.unwrap(org.hibernate.query.Query.class).setResultTransformer(Transformers.aliasToBean(ArticleDto.class));
//
//		List<ArticleDto> resultList = null;
		return new PageImpl<ArticleDto>(resultList);
	}

	@Override
	public Optional<ArticleDto> findOne(Long id) {
		return super.findById(id).map(article -> new ArticleDto(article.getId(), article.getName(), article.getPu()));
	}

}
