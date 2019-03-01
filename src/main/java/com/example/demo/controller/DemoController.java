package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Yunf
 * @Date: 2018/12/23 17:40
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "返回值";
    }
}
