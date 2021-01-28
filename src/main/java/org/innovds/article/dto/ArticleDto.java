package org.innovds.article.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ArticleDto {

	private Long id;
	private String name;

	private Double pu;

}
