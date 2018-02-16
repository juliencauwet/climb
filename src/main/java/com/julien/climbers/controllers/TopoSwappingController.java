package com.julien.climbers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TopoSwappingController {

    @RequestMapping(value = "/toposwapping", method = RequestMethod.GET)
    public void displayForm(){

    }

    @RequestMapping(value = "/toposwapping", method = RequestMethod.POST)
    public String addTopo(@RequestParam("region") String region, @RequestParam("auteur") String auteur, Model model){

        model.addAttribute("region", region);
        model.addAttribute("auteur", auteur);

        return "toposwapping";
    }
}
