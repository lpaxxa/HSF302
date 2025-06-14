package com.lpaxxa.loosecoupling.di.v1.constructor;

public class MainConstructor {
    public static void main(String[] args) {
        // new 2 nhát, new EmailSender() để có on=bject fill/tiêm vào Service
        EmailSender emailSender = new EmailSender(); // tạo mới EmailSender
        UserService userService = new UserService(emailSender); // tạo mới UserService và tiêm EmailSender vào
        userService.registerAccount();

        //HÀM MAIN() LÚC NÀY ĐÓNG VAI TẠO VÀ LƯU OBJ DEPENDENCY EmailSender
        //Hàm main() hay class Main đc gọi gọi là: CONTAINER
        //EM LÀ THÙNG CHỨA CÁC OBJ DEPENDENCY ĐỂ EM CHÍCH/TIÊM VÀO OBJ KHÁC

        // VÀ CLASS SERVICE NAY KO CÒN KIỂM SOÁT VIỆC TẠO RA DEPENDENCY NỮA
        // MÀ CHUYỂN QUYỀN KIỂM SOÁT TẠO OBJ DEPENDENCY CHO NG KHÁC ( Ở ĐÂY LÀ MAIN) MÌNH CHUYỂN QUYỀN KIỂM SOÁT GỌI LẠI IoC
        //Inversion of Control - Đảo ngược quyền kiểm soát dependency cho người khác
        //SPRING/SPRING BOOT ĐÓNG VAI IOC CONTAINER, NEW GIÚP MÌNH, TIÊM GIÚP MÌNH
        //NEW QUA CHỮ @COMPONENT, @SERVICE @CONTROLLER, @REPOSITORY
        //CHÍCH QUA @Autowired



    }
}
