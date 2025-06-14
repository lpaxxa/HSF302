package com.lpaxxa.loosecoupling.di.v3finalfantasy;


import com.lpaxxa.loosecoupling.di.v3finalfantasy.UserService;

public class MainFinal {
    public static void main(String[] args) {
        // guiwr mail hay sms hay.... tùy bạn
        SmsSender smsSender = new SmsSender(); // IoC
        WhatsAppSender whatsAppSender = new WhatsAppSender();


        //class chính là Service, ko new dependency mà chừo tiêm vào!!!
        UserService userService = new UserService(whatsAppSender); // IoC, tiêm vào constructor
        userService.registerAccount();

        //todo: sửa tí code service để thêm setter cho sender


    }
}
