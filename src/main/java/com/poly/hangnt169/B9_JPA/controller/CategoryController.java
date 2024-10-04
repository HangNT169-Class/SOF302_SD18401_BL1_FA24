package com.poly.hangnt169.B9_JPA.controller;

import com.poly.hangnt169.B9_JPA.entity.Category1;
import com.poly.hangnt169.B9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    // Phan trang => Page
    // 29: phan tu
    // 5 phan tu 1 trang
    // Trang 1 : 5 phan tu // 0
    // Trang 2 : 5 phan tu tiep // 2
    // Trang 3 : 5 phan tu tiep
    // Trang 4 : 5 phan tu tiep
    // Trang 5 : 5 phan tu tiep
    // Trang 6: 4 phan tu
    // Co san trong
    // Tra ve API => test postman
    @ResponseBody
    @GetMapping("/phan-trang")
    public Page<Category1> phanTrangCacPhanTu(@RequestParam("pageNo1") Integer pageNo,
                                              @RequestParam("pageSize1") Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return repository.findAll(pageable);
    }

}
