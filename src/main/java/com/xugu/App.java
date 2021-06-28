package com.xugu;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //流式获取数据源
       Stream<Person> s= Data.getData().stream();
       //Stream.of()
        //转为集合终端操作
       // List<Person> list=  s.collect(Collectors.toList());
        //System.out.println(list);
      //  Set<Person> set=  s.collect(Collectors.toSet());
      //  System.out.println(set);
        //Map<String,Integer> map=  s.collect(Collectors.toMap(Person::getName,Person::getAge));
        //System.out.println(map);
        //最终操作2：reduce
        //相加操作
        /*Stream<Integer> s1=Stream.of(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> t1 =s1.reduce((n1, n2)->n1+n2);
        System.out.println(t1.get());
        */
        //通过对象操作
      //  Optional<Person> p=s.reduce((n1,n2)->new Person().setAge(n1.getAge()+n2.getAge()));
        Person tmp=new Person();
        //Person max=s.max((n1,n2)->n1.getAge()-n2.getAge()).get();
       // Optional<Person> p=s.reduce((n1,n2)->tmp.setAge(n1.getAge()+n2.getAge()));
       //Person max=s.max((n1,n2)->n1.getAge()-n2.getAge()).get();
        //Person min=s.min((n1,n2)->n1.getAge()-n2.getAge()).get();
       // System.out.println(min);

        // Boolean b=s.anyMatch(n1->n1.getAge()<42);
        //System.out.println(b);
        //Boolean b1=s.allMatch(n1->n1.getAge()>40);
        //System.out.println(b1);
        //Boolean b1=s.noneMatch(n1->n1.getAge()>40);
       // System.out.println(b1);
       // long c=s.count();
        //System.out.println(c);

        s.forEach(System.out::println);
    }
}
