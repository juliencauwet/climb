package com.julien.climbers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignController {

    @GetMapping("/sign")
    public String sign(){

        return "sign";
    }

    @RequestMapping(value = "/sign", method = RequestMethod.POST, params = "signin")
    public String signin(@RequestParam String email){

        return "sign";
    }

    @RequestMapping(value = "/sign", method = RequestMethod.POST, params = "signup")
    public String signup(){

        return "sign";
    }
}
