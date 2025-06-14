package com.lpaxxa.spring.ioc.v2bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  // vòa class này xem có bean cần tạo qua Scan hoặc @Bean
     //   PdfGenerator pdfGenerator = context.getBean("xGen",PdfGenerator.class);
        PdfGenerator pdfGenerator = (PdfGenerator) context.getBean("xGen");
        pdfGenerator.generateFile("1441.pdf");// lấy bean từ IOC container
    }
}
//scan dành cho constructor ko tham số
// bean dành cho constructor có tham số