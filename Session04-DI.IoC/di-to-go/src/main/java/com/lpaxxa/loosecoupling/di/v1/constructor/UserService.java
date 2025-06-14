package com.lpaxxa.loosecoupling.di.v1.constructor;

public class UserService {
    //MÌNH CẦN GỬI MAIL, GỬI CẢ SMS LUÔN, TÙY OPTION NGƯỜI DÙNG ĐĂNG KÍ MEMBER
    private EmailSender sender; // new là o dùng DI
    //đứa khác new, đưa cho tui Service
    //prvate in yob; // hãy tưởng tuọng nó ngag cơ yob, đổ qua constructor
    //constructor tạo tay, or bằng alt+insert

    public UserService(EmailSender sender) {
        this.sender = sender;  // sender ddc new và đưa vào, tiêm vào DI đã hiện hình
    }

    public void registerAccount(){
        //todo: goij code repo xún table
        // su đó gửi mail
        sender.sendEmail();
    }




}
