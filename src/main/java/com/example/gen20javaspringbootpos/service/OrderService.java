package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service

public class OrderService {

    @Autowired
    private PaymentService payServ;

    public Product processOrder(Product pr) throws InterruptedException{
        payServ.processPayment(pr);
        return pr;
    }

    @Async("asyncTaskExecutor")
    public void notifyUser(Product pr) throws InterruptedException{
        Thread.sleep(3000L);
        System.out.println("Notifying user "+Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")
    public void notifyPackaging(Product pr) throws InterruptedException{
        Thread.sleep(2000L);
        System.out.println("Packaging... "+Thread.currentThread().getName());
    }
    @Async("asyncTaskExecutor")
    public void notifyPacked(Product pr) throws InterruptedException{
        Thread.sleep(5000L);
        System.out.println("Packaging complete "+Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")
    public void notifyDelivery(Product pr) throws InterruptedException{
        Thread.sleep(10000L);
        System.out.println("Delivery start "+Thread.currentThread().getName());
    }
    @Async("asyncTaskExecutor")
    public void notifyArrival(Product pr) throws InterruptedException{
        Thread.sleep(10000L);
        System.out.println("Delivery complete "+Thread.currentThread().getName());
    }

}
