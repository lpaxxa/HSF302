package com.lpaxxa.sb.service;

import com.lpaxxa.sb.infra.ExcelGenerator;
import com.lpaxxa.sb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //SRP
    // CẦN 2 DEPENDENCY: REPO CHẮC KÈO
    //                   EXCEL GENERATOR OPTION, TÙY BÀI TOÁN

    @Autowired // field injection
    private UserRepo userRepo;
    @Autowired
    private ExcelGenerator excelGenerator;// ko new, chờ tiêm chích vào


    //@Autowired  //constructor injection
//    public UserService(ExcelGenerator excelGenerator) {
//        this.excelGenerator = excelGenerator;
//    }

    //hàm CRUD nhờ repo trợ giúp, tên hàm gần User hơn
    public void createAccount(){
        userRepo.save();

    }



}
