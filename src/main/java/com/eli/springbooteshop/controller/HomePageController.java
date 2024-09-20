/**
 * Author: Elmira Hashami
 * User:Elmira
 * Date:9/18/2024
 * Time:11:09 PM
 */

package com.eli.springbooteshop.controller;

import com.eli.springbooteshop.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    private final ProductService service;

    public HomePageController(ProductService service) {
        this.service = service;
    }

//    @GetMapping("/")
//    public String getHomePage(){
//        return "index";
//    }

    @GetMapping("/")
    public String showAllProducts(Model model){
        model.addAttribute("shopName", "Elishop");
        model.addAttribute("productList", service.getAllProducts());
        return "index";
    }
}
