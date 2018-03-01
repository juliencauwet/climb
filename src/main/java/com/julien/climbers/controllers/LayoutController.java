package com.julien.climbers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {

    @RequestMapping("/layout")
    public String layout(){
        return "layout";
    }
}
