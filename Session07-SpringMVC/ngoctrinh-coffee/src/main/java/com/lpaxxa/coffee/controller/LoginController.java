package com.lpaxxa.coffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    // việc 1: load trang trả về, GET truyền thống
//    @GetMapping("/")
    @GetMapping({"/", "/login"}) // khi vào trang chủ hoặc /login thì sẽ load trang login.html
    public String showLoginPage() { // ko cần model, chỉ mới Get
        return "login"; // tự động thymeleaf sẽ ghép thêm .html // trả về trang .html
    }
    @PostMapping("/doLogin")
    //hàm POST nhận 2 value từ dưới Page gửi lên ( Name Attribute)
    public String doLogin(@RequestParam("email") String email, @RequestParam("pass") String password, Model model, RedirectAttributes redirect) {
        //CẤT EMAIL NHẬN DC VÀO CÁI HỘP, GỬI CHO TRANG
        model.addAttribute("sentEmail", email);
        // HỘP, TỦ GỬI ĐỒ Ở TTTM
        //                  SIU THỊ          KEY       GIỎ, TÚI, ĐỒ MUỐN GỬI
       // return "products";       // ko đổi url


        // QUAN TRỌNG NÈ, CHỈ XÀI CHO REDIRECT, ĐÍNH KÈM THÔNG TIN CHO HÔP
        // MODEL CỦA BÊN GỌI /Products
        redirect.addFlashAttribute("sentEmail", email);//flash - f5 mất attribute
        //ẨN HIỆN LINK UPDATE/DELETE BÊN TRANG PRODUCT
        //hardcoded trước, phần này lấy từ DB mới đúng
        if(email.equalsIgnoreCase("admin")){
            redirect.addFlashAttribute("role", 1);// 1 là admin
            //cất số 1 vào thùng, gửi sang trang products để ẩn/ hiện NEW|UPDATE|DELETE
            //MUỐN LẤY SỐ 1, DÙNG KEY ROLE
                  }
        else {
            redirect.addFlashAttribute("role", 2);//, 2 là user thường
        }
        return "redirect:/products"; // sau khi login thành công, sẽ chuyển hướng đến trang products
        //GỌI TRANG KO THÔNG QUA CONTROLELR
        // ĐỔI URL
        // CHÍNH TỨC PRODUCT CONTROLLER XUẤT HIỆN
    // việc 2: xử lí FORM GỬI DATA  LÊN, POST
}}
