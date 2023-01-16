package com.universales.resttemplate.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.universales.resttemplate.dto.Salida;
import com.universales.resttemplate.dto.seasonstvmaze;
import com.universales.resttemplate.dto.showtvmaze;

public class UserService {
	
	 private String basePath="https://api.tvmaze.com/shows/";
	
	 
	 private final RestTemplate restTemplate = new RestTemplate();
	
	public List<Salida> getUsers(@PathVariable ("id") Integer id)throws JsonMappingException, JsonProcessingException{
		String response = restTemplate.getForObject(basePath+id+"/episodes", String.class);
		ObjectMapper mapper=new ObjectMapper();
		showtvmaze[] resultado=mapper.readValue(response, showtvmaze[].class);
		 List<showtvmaze> tempB = Arrays.asList(resultado);
		 List<Salida> resultado2= new ArrayList<Salida>();
		   for (int i=0;i<tempB.size();i++) {
	            showtvmaze temporal2= tempB.get(i);
	            	Salida nuevo=new Salida(temporal2.getId(),temporal2.getName(),temporal2.getNumber(),temporal2.getType(), temporal2.getService(),temporal2.getServiceUrl());
	            	resultado2.add(nuevo);
	       
	    		}
		   
		   String response2 = restTemplate.getForObject(basePath+id+"/seasons", String.class);
		   seasonstvmaze[] resultado3=mapper.readValue(response2, seasonstvmaze[].class);
		   List<seasonstvmaze> temporal3=Arrays.asList(resultado3);
		   for (int i=0;i<temporal3.size();i++) {
			seasonstvmaze temporal4=temporal3.get(i);
			Salida nuevo=new Salida(temporal4.getId(),temporal4.getName(),temporal4.getNumber(),temporal4.getType(),temporal4.getService(),temporal4.getServiceUrl());
			resultado2.add(nuevo);
			
		}
		return resultado2;
	}

}
