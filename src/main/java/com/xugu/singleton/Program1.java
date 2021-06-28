package com.xugu.singleton;

public class Program1 {
    public  static  void main(String [] args){
        for(int i=0;i<100;i++){
            Thread t1=new Thread(()->{
                Teacher.getTecher();
            });
            t1.start();
        }
    }
}

class Teacher{
    private Teacher(){
        System.out.println("小余老师");
    }
    private static Teacher tc;
    //使用锁
    public static synchronized Teacher getTecher(){
        if(tc==null){
            tc=new Teacher();
        }
        return  tc;
    }

}