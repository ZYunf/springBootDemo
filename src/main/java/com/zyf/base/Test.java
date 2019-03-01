package com.zyf.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: Yunf
 * @Date: 2019/1/18 17:38
 * @ProjectName: springBootDemo
 * @PackageName: java.base
 */
public class Test {
    public static Car initByDefaultConst() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        //①通过类加载器获取Car对象
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazz = classLoader.loadClass("com.zyf.base.Car");
        /*
         * 也可以通过Class.forName();来获取Car对象
         */
        //②获取类的默认构造器对象并通过他实例化Car
        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) cons.newInstance();

        //③通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "法拉利");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "红色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 250);
        return car;
    }

    public static Car getCar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //得到Car类
        Class<?> aClass = Class.forName("com.zyf.base.Car");
        Constructor cons = aClass.getDeclaredConstructor((Class[]) null);
        Car car = (Car) cons.newInstance();

        Method setBrand = aClass.getMethod("setBrand", String.class);
        setBrand.invoke(car,"法拉利");
        return car;


    }

    public static void main(String[] args)
            throws ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException {

        Car car = initByDefaultConst();
        car.introduce();

        Car car1=getCar();
        car1.introduce();
    }

}
