package com.julien.climbers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TopoSwappingController {

    @RequestMapping(value = "/toposwapping", method = RequestMethod.GET)
    public String displayForm(){

        return "toposwapping";
    }

    @RequestMapping(value = "/toposwapping", method = RequestMethod.POST)
    public String addTopo(@RequestParam("region") String region, @RequestParam("auteur") String auteur, Model model){

        String message = "Vous avez ajouté un topo de la région : " + region + " écrit par: " + auteur;
        model.addAttribute("message", message);

        return "toposwapping";
    }
}
