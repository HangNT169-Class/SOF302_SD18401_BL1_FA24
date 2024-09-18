package com.poly.hangnt169.B3_4_CRUDListFixCung.controller;

import com.poly.hangnt169.B3_4_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SinhVienController {
    // controller duoc trao doi truc tiep service
    // Goi 1 bean trong spring boot
    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiSinhVien(Model model){
        model.addAttribute("lists",sinhVienService.getAll());
        return "buoi3/sinhviens";
    }

    // Pathvariable => Lay gia tri truc tiep tren duong dan
    @GetMapping("/sinh-vien/remove/{ma}")
    public String removeSinhVien(@PathVariable("ma") String mssv){
        sinhVienService.removeSinhVien(mssv);
        // quay ve trang ban dau =>redirect
        return "redirect:/sinh-vien/hien-thi";
    }
}
