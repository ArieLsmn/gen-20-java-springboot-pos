package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.entity.Product;
import com.example.gen20javaspringbootpos.model.ResponseFormat;
import com.example.gen20javaspringbootpos.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        messageProducer.sendMessage("my-topic", message);
        return "Message sent: " + message;
    }
    @PostMapping("/sendbody")
    @ResponseBody
    public String sendMessage(@RequestBody Product pr) {
        String message = pr.toString();
        messageProducer.sendMessage("product", message);
        return "Message sent: " + message;
    }

}
