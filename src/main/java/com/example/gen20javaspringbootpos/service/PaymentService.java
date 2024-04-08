package com.example.gen20javaspringbootpos.service;


import com.example.gen20javaspringbootpos.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service

public class PaymentService {


    public void processPayment(Product pr) throws InterruptedException{
        System.out.println("Processing payment for Order: "+pr.getId()+"||Name:"+pr.getName()+"||Price:"+pr.getPrice());
        Thread.sleep(3000L);
        System.out.println("Payment completed for Order: "+pr.getId()+"||Name:"+pr.getName()+"||Price:"+pr.getPrice());
    }
}
