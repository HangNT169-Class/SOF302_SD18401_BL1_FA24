package com.poly.hangnt169.B3_4_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SinhVien {

    private String ma;

    private String ten;

    private String diaChi;

    private Integer tuoi;

    private Boolean gioiTinh;

}
