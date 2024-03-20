package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.model.Product;
import com.example.gen20javaspringbootpos.service.ProductImplementation;
import com.example.gen20javaspringbootpos.service.ProductRepository;
import com.example.gen20javaspringbootpos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@ComponentScan({"com.gen-20-java-springboot-pos."})
@RequestMapping(path="api")
@RestController
public class ProductController{

    @Autowired
    @Qualifier("productService")
    private ProductService productService;
    @Autowired
    private ProductRepository productRepo;

    //@GetMapping("/helloworld")
    //public String helloWorld(){
    //    return productService.helloWorld();
    //}

    //@GetMapping("/product")
    //public String getProduct(@RequestParam Integer id){
    //    return productService.getProduct(id);
    //}

    @GetMapping("/list")
    public List<Product> getProduct(){
        return productService.getProduct();
    }
    @GetMapping("/id")
    public Product findById(int id){
        return productService.findById(id);
    }
    @GetMapping("/prod")
    public List<Product> fetchProdList() { return productService.fetchProdList();
        //return productRepo.findAll();
        }

    @GetMapping("/test")
    public String test() { return "test ok"; }
}
