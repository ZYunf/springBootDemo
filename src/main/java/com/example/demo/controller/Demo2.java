package com.example.demo.controller;

/**
 * @Author: Yunf
 * @Date: 2019/1/18 15:27
 * @ProjectName: springBootDemo
 * @PackageName: com.example.demo.controller
 */
public class Demo2 {

    protected String getVal(String val) {
        if (val == null || val.trim().equals("")) {
            return null;
        } else {
            return val.trim();
        }
    }
}
