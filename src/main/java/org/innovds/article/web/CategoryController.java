package org.innovds.article.web;

import org.innovds.article.domain.Category;
import org.innovds.data.web.AbstractCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController extends AbstractCrudController<Category, Long> {

//	@GetMapping
//	private Page<Category> find2(String filter, Pageable pageable) {
//		// TODO Auto-generated method stub
////		return super.find(filter, pageable);
//		return null;
//	}
}
