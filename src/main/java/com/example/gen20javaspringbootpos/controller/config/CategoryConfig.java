package com.example.gen20javaspringbootpos.controller.config;

import com.example.gen20javaspringbootpos.service.CategoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfig {

        @Bean
        public CategoryService categoryService() {
            return new CategoryService();
        }

}
