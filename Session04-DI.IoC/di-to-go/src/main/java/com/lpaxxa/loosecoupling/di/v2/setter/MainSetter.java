package com.lpaxxa.loosecoupling.di.v2.setter;

public class MainSetter {
    public static void main(String[] args) {
        EmailSender sender = new EmailSender();
        UserService userService = new UserService();

        userService.setEmailSender(sender);// có hàm set trc khi gọi hàm registerAccount()
        userService.registerAccount();// có khai báo biến nhưng chưa inject vào
    }
}
