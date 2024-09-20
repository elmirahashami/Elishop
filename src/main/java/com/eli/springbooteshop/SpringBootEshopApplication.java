/**
 * Author: Elmira Hashami
 * User:Elmira
 * Date:9/18/2024
 * Time:11:09 PM
 */

package com.eli.springbooteshop;

import com.eli.springbooteshop.controller.ProductController;
import com.eli.springbooteshop.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEshopApplication implements CommandLineRunner {

    private final ProductService service;

    public SpringBootEshopApplication(ProductService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEshopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // service.saveProducts();
    }
}
