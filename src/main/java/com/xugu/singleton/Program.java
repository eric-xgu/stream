package com.xugu.singleton;

public class Program {
    User us=User.getUser();
}

class User{
    //1、私有构造方法
    private User(){
    }

    //private static User us=new User();;
    /*
    static{
        us=new User()
    }
     */
    private static User us=new User();
    //2、外部调用方法
    public static User getUser(){
        return us;
    }

}
