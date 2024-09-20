package com.poly.hangnt169.B3_4_CRUDListFixCung.controller;

import com.poly.hangnt169.B3_4_CRUDListFixCung.entity.SinhVien;
import com.poly.hangnt169.B3_4_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SinhVienController {
    // controller duoc trao doi truc tiep service
    // Goi 1 bean trong spring boot
    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiSinhVien(Model model) {
        model.addAttribute("lists", sinhVienService.getAll());
        return "buoi3/sinhviens";
    }

    // Pathvariable => Lay gia tri truc tiep tren duong dan
    @GetMapping("/sinh-vien/remove/{ma}")
    public String removeSinhVien(@PathVariable("ma") String mssv) {
        sinhVienService.removeSinhVien(mssv);
        // quay ve trang ban dau =>redirect
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/sinh-vien/detail")
    public String detailSinhVien(@RequestParam("id") String maSV, Model model) {
        model.addAttribute("sinhVien", sinhVienService.detailSinhVien(maSV));
        return "buoi3/detail-sinh-vien";
    }

    @GetMapping("/sinh-vien/view-update/{id}")
    public String viewUpdate(@PathVariable("id") String maSV, Model model) {
        model.addAttribute("sinhVien", sinhVienService.detailSinhVien(maSV));
        return "buoi3/update-sinh-vien";
    }

    @GetMapping("/sinh-vien/view-add")
    public String viewaddSinhVien() {
        return "buoi3/add-sinh-vien";
    }

    @PostMapping("/sinh-vien/add")
    public String addSinhVien(@RequestParam("mssv") String mssv1,
                              @RequestParam("ten") String ten1,
                              @RequestParam("tuoi") String tuoi1,
                              @RequestParam("diaChi") String diachi1,
                              @RequestParam("gioiTinh")String gioiTinh1
                              ) {
        SinhVien sv = SinhVien.builder()
                .ma(mssv1)
                .ten(ten1)
                .gioiTinh(Boolean.valueOf(gioiTinh1))
                .tuoi(Integer.valueOf(tuoi1))
                .diaChi(diachi1)
                .build();
        sinhVienService.addSinhVien(sv);
        return "redirect:/sinh-vien/hien-thi";
    }

}
