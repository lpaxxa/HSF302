package com.lpaxxa.spring.ioc.v3di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.generateFile("1453.pdf");
        //IoC new giúp PDF, new giúp service, ta chỉ việc dùng
    }
}
