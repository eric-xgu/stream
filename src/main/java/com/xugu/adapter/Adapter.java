package com.xugu.adapter;

public class Adapter implements Usb {
    private  Typec tc;
    public  Adapter(Typec tc){
        this.tc=tc;
    }
    @Override
    public String getinfo() {
        return null;
    }

}
