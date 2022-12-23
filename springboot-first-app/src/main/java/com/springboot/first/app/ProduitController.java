package com.springboot.first.app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import database.DbCommande;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {

	@PostMapping("/produit")
	public Produit addUser(@RequestBody Produit p) {
		return p;


		
	}



	@GetMapping("/get/produit")
	public ArrayList<Object> getusers(){
	
		ArrayList<Object>Produit= new ArrayList<>() ;
        return Produit;
	

	}
}
