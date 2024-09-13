package com.poly.hangnt169.B2_OverviewJavaWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// Trong Spring Boot Muon nhan class la 1 bean => Bat buoc phai duoc danh dau bang cac annotaion
public class LoginController {
    /**
     * Spring Boot se nhan tat ca cac class trong sau trong com (affiact)
     * duoc danh dau boi cac annotation @Controller, @RestController, @Component, @Service...
     * la bean.
     * Tang controller la tang trao doi giua client (FE - JSP/HTML...) VOI server (code Java - logic)
     * trao doi thong qua phuong thuc http
     * Co 4 phuong thuc HTTP co ban:
     *  + GET: Hien thi/ Lay
     *  + POST : Add (CREATE) : dung de add
     *  + PUT : UPDATE : dung de update
     *  + DELETE : xoa
     *  => TUY NHIEN VOI JAVA 4 & JAVA 5 : 2 HTTP METHOD: GET & POST
     *    + GET: DUNG DE HIEN THI/ LAY
     *    + POST: XU LY
     *  CHU Y: TRONG TANG CONTROLLER : @CONTROLLER LUON LUON TRA VE STRING (RETURN RA 1 VIEW)
     */
    @GetMapping("/login") // the hien day la method get
    public String hienThiGiaoDienLogin(Model m){
        // Truyen gia tri tu controller => jsp
        // J4: request.setAttribute()
        // J5: Model => addAttribute
        String mess = " SD18401";
        m.addAttribute("a1",mess);
        return "buoi1";
    }

    // Yeu cau tu phia nguoi dung => request
    // Du lieu nhan lai mong muon => response
    // convention: 3
    @PostMapping("/ket-qua")
    public String hienThiKetQua(
            LoginRequest request, Model model
    ){
        // Lay dữ lieu tu jsp -> controller
        // J4: getParameter
        // J5: @RequestParam
        model.addAttribute("a1",request.getUsername());
        model.addAttribute("a2",request.getPassword());
        return "ket-qua-login";
    }
    // Dang ky => Hien thi toan tt vua chon len (dang ky)
}
