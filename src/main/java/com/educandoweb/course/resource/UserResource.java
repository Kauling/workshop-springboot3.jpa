package com.educandoweb.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	/**
	 * Classe responsável por passar o objeto para o tomcat
	 * @return
	 */
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Rodrigo", "Rodrigo@gmail.com", "9999", "1234");
		return ResponseEntity.ok().body(u);
	}

}
