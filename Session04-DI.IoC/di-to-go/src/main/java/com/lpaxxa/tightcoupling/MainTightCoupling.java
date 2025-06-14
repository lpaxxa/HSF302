package com.lpaxxa.tightcoupling;

public class MainTightCoupling {
    public static void main(String[] args) {
        //app swp có phần đăng ký member, GUI làm gì đó có đc info từ user, gọi Service giúp...
        //ĐOẠN NÀY CHÍNH LÀ GUI ----- SERVICE ----- REPO ----...
        UserService userService = new UserService();// có sẵn EmailSender bên trong, có tớ Service, có cậy Sender, chơi Google cơ đấy!!!!
        userService.registerUser();// đăng ký user mới, nhớ gửi mail tới họ nhen
        
        //ĐÂY LÀ STYLE CODE TRUYỀN THỐNG, DIRECT CONTROL, CLASS A CHỦ ĐỘNG NEW DEPENDENCY B
        //ƯU ĐIỂM: CODE DỄ VIẾT, DỄ HIỂU LUÔN
        // NHƯỢC ĐIỂM: CODE KO MỞ RỘNG ĐC ( SCALE UP), SO A PHỤ THUỘC b QUÁ CHẶT, TÍT BÊN TRONG CODE A
        // CHƯA KỂ TUI MUỐN GỬI MAIL = MS, YAHOO!!! CÚ CHẾT ĐẦU TIÊN, SỬA CODE NHIỀU
        // CHƯA KỂ TUI MÚN GỬI SMS => CÚ CHẾT THỨ 2: SỬA CODE NHIỀU ĐÓ
    }

}
