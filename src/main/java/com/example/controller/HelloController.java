package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Developer on 2016/9/14.
 */
@Controller
public class HelloController {
    @RequestMapping(value="/index")
    public String goToHelloPage() {
        return "index";
    }
}