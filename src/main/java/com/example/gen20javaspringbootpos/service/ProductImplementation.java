package com.example.gen20javaspringbootpos.service;


import com.example.gen20javaspringbootpos.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductImplementation {


    //Product findById(Integer id);

    //@Query("select * from Product")
    List<Product> fetchProdList();

    //@Query("select * from Product where id = prodId")
    Product findById(/*@Param("prodId")*/ int id);

}

