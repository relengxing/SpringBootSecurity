package com.relengxing.controller;

import com.relengxing.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by relengxing on 2017/1/5.
 */

@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('admin','user')")

    public String user(){
        return "user";
    }

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('admin')")
    public String admin(){
        return "admin";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/403",method = RequestMethod.GET)
    public String page403(){
        return "403";
    }
}
