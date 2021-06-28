package com.xugu.adapter;

public class program {
    public  static  void main(String [] args) {
    Computer c=new Computer();
    Phone p=new Phone();
    c.connect(new Adapter(p));

    }

}
