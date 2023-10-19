package com.Lulu.MiniProject_SportsProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lulu.MiniProject_SportsProduct.entity.SportsProducts;

public interface ProductRepository extends JpaRepository<SportsProducts, Integer> {

	//
	//@Query("SELECT s FROM SportsProducts s ")
	//List<SportsProducts> findAllMyQuery();



	//@Query(value ="SELECT * FROM sports_products",nativeQuery = true)  ///Native Query
	//List<SportsProducts> findAllNativeQuey();



}