package com.lpaxxa.loosecoupling.di.v2.setter;

public class UserService {
    // tớ cần cậu
    private EmailSender emailSender;
    //KO NEW TRỰC TIẾP
    //KO QUA CONSTRUCTOR
    //CHỈ CÒN CÁCH SETTER, GIỐNG setYob(yob mới)
    //CHÍCH TIÊM QUA SETTER()
    //ALT-INSERT


    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }
    //ỊNECTOR QUA SETTER DỄ BỊ ULL, VÌ KO ÉP BUỘC GỌI SETTER SAU KHI TẠO OBJ
    // CONSTRUCTOR, ÉP PHẢI ĐƯA VÀO MỚI NEW




    //GỬI MAIL BT
    public void registerAccount() {
        //todo: gọi repo
        //gửi mail
        emailSender.sendEmail();
    }
}
