package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
