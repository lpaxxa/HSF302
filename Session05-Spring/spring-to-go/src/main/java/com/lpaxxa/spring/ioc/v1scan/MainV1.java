package com.lpaxxa.spring.ioc.v1scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component // có chữ này là Spring new giúp
//@Service, @Repository okie lun,
// @Component bao 2 thằng này luôn
public class MainV1 {

    public static void main(String[] args) {
        //TẠO RA TRÙM CUỐI QUẢN LÍ CÁC OBJ TRONG RAM -( LÚC NÀY OBJ SẼ GỌI LÀ BEAN),
        //GỌI LÀ APPPLICATIONCONTEXT - IoC Container
        // TRÙM CUỐI SẼ SCAN CÁC PACKAGE LÔI CÔE THẰNG NÀO CÓ @, NEW NÓ, NHẢ VỀ CHO ANH EM MÌNH GET DỂ DÙNG
        //GIỐNG NHƯ KHI CHƠI TABLE, CÓ TRÙM CUỐI LÀ EntityManagerFactory

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //nhờ trùm cuối quản lí các object đã new, lấy giúp object pdfGenerator ra dùng, qua hàm getBean() -> obj lúc này đc gọi là bean
        PdfGenerator pdfGenerator = context.getBean(PdfGenerator.class);
        pdfGenerator.generateFile("1424.pdf");


    }
}
//KO CHỦ ĐỘNG NEW DEPENDENCY THÌ PHẢI CHỈ CHO SPRING BIẾT
// 1.NEW Ở ĐÂU, NEW CLASS NÀO,
// 2.VÀ CHÍCH VÀO CLASS NÀO
