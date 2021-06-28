package com.xugu;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Processor {
    public static void  main(String[] args){
        //fileter,过滤器
        //Stream<Person> s=Data.getData().stream();
       // s.filter(ele->ele.getAge()>=40).forEach(System.out::println);
       // s.distinct().forEach(System.out::println);
        //排序流中元素实现public class Person implements Comparable<Person> 和compareTo方法
       // s.sorted().forEach(System.out::println);
        //有参排序
        //s.sorted((ele1,ele2)->ele1.getAge()-ele2.getAge()).forEach(System.out::println);
        //s.limit(3).forEach(System.out::println);
        //s.skip(3).limit(2).forEach(System.out::println);
       // s.map(ele->ele.getAge()>42?ele.getName():null).forEach(System.out::println);
        /*
        * 1、筛选所有及格的学生
        * 2、所有及格学生的姓名
        * 3、前3名学生的信息
        * 4、3~10名的成绩
        * 5、所有不及格的学生成绩
        * 6、按学生成绩输出学生
        * 7、统计学生的总分
        * */
       // s.filter(ele->ele.getScore()>=60).forEach(System.out::println);
        // s.filter(ele->ele.getScore()>=60).map(ele->ele.getName()).forEach(System.out::println);
        //Data.getData().stream().parallel();
       // Data.getData().parallelStream();
        //long类型流
        //LongStream.rangeClosed(0L,10L).forEach(System.out::println);
      /*  Long start=System.currentTimeMillis();
        LongStream.rangeClosed(0L,10L).reduce(Long::sum);
        Long end=System.currentTimeMillis();
        System.out.println(end-start);

        Long start=System.currentTimeMillis();
        LongStream.rangeClosed(0L,100000L).parallel().reduce(Long::sum);
        Long end=System.currentTimeMillis();
        System.out.println(end-start);
        */
      //findfirst与finany(串行流等于findfirst，并行最先抢到cpu的线程，块中的第一个数据)
       /* System.out.println(s.findFirst());
        System.out.println(Data.getData().parallelStream().findFirst());
        System.out.println(Data.getData().stream().findAny());
        System.out.println(Data.getData().parallelStream().findAny());
    */
 /*      String str[]={"hello","world"};
       //获取list-> h,e,l,l,o,w,o,r,l,d
        System.out.println(Arrays.stream(str).map(ele->ele.split("")).collect(Collectors.toList()));
        Arrays.stream(str).map(ele->ele.split("")).forEach(ele->System.out.println(ele.length));
        System.out.println(Arrays.stream(str).map(ele->ele.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
   */
        System.out.println(Data.getData().stream().collect(Collectors.maxBy((ele1, ele2) -> ele1.getScore() - ele2.getScore())));
        System.out.println(Data.getData().stream().collect(Collectors.minBy((ele1,ele2)->ele1.getScore()-ele2.getScore())));
        //joining:将流中的元素以字符串拼接
        /*
        System.out.println(Data.getData().stream().map(Person::getName).collect(Collectors.joining()));
        System.out.println(Data.getData().stream().map(Person::getName).collect(Collectors.joining(",")));
        System.out.println(Data.getData().stream().map(Person::getName).collect(Collectors.joining(",","{","}")));
*/
        //sumingint,averagingdouble
        System.out.println(Data.getData().stream().collect(Collectors.summingInt(Person::getScore)));
        System.out.println(Data.getData().stream().collect(Collectors.averagingInt(Person::getScore)));
        //summarizingInt:获取数据的描述信息
       IntSummaryStatistics is=Data.getData().stream().collect(Collectors.summarizingInt(Person::getScore));
       System.out.println(is.getAverage());
       System.out.println(is.getMin());
       System.out.println(is.getMax());

    }
}
