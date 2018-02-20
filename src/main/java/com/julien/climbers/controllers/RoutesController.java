package com.julien.climbers.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoutesController {

    @RequestMapping(value = "/routes", method = RequestMethod.GET)
    public String search(@RequestParam(value = "name", required = false, defaultValue = "Julien") String name, Model model){

        model.addAttribute("name", name);


    return "routes";
    }
}
