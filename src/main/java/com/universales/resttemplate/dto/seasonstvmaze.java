package com.universales.resttemplate.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class seasonstvmaze {
	@JsonProperty("id")
    private String id;
	 @JsonProperty("url")
	    private String serviceUrl;
	@JsonProperty("name")
    private String name;
	@JsonProperty("number")
    private String number;
    @JsonProperty("service")
    private String service;
    @JsonProperty("type")
    private String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getServiceUrl() {
		return serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getService() {
		return service = "Tv maze temporadas";
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public seasonstvmaze() {
		
		// TODO Auto-generated constructor stub
	}
	
    
    
}
