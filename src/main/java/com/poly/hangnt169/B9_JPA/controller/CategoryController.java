package com.poly.hangnt169.B9_JPA.controller;

import com.poly.hangnt169.B9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    // hien thi tat ca => findAll
    // add & update => save
    // detail => findById(khoa chinh).get() hoac findById(khoachinh).other...
    // remove => delete hoac deleteById
    @GetMapping("/category/hien-thi")
    public String hienThiCategory(Model model) {
        model.addAttribute("listCate", repository.findAll());
        return "buoi9/category";
    }
    // detail & delete
}
