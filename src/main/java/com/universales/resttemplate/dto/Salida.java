package com.universales.resttemplate.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Salida {
	private String id;
	private String name;
    private String number;
    private String type;
    private String service;
    private String serviceUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getServiceUrl() {
		return serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	public Salida(String id, String name, String number, String type, String service, String serviceUrl) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.type = type;
		this.service = service;
		this.serviceUrl = serviceUrl;
	}
	
	
	
	
	
}
