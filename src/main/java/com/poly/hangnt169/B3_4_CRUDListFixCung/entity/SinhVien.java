package com.poly.hangnt169.B3_4_CRUDListFixCung.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SinhVien {

    // Validate o trong doi tuong ma cac ban muon add
    // Not Empty & Not Blank khac gi nhau
    @NotEmpty(message = "Ma khong duoc trong")
    @Size(min = 5) // Nhap toi thieu bao nhieu chu cai o day
    private String ma;

    // Check gia tri cua cot  dung dinh dang theo mong muon
//    @Pattern(regexp = "vut doan regex vao day")
    private String ten;

    private String diaChi;

    @NonNull
    @Min(value = 10) // gia tri toi thieu phai nhau
    //....
    private Integer tuoi;

    private Boolean gioiTinh;

}
