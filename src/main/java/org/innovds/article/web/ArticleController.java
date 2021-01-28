package org.innovds.article.web;

import org.innovds.article.domain.Article;
import org.innovds.data.web.AbstractCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController extends AbstractCrudController<Article, Long> {

}
