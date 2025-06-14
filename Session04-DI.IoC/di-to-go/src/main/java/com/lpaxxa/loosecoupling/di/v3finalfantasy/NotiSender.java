package com.lpaxxa.loosecoupling.di.v3finalfantasy;

public interface NotiSender {
    //INTERFACE NHƯ CÁI CLB, LÀ 1 DẠNG CLASS CHA
    //CHỈ CHỨA HÀM ABSSTRACT KO CODE ( SAU NÀY CÓ HÀM CÓ CODE NHƯNG....)
    //CLB ĐƯA RA NỘI QUY YÊU CẦU ANH EM MEMBER TUÂN THỦ
    //INTERFACE ĐƯA RA HÀKO CODE YÊU CẦU ANH EM IMPLEMENT
    // CLB Shisha có nội quy smoke() hút bằng ống hút
    //                  đem Con mèo, 555, ăn đòn
    //NotiSender là clb chuyên đi gửi tin gì đó, ko quan tâm hình thức gửi, miễn là gửi

    public void sendNoti();

    //vậy thành viên bao gồm: smssender, emailsender, whatsapp sender
    // chúng mày phải có code tương ứng, implement
    //TA THỐNG NHẤT TÊN HÀM CHO CÁC CLASS THÀNH VIÊN !!!!
    // CHỈ CẦN .sendNoti() tùy mỗi đứa sẽ chạy khác nhau -> ĐA HÌNH
    //notiSender sẽ là dependency thay vì 3 đứa kia
    //Chơi với NotiSender, là chơi với nhiều hình thức gởi trong tương lai
    
}
