package com.lpaxxa.loosecoupling.di.v3finalfantasy;

public class UserService {
    private NotiSender notiSender;//ko phụ thuộc vào đứa cụ thẻ, phụ thuộc vào thứ chung chung

    //chích/ tiêm nó vào
    public UserService(NotiSender notiSender) {
        this.notiSender = notiSender; // tiêm vào qua constructor
    }

    public void setNotiSender(NotiSender notiSender) {
        this.notiSender = notiSender;
    }
    //CLASS NÀY LO VIỆC CRUD TABLE UẺ/ACCOUNT QUA REPOSITORY
    //SAU KHI XONG TABLE, CÒN NHU CẦU GỬI CONFIRM!!! QUA EMAIL, SMS
    //VẬY TA CẦN 3 DÊPNDENCY: REPO, EMAIL SMS
    //3 NHÁT NEW LUÔN, HOẶC TIÊM VÀO TỪ BÊN NGOÀI (3 CÁCH: FIELD, CONSTRUCTOR, SETTER)

    ///private UserRepository repo;   // ko new, tieem vaof sau!!!
    // private EmailSender emailSender; // ko new, tiêm vào sau
    //private SmsSender smsSender; // ko new, tiêm vào sau
    //OPEN FOR EXTENSION, CLOSED FOR MODIFICATION
    //SOLID:
    //S - Single Responsibility Principle - MỖI THẰNG GIỎI 1 VIỆC

    //O - Open/Closed Principle - MỞ VỚI VIỆC MỞ RỘNG , ĐÓNG KÍN VỚI CHỈNH SỬA
    //THÊM WHATSAPP, MÀ KO CẦN CHỈNH CODE SERVICE MỚI LÀ NGON
    //VIẾT CODE THÍCH ỨNG VỚI TƯƠNG LAI
    //KO PHỤ THUỘC VÀO CÁI CỤ THỂ MÀ NÊN PHỤ THUỘC VÀO CÁI CHUNG CHUNG
    //INTERFACE
    //TUI BIẾT CLASS NÀY CẦN GỬI 1 NOTI Đ THÔI, GỬI BẰNG GÌ CHƯA TÍNH ( SMS,EMAIL,WHATSAPP, TỪ TỪ...)


    //hàm có thể nhận vào User Entity/Dto từ GUI đưa xuống !!!. bài này đang làm đơn giản
    public void registerAccount(){
        // gửi noti thoai
        notiSender.sendNoti();// chưa có code, chờ runtime new Sms, new Mail

    }



}
