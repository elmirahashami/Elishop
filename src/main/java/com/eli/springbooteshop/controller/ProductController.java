/**
 * Author: Elmira Hashami
 * User:Elmira
 * Date:9/18/2024
 * Time:11:09 PM
 */

package com.eli.springbooteshop.controller;

import com.eli.springbooteshop.domainModel.Product;
import com.eli.springbooteshop.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("saveAll")
    public String saveProducts() {

        service.saveProducts();
        return "index";
    }


}
