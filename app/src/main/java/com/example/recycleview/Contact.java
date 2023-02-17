package com.example.recycleview;

public class Contact {
    private String c_fullName;
    private String c_phoneNumber;
    private int c_Image;

    public Contact(String c_fullName, String c_phoneNumber, int c_Image) {
        this.c_fullName = c_fullName;
        this.c_phoneNumber = c_phoneNumber;
        this.c_Image = c_Image;
    }

    public String getC_fullName() {
        return c_fullName;
    }

    public String getC_phoneNumber() {
        return c_phoneNumber;
    }

    public int getC_Image() {
        return c_Image;
    }
}
