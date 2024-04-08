package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.entity.Product;
import com.example.gen20javaspringbootpos.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("async")
public class AsyncController {

    @Autowired
    private OrderService service;


    //@GetMapping("/async-task")
    //public CompletableFuture<String> triggerAsyncTask() {return asyncService.performAsyncTask();}

    @PostMapping("/order")
    public ResponseEntity<Product> processOrder(@RequestBody Product order) throws InterruptedException {

        service.processOrder(order);
        testAsync(order);
        testAsync(order);
        return ResponseEntity.ok(order);
    }

    @Async("asyncTaskExecutor")
    public void testAsync(Product order) throws InterruptedException{
        service.notifyUser(order);
        service.notifyPackaging(order);
        service.notifyPacked(order);
        service.notifyDelivery(order);
        service.notifyArrival(order);
    }
}