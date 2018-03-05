package com.julien.climbers.controllers;

import com.julien.climbers.entities.Region;
import com.julien.climbers.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private RegionService regionService;

    @RequestMapping("/")
    public String index(Model model){

        List<Region> regionsList = regionService.getRegion();
        model.addAttribute("list", regionsList);

        return "index";

    }
}
