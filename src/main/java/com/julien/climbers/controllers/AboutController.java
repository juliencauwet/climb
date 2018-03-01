package com.julien.climbers.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AboutController {
    public String about(){
        return "about";
    }
}
