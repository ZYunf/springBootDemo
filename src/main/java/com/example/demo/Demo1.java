package com.example.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Yunf
 * @Date: 2018/12/24 15:16
 */
public class Demo1 {
    public static void main(String[] args) {
        //Map<String, Object> dataMap = getParameter(args);
        String s1="abcd";
        String s2="abcd";
        String s3=new String("abcd");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));//equals只比较值  由于String类重写了object的equeals方法
        System.out.println(s1 == s3);//==比较内存地址

        String a1="a";
        String a2="b";
        String c="ab";
        String d="a"+"b";
        System.out.println((a1 + a2)==(c));
        System.out.println(c == d);

        byte[] arr={98,99,100};
        String ss=new String(arr,0,arr.length);
        System.out.println(ss);
    }

    private static Map<String, Object> getParameter(String[] args){
        //新建map集合，获取到参数直接存储
        Map<String, Object> dateMap = new HashMap<String, Object>();
        if(args != null && args.length > 0){

        }
        return dateMap;
    }
}
