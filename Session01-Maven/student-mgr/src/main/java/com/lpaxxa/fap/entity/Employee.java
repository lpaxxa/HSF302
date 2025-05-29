package com.lpaxxa.fap.entity;


import lombok.*;

@Getter //có 4 cái hàm get rùi
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String name;
    private int yob;
    private double salary;

    //đoạn code boiler-plate bao gồm: cst rỗng, cst full tham số, getter, setter, toString
    //giang hồ có cách ko cần viết đoạn code này mà vẫn có để dùng
    //C# CHỖ NÀY HAY, GỌI LÀ KĨ THUẬT PROPERTY CHÍNH HÃNG
    // JAVA: KO CÓ KĨ THUẬT NÀY CHÍNH HÃNG, MÀ LÀ HÀNG ĐỘ BÊN THỨ 3
    //CÓ BỘ THƯ VIỆN GIÚP GENERATE CÁI ĐÁM BOILER-PLATE


}
