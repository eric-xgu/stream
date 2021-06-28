package com.xugu;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Person> getData(){
        ArrayList<Person> list=new ArrayList<Person>();
        list.add(new Person("zs","123456",41,67));
        list.add(new Person("ls","123456",42,60));
        list.add(new Person("wmz","123456",43,32));
        list.add(new Person("wmz","123456",43,90));
        list.add(new Person("jack","123456",43,77));
        list.add(new Person("lg","123456",45,88));
        return  list;
    }
}
