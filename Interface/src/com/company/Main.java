package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(991558438);
        timsPhone.powerOn();
        timsPhone.callPhone(991558438);
        timsPhone.answer();

        timsPhone = new MobilePhone(2356564);
        timsPhone.powerOn();
        timsPhone.callPhone(2356564);
        timsPhone.answer();
    }
}