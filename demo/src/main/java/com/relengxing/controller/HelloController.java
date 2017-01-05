package com.relengxing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by relengxing on 2017/1/5.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
}
