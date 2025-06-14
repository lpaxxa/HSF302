package com.lpaxxa.loosecoupling.di.v3finalfantasy;

public class WhatsAppSender implements NotiSender{
    @Override
    public void sendNoti() {
        System.out.println("OCP: message was sent via WhatsApp successfully!");
    }
}
