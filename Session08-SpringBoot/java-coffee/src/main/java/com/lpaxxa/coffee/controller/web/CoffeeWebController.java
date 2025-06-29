package com.lpaxxa.coffee.controller.web;

import com.lpaxxa.coffee.entity.Coffee;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Component //1 bean ddc new ự động bởi IoC, chuyên trả lời cái http request dến từ url của trình duyệt user
//có nhiều url khác nhau, thì ứng với nhiều hàm trong class này
//các hàm trả về hrml, cho web lung linh như NT
public class CoffeeWebController {
    @GetMapping("/") // user gox localhost:6969/ nghĩa là nhảy đến hàm này
    public String home(Model model){
        //Model là nơi chứa dữ liệu để trả về cho view
        model.addAttribute("coffee", "Cafe Java tastes like NT");
        model.addAttribute("cup1",new Coffee("Cafe Java","Robusta", 10000));
        return "index"; // trả về tên trang cho trình duyệt
    }
}
