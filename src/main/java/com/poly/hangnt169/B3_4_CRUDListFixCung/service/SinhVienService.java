package com.poly.hangnt169.B3_4_CRUDListFixCung.service;

import com.poly.hangnt169.B3_4_CRUDListFixCung.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//Tang service : xu ly logic => them dung @ cua tang => Spring nhan lam bean
public class SinhVienService {

    private List<SinhVien>listSinhVien = new ArrayList<>();

    public SinhVienService() {
        // add cac phan tu vao trong contrutor
        listSinhVien.add(new SinhVien("11","Ngoc","haDong",20,true));
        listSinhVien.add(new SinhVien("13","Nam","LucNgan",22,false));
        listSinhVien.add(new SinhVien("14","Minh","ThanhTri",21,true));
        listSinhVien.add(new SinhVien("15","Lan","QuangNgai",21,false));
        listSinhVien.add(new SinhVien("16","Ha","QuangTri",20,true));
    }

    public List<SinhVien> getAll() {
        return listSinhVien;
    }

    public void removeSinhVien(String mssv){
        listSinhVien.removeIf(s->s.getMasv().equalsIgnoreCase(mssv));
    }
}
