package com.zyf.base;

/**
 * @Author: Yunf
 * @Date: 2019/1/20 23:21
 * @ProjectName: springBootDemo
 * @PackageName: com.zyf.base
 */
public class Demo {

    public static void getMax(int... arg) {
        int num=arg[0];
        for (int i = 0; i < arg.length; i++) {

            if (num<arg[i]){
                num=i;
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        getMax(1,3,4,5,2,-1,100,1000,200,5000,2,3,4,5);
    }
}
