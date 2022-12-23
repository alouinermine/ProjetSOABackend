package com.springboot.first.app;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import database.DbCommande;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

	@PostMapping("/contact")
	public Contact addUser(@RequestBody Contact c){
		

		return c ;
		

	}



}