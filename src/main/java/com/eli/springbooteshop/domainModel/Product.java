/**
 * Author: Elmira Hashami
 * User:Elmira
 * Date:9/18/2024
 * Time:11:09 PM
 */

package com.eli.springbooteshop.domainModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_price")
    private int price;
    @Column(name = "product_info")
    private String productInfo;

}
