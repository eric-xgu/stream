package com.xugu.adapter;

public class Computer {
    private Usb usb1; //电脑上的usb接口
    public void connect(Usb usbdev){
        this.usb1=usbdev;
    }

    public void showinfo(){
        System.out.println(this.usb1.getinfo());
    }

}
