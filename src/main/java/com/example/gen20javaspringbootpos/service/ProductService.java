package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService implements ProductImplementation{
    private List<Product> listProduct;

    @Autowired
    private ProductRepository productRepo;

    public ProductService(){
        listProduct = new ArrayList<>();
        Product p1=new Product(1, "AAA", 10000,1,30);
        Product p2=new Product(2, "BBB", 10000,1,30);

        listProduct.addAll(Arrays.asList(p1,p2));
    }

    @Override
    public Product findById(int id){
        Product out=new Product(0,"Unavailable",0,0,0);
        for(Product st: listProduct) {
            if(id==st.getId()) {
                return st;
            }
        }
        return out;
    }

    public List<Product> getProduct(){
        return listProduct;
    }

    //public String helloWorld(){
    //    return "hello world";
    //}

    @Override
    public List<Product> fetchProdList() {
        return productRepo.findAll();
    }
}
