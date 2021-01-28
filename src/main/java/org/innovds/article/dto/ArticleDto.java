package org.innovds.article.dto;

public class ArticleDto {

	private Long id;
	private String name;
	private Double pu;

	public ArticleDto() {}

	public ArticleDto(Long id, String name, Double pu) {
		this.id = id;
		this.name = name;
		this.pu = pu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPu() {
		return pu;
	}

	public void setPu(Double pu) {
		this.pu = pu;
	}

}
