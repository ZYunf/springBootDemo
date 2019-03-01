package com.com.zyf.fanshe;

import com.sun.deploy.perf.PerfRollup;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: Yunf
 * @Date: 2019/1/20 22:44
 * @ProjectName: springBootDemo
 * @PackageName: com.com.zyf.fanshe
 */

@SuppressWarnings("all")
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {


        //getClassObj();
        getPrivateMethod();
    }

    private static void getPrivateMethod() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.com.zyf.fanshe.Person");
        try {
            //Method funtion = clazz.getMethod("funtion");
            Method funtion = clazz.getDeclaredMethod("funtion");
            funtion.setAccessible(true);
            Object obj = clazz.newInstance();
            funtion.invoke(obj,null);

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public static void getClassObj() throws ClassNotFoundException {

        Class<?> class2 = Class.forName("com.com.zyf.fanshe.Person");
        Method[] methods = class2.getMethods();//获取公有的方法
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("---------");
        try {
            Method show = class2.getMethod("show",null);
            System.out.println(show);
            show.invoke(class2.newInstance());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("-------------");
        Method[] methods1 = class2.getDeclaredMethods();//得到公有和私有的方法
        for (Method method : methods1) {
            System.out.println(method);
        }
    }
}
