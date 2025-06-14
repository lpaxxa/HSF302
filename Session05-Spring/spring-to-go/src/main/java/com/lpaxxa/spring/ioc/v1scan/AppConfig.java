package com.lpaxxa.spring.ioc.v1scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lpaxxa.spring.ioc.v1scan") // chỉ định package cần scan
//VÀO TROG PACKAGE ĐAN CHỈ Ở TRÊN, QUÉT TẤT CẢ CLASS NÀO CÓ
// @Component, @Service, @Repository, NEW CLASS ĐÓ NHAAA!!1
public class AppConfig {
    // CLASS NÀY ĐỂ ĐÁNH DẤU THUI, KO CẦN CODE GÌ CẢ
}
