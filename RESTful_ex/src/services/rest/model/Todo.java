package services.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Todo {
	
	public Todo() {
	}
	
	public Todo(String id, String summary) {
		super();
		this.id = id;
		this.summary = summary;
	}

	private String id;
	private String summary;
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	

}
