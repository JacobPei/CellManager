package com.dream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jacob on 2018/4/10.
 */
@Controller
@RequestMapping("/home")
public class FirstController {

    @RequestMapping("/first.form")
    public String first() {
        return "index";
    }
}
