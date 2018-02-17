package com.julien.climbers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam(value = "name",required = false, defaultValue = "Julien") String name, Model model){

        if(name == null )
            name = "world";

        model.addAttribute("name", name);


    return "search";
    }
}
