package com.julien.climbers.controllers;


import com.julien.climbers.entities.Region;
import com.julien.climbers.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RoutesController {

    @Autowired
    private RegionService regionService;

    @RequestMapping(value = "/routes", method = RequestMethod.GET)
    public String routes(@RequestParam(value = "name", required = false, defaultValue = "Julien") String name, Model model){

       List<Region> regionsList = regionService.getRegion();
      model.addAttribute("reglist", regionsList);
      model.addAttribute("name", name);


    return "routes";
    }


}
