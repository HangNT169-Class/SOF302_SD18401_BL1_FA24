package com.poly.hangnt169.B2_OverviewJavaWeb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginRequest {
    // liet ke tat ca yeu cau tu phia nguoi dung
    private String username;

    private String password;

}
