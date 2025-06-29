package com.lpaxxa.sb.repository;

import org.springframework.stereotype.Repository;

@Repository// bản chất là @Component, dùng repo cho rõ layer tầng kiến trúc code
public class UserRepo {
    //SRP - TUI RẤT GIỎI CRUD TABLE QUA SPRING DÂT --- SPRING DATA JPA ---- HIBERNATE --- JDBC --- TABLE THẬT
    //CÁC HÀM CRUD TABLE UẺ, TÊN HÀM ĐẶT NGẮN GỌN GIỐNG LỆNH SQL
    //save() update() delete() remove() findAll() findById() findByName()
    //THÚ VỊ NHẤT LÀ THAY VÌ TỰ VIẾT MẤY HÀM, DÙNG JPQL ( SELECT S FROM Student S WHERE S.name = ?1 )
    //THÌ SPRING DATA JPA TỰ GENERATE HÀM LUÔN, NẾU VIẾT ĐÚNG CÚ PHÁP LẠC ĐÀ, TÊN COLUMN TABLE

    // GIỜ LÀM GẢI/MOCK ĐỂ CHẠY TRƯỚC THẰNG SERVICE
    //đúng chuẩn, phải nhận vào 1 User Entity, hoặc UserDTO( ít field hơn entity)
    public void save() {
        //TODO: HPQL, JPA/HIBERNATE
        System.out.println("CREATE AND INSERT DATA SUCCESSFULLY !!!");
    }
}
