package com.lpaxxa.sb;

import com.lpaxxa.sb.infra.ExcelGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//class này chính là class AppConfig khi ta chơi với Spring gốc
//nơi chứa các thông tin để Container biết đường đi tìm các @Bean để new, tim các Bean để new
//@SpringBootApplication thay cho, bao gồm luôn bên trong
//@Configuration,
// @ComponentScan( quét các package tìm Bean để new)
// @EnableAutoConfiguration các thành phần hạ tần khác... TOMCAT,MVC, Spring data JPA...
public class SpringbootToGoApplication {

    public static void main(String[] args) {
        //câu lệnh tạo ra container, new sẵn các bean sau lệnh này
       ApplicationContext ctx =  SpringApplication.run(SpringbootToGoApplication.class, args);

        //viết code sau lệnh tạo ra Container, getBean() để lấy Object
        ExcelGenerator excelGenerator =  ctx.getBean("excelGenerator" ,ExcelGenerator.class);
        excelGenerator.generateExcel("chăm học đi em");
    }

    //CODE NẾU CÓ Ở ĐÂY, CHÍNH LÀ NƠI DEV TA TỰ TẠO CÁC BEAN NHƯNG LẠI NHỜ CONTAINER QUẢN LÍ GIÚP
    @Bean
    ExcelGenerator excelGenerator() {
        //tạo ra 1 bean ExcelGenerator, và trả về cho Container quản lí
        //Container sẽ tự động new ra 1 Object ExcelGenerator và quản lí nó
        return new ExcelGenerator();
    }



}
