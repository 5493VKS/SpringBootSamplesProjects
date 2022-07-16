package com.springboot1Restfull.model;

import java.util.List;

public class Survey {
	
	private String id;
	private String title;
	private String description;
	private List<Question> question;
	
	public Survey(String id, String title, String description, List<Question> question) {
		
		this.id = id;
		this.title = title;
		this.description = description;
		this.question = question;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", title=" + title + ", description=" + description + ", question=" + question
				+ "]";
	}
	
}
