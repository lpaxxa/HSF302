package com.lpaxxa.coffee.controller;

import com.lpaxxa.coffee.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

//phụ trách url có dính đên product!!!! Nó là bean @Controller ( đặc chế dành riêng cho url)
@Controller
//@RequestMapping khi nhiều url có cùng đoạn đầu url giống nhau
//                      nhân tử chung url để ở đây ví dụ
//products
//products/{id}
//products/add .... @RequestMapping("/products"))
public class ProductController {
    //controller sau khi nhân url sẽ xử lí gì đó, và phải trả về trang, json

    @GetMapping("/products/new/") // url có thể thay đổi, giống nhau đoạn đầu
    public String create(Model model) {
        //câu lệnh cực kì quan trọng
        model.addAttribute("selectedId", 0);
        model.addAttribute("selectedProduct", new Product());


   return "product-form";
    }
    @PostMapping("/products/save")
    public String save(@RequestParam("id") String id,@RequestParam("name") String name, @RequestParam("price") Double price, RedirectAttributes redirectAttributes) {
        //todo: gọi service/repo để lưu 1 sản phẩm
        //new Product( id, name, price); HỘC MÁU 10 FIELD NẾU TABLE 10 FIELD
        //xong thì gọi products, thông báo thành công, load full trang ( phân trang if any)
        redirectAttributes.addFlashAttribute("selectedName",name);
        // gửi name từ form nhập -> lên đây -> gửi nguọcư về list để kiểm chứng
        redirectAttributes.addFlashAttribute("noti", "Sản phẩm đã được lưu thành công, 9.5 PE!");
        return  "redirect:/products"; // sau khi lưu thành công, sẽ chuyển hướng đến trang products
    }


    //kĩ thuật: @PathVariable("id") là biến động, có thể thay đổi, lấy từ url
    @GetMapping("/products/edit/{id}")// url có thể thay đổi, giống nhau đoạn đầu
    public String edit(@PathVariable("id") String id, Model model) {
        model.addAttribute("selectedId", id);
        // đúng chuẩn: select trong dâtbase rơ có id này, mình hardcoded
        //gửi kèm 1 thùng, trong đó chứa id, vùa click từ products table
        Product product = new Product();



        if(id.equalsIgnoreCase("NTCF1")){
           product = new Product("NTCF1", "Cà phê sữa đá", 20_000);
        }else if(id.equalsIgnoreCase("NTCF2")){
            product = new Product("NTCF2", "Cà phê đen đá", 15_000);
        }else if(id.equalsIgnoreCase("NTCF3")){
            product = new Product("NTCF3", "Cà phê trứng", 30_000);
        }
        model.addAttribute("selectedProduct", product);
        return "product-form"; // do we need redirect ?
    }





    @GetMapping("/products")
    //hàm trả về trang products.html show ra toàn bộ các sản phẩm
    public String list(Model model) {
        //trả về trang index.html
        //model.addAttribute("tham chiếu, tên món đồ","món đồ muốn gửi cho view html")
        //                       KEY                         VALUE
        //             thò tay vao thùng đồ tìm món có KEY
        //                      đưa chìa khóa                   lấy đc món đồ
        //                     hộc tủ số mấy                      balo gì
        //todo: lấy data từ table products
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("NTCF1", "Cà phê sữa đá", 20_000));
        productList.add(new Product("NTCF2", "Cà phê đen đá", 15_000));
        productList.add(new Product("NTCF3", "Cà phê trứng", 30_000));


        //gửi vào thùng để đi cùng VIEW đến thằng Thymeleaf Engine
        model.addAttribute("products", productList);
        model.addAttribute("msg", "Hello Babie");


        return "products"; // tự thymeleaf ghép thêm .html
    }
}
