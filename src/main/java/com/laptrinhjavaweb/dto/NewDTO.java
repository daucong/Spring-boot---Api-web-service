package com.laptrinhjavaweb.dto;
// DTO sinh ra de su ly logic tren giao dien ma entity k co
public class NewDTO extends AbstractDTO<NewDTO> {
	
	private String title;
	private String content;
	private String shortDescription;
	private String categoryCode;
	private String thumbnail;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getcategoryCode() {
		return categoryCode;
	}

	public void setcategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
