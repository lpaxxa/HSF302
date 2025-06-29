package com.lpaxxa.sb.config;

import com.lpaxxa.sb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component//@Service,@Repository,@Controller,@RestController
//@Order(????) số thứ tự chạy - về làm thử
public class DataInitializer implements CommandLineRunner {
    //dùng dependency Service để tạo table, nó lại đi gọi Repo
    @Autowired
    private UserService userService;//ko new nhen, chờ tiêm vào
    //theo constructor, field,setter

    @Override
    public void run(String... args) throws Exception {
        //hàm này chỉ chạy duy nhất 1 lần khi SB khởi động Container!!!
        // ta sẽ dùng hàm này để thiết lập các giá trị ban đầu cho app
        //dùng chèn data vào database để sẵ dùng, ví dụ account Admin
        //do ta sài codefirst, chưa có table, table đến code!!!
        //BẮT BUỘC PHẢI LÀM KHI LÀM BÀI PE
       // System.out.println("CREATE TABLE, INSERT DATA... SUCCESSFULLY!!!");
        userService.createAccount();


    }

    //muốn SB goi đc hàm của mình khi new thì chắc chắn nó phải biết tên hàm đó, và mình có hàm đó. để chắc ăn, tốt nhất class mình phải tham gia 1 clb/Interface mà SB chỉ định, chắc chắn có hàm
}
