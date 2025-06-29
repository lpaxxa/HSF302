package com.lpaxxa.coffee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//api, lo trả về json
@RequestMapping("/api/coffees") // gox localhost:6969/api/coffees đến class nayf
//class này có nhiều hàm, hàm qua url thì lại có nhiều cách đến class này
//Get / Post / Put / Delete
public class CoffeeApiController {

    @GetMapping("/cup") // khi gọi đến /cup thì sẽ gọi hàm này
    public Coffee getACup() {
        return new Coffee("JavaCoffee", "Java Coffee", 100.0);
    }
}
