package com.lpaxxa.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCoffeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCoffeeApplication.class, args);
	}
//@Bean ở đây để chủ động new riêng những dêpndency, new xong gửi cho IoC Container quản lí giúp
	// Scan ngay những class trong com.lpaxxa.coffee.coffee package và các package con của nó
	// có chứa @Component, @Service, @Repository, @Controller, @RestController
}
