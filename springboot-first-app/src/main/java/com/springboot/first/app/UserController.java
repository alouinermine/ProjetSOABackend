package com.springboot.first.app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import database.DbCommande;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@PostMapping("/add/user")
	public User addUser(@RequestBody User u)  {
		return u;
	
	}


	@GetMapping("/get/user")
	public List<Object> getusers() {
		ArrayList<Object>  users = new ArrayList<>() ;
	
		return users;

	}

	@DeleteMapping(path="/delete/{username}")
	public String deleteUser(@PathVariable String username)  {

		
		return " user deleted ! " ;
	}

}
