package com.universales.resttemplate.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.universales.resttemplate.dto.Salida;
import com.universales.resttemplate.dto.showtvmaze;
import com.universales.resttemplate.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userservice = new UserService();
		@GetMapping("/{id}")
		public ResponseEntity<List<Salida>>getAll(@PathVariable Integer id)throws JsonMappingException,JsonProcessingException,JsonEOFException{
			return new ResponseEntity<>(userservice.getUsers(id),HttpStatus.OK);
	}
}
