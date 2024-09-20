package com.poly.hangnt169.B3_4_CRUDListFixCung.service;

import com.poly.hangnt169.B3_4_CRUDListFixCung.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//Tang service : xu ly logic => them dung @ cua tang => Spring nhan lam bean
public class SinhVienService {

    private List<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienService() {
        // add cac phan tu vao trong contrutor
        listSinhVien.add(new SinhVien("11", "Ngoc", "haDong", 20, true));
        listSinhVien.add(new SinhVien("13", "Nam", "LucNgan", 22, false));
        listSinhVien.add(new SinhVien("14", "Minh", "ThanhTri", 21, true));
        listSinhVien.add(new SinhVien("15", "Lan", "QuangNgai", 21, false));
        listSinhVien.add(new SinhVien("16", "Ha", "QuangTri", 20, true));
    }

    public List<SinhVien> getAll() {
        return listSinhVien;
    }
    //    public List<SinhVien> getAll() {
//        return listSinhVien;
//    }

    public void removeSinhVien(String mssv) {
        listSinhVien.removeIf(s -> s.getMa().equalsIgnoreCase(mssv));
//        for (int i = 0; i < listSinhVien.size(); i++) {
//            // check
//            if(listSinhVien.get(i).getMasv().equalsIgnoreCase(mssv)){
//                listSinhVien.remove(i);
//                break;
//            }
//        }
    }

    public SinhVien detailSinhVien(String mssv) {
//        for (int i = 0; i < listSinhVien.size(); i++) {
//            // check
//            if (listSinhVien.get(i).getMa().equalsIgnoreCase(mssv)) {
//                return listSinhVien.get(i);
//            }
//        }
//        return null;
        // filter => bo loc (loc ra cac doi tuong can thiet)
//        return listSinhVien.stream().filter(s->s.getMa().equalsIgnoreCase(mssv)).findFirst().orElse(null);
        return listSinhVien.stream()
                .filter(s->s.getMa().equalsIgnoreCase(mssv))
                .findFirst() // lay ra gia tri cua phan tu o vi tri dau tien
                .orElse(null);
    }

    public void addSinhVien(SinhVien sv){
        listSinhVien.add(sv);
    }
}
