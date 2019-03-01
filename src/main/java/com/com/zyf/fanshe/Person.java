package com.com.zyf.fanshe;

/**
 * @Author: Yunf
 * @Date: 2019/1/20 23:08
 * @ProjectName: springBootDemo
 * @PackageName: com.com.zyf.fanshe
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {

    }
    public void show(){
        System.out.println("show方法已经运行");
    }

    public void method1(String str){
        System.out.println("person method" + str);
    }
    private void funtion(){
        System.out.println("person private funchtion run...");
    }
}
