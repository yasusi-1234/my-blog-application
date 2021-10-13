package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("my_blog")
public class MyBlogController {

    @GetMapping("home")
    public String getHome(Model model){
        return "home/home";
    }

    @GetMapping("create")
    public String getCreate(Model model){
        return "create/create";
    }
}
