package com.example.gen20javaspringbootpos.controller.config;

import com.example.gen20javaspringbootpos.service.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransactionConfig {

        @Bean
        public TransactionService transactionService() {
            return new TransactionService();
        }

}
