package com.xugu;

import java.util.Objects;
import java.util.Random;

public class Person implements Comparable<Person>{
    private  String name;
    private  String telphone;
    private  int age;
    private  int score;
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getTelphone() {
        return telphone;
    }

    public Person setTelphone(String telphone) {
        this.telphone = telphone;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }
    public Person() {}
    public Person(String name, String telphone, int age,int score) {
        this.name = name;
        this.telphone = telphone;
        this.age = age;
        this.score=score;
    }

    public String toString(){
        return this.name+":"+this.telphone+":"+this.age+":"+this.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,telphone,age);
    }

    @Override
    public boolean equals(Object o) {
        if(this==o)return true;
        if(o==null||getClass()!=o.getClass()) return  false;
        Person p=(Person)o;
        return p.name==name && p.age==age && p.telphone==telphone && Objects.equals(age,p.age);
    }


    @Override
    public int compareTo(Person o) {
        return this.getAge()-o.getAge();
    }
}
