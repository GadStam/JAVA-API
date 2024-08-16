package com.gadstam.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadstam.apirest.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
