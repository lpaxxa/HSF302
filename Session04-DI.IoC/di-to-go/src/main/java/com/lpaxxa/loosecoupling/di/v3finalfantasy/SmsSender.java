package com.lpaxxa.loosecoupling.di.v3finalfantasy;

public class SmsSender implements NotiSender {
    @Override
    public void sendNoti() {
        //TODO: implement email sending logic here
        System.out.println("V3 final: sms was sent successfully!");
    }
}
