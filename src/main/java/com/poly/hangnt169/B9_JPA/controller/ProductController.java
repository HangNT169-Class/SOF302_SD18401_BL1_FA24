package com.poly.hangnt169.B9_JPA.controller;

import com.poly.hangnt169.B9_JPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("product/hien-thi")
    public String getAllProducts(Model model){
        model.addAttribute("products",productRepository.findAll());
        return "buoi9/products";
    }
}
