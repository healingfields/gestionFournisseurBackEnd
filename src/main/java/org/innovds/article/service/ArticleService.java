package org.innovds.article.service;

import org.innovds.article.domain.Article;
import org.innovds.data.service.AbstractGenericService;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Service
@Log
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
	
}
