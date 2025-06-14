package com.lpaxxa.spring.ioc.v2bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan  ko thèm Scan package để đi tiimf
public class AppConfig {
    //CHỦ ĐỘNG TẠO BEAN, VÀ NHỜ SPRING BOOT GIỮ GIÙM
    @Bean                           // tên hàm lúc này ko theo chuẩn Verb + object
                                    // mà khai báo như là biến
    public PdfGenerator xGen() {
        return new PdfGenerator();
    }// new và trả về 1 obj như truyền thống nhưng nhờ spring giữ giúp
}


// NHỮNG CÁCH ĐỂ TẠO OBJ
//1. TỰ KHAI BÁO BIẾN TỰ NEW -> NO ioc VỪA HỌC
//2. NHỜ NEW GIÙM QUA @ VÀ SCAN, VÀ IOC GIỮ GIÚP
//3. TA CHỦ ĐỘNG NEW NHƯNG NHỜ IOC GIỮ GIÚP
//4. NHỜ NEW GIÙM QUA KHAI BÁO BIẾN TRONG FILE XML -> CÁH CŨ, LEGACY SYSTEM