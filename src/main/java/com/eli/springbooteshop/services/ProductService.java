/**
 * Author: Elmira Hashami
 * User:Elmira
 * Date:9/18/2024
 * Time:11:09 PM
 */

package com.eli.springbooteshop.services;

import com.eli.springbooteshop.dao.ProductRepository;
import com.eli.springbooteshop.domainModel.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProducts() {
        List<Product> products = List.of(
                Product.builder().name("iPhone 15").price(1500).productInfo("This is iPhone 15 pro max").build(),
                Product.builder().name("iPhone 14").price(1300).productInfo("This is iPhone 14 pro max").build(),
                Product.builder().name("iPhone 13").price(1000).productInfo("This is iPhone 133 pro max").build(),
                Product.builder().name("iPhone 12").price(700).productInfo("This is iPhone 12 pro max").build());
        productRepository.saveAll(products);
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


}
