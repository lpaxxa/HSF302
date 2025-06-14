package com.lpaxxa.tightcoupling;

public class UserService {
    //UserService gọi repos để CRUD ng dùng trong table: show ds user, đăng kí member, xóa, update
    //XÓA: XÓA CỨNG ( XÓA THẬT TRONG TABLE, DELETE FROM...)
    //     XÓA MỀM ( KO XÓA THẬT, ĐỔI STATUS, ACTIVE = FALSE)!!!! PHẢI NHỚ LÀM CÁ NÀY Ở APP THẬT !!! - ĐỂ THỐNG KÊ NẾU CẦN, VD: THỐNG KÊ TỈ LỆ SV BỎ HỌC, THỐNG KÊ TREND
    // DATA MINING
    // NGÒAI RA CLASSS SERVICE CÒN LÀM VIỆC
    // KHI KHÁCH HÀNG ĐĂNG KÍ TÀI KHOẢN MỚI, NGOÀI VIỆC INSERT TABLE USER ( QUA REPO)
    // TA CẦN GỬI MAIL CONFIRM, HOẶC SMS CONFIRM..., HOẶC NOTI QUA FIREBASE...
    // KO DÍNH ĐẾN  TABLE
    // HÀM GỬI MAIL, HÀM GỬI SMS ĐỂ Ở ĐÂU
    // NGUYÊN LÝ SRP - SINGLE RESPONSIBILITY PRINCIPLE - MỖI CLASS CHỈ NÊN LAMF VIỆC MÌNH GIỎI
    // CHỈ CÓ 1 CHỖ CẦN SỬA NEU CLASS CẦN PHẢI SỬA CODE

    //ĐỂ CODE GỬI MAIL, SMS Ở ĐÂY, CÓ 2 CHỖ ĐỂ SỬA - KHÁC NHAU Ý NGHĨA CODE
    // VI PHẠM S
    // TRÁNH VI PHẠM, TACH CLASS !!!!!!
    private EmailSender emailSender = new EmailSender(); // service phụ thuộc email sender, email sender là dependency, ko có bạn tớ Service thua cho việc gửi mail
    //new ngay đây - gọi là direct control, kiểm soát trực tiếp object dependency
    // ta gắn chặt với thằng này rồi, khi ta new Service, lập tức có thằng sender này luôn !!!!! tight-coupling

    // ỔN CHO ĐẾN KHI TA MỞ RỘNG BÀI TOÁN...

    //tạm thời bỏ qua info đưa vào từ GUI: email, password
    public void registerUser() {
       // đoạn này mình sẽ gọ repo để persist() 1 dòng Account/User vào table
        //...

        //Xong, gửi mail confirm hoặc nhắn SMS
        emailSender.sendEmail();
    }




}
