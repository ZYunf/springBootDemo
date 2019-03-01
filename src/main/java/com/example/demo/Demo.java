package com.example.demo;

import com.example.demo.controller.Demo2;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

    public static String getVal(String val) {
        if (val == null || val.trim().equals("")) {
            return null;
        } else {
            return val.trim();
        }
    }

    public static void test(Map map) {
        map.put("2", 2);
        map.remove("1");
    }

    public static void putAllMap(Map listMap, List<Map> list) {
        list.forEach(map -> {
            listMap.putAll(map);
        });
    }

    public static void main(String[] args) {


        Map map = new HashMap();
        map.put("1", 1);
        Map map2 = new HashMap();
        map2.put("2", 2);
        Map map3 = new HashMap();
        map3.put("3", 3);

        List<Map> list = new ArrayList<>();
        list.add(map);
        list.add(map2);
        list.add(map3);

        putAllMap(map2, list);
        System.out.println(map2);


        //for (int i = 0; i < args.length; i++) {
        //    System.out.println(args[i]);
        //}

    }


}
