package com.lpaxxa.loosecoupling.di.v3finalfantasy;

public class EmailSender implements NotiSender {

    @Override
    public void sendNoti() {
        //TODO: implement email sending logic here
        System.out.println("(Gmail di via setter()) mail was sent successfully!");
    }
}
