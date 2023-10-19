package com.Lulu.MiniProject_SportsProduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Lulu.MiniProject_SportsProduct.entity.SportsProducts;
import com.Lulu.MiniProject_SportsProduct.repository.ProductRepository;

@RestController  //We use it to create REST API end point along with http methods like GET,POST,DELETE,PUT,PATCH
public class MyController {


	@Autowired
	ProductRepository productRepository;

	@GetMapping("/getProduct")
	public List<SportsProducts> getJPQL() {
		return productRepository.findAll(); // select * from <TableName>;
	}

	@PostMapping("/addProduct")
	public SportsProducts createuser(@RequestBody SportsProducts prod) {
		return productRepository.save(prod);
	}
	@DeleteMapping("/deleteSportsProducts/{id}")
	public void deleteSportsProducts(@PathVariable("id") Integer id  ) {
		productRepository.deleteById(id); // select * from <TableName>;
	}
	@PutMapping("/SportsProducts/{id}")
	public ResponseEntity<Object> updateSportsProducts(@RequestBody SportsProducts sportsproducts, @PathVariable long id) {
    java.util.Optional<SportsProducts> SportsProductsOptional = productRepository.findById((int) id);
	if (SportsProductsOptional.isEmpty()) {
		return ResponseEntity.notFound().build();
	}
	sportsproducts.setId(id);
	productRepository.save(sportsproducts);
	return ResponseEntity.noContent().build();

	}
}