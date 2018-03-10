package com.julien.climbers.controllers;

import com.julien.climbers.entities.Region;
import com.julien.climbers.entities.Topo;
import com.julien.climbers.service.RegionService;
import com.julien.climbers.service.TopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ToposController {

    @Autowired
    private TopoService topoService;
    @Autowired
    private RegionService regionService;

  // @RequestMapping("/entities/{id}")
  // public Topo getTopo(@PathVariable String id){
  //     return topoService.getTopo(id);
  // }
    @RequestMapping("/topos/{id}")
    public String getTopo(@PathVariable String id, Model model){
        int t = Integer.parseInt(id);
        Topo topo = topoService.getTopo(t);

        model.addAttribute("title", topo.getTitle());
        model.addAttribute("author", topo.getAutor());
        model.addAttribute("region", topo.getRegion());

        return "topodescription";
    }

    @RequestMapping(value = "/topos", method = RequestMethod.POST)
    public void addTopo(@RequestParam String author, @RequestParam String title,@RequestParam String region, Model model){
        Topo topo = new Topo();
        topo.setAutor(author);
        topo.setTitle(title);
        topo.setRegion(regionService.getRegionById(Integer.parseInt(region)));
        topoService.addTopo(topo);
        displayTopos(model);
    }

    @RequestMapping(value = "/topos/{id}", method = RequestMethod.PUT)
    public void updateTopo(@PathVariable String id, @RequestBody Topo topo){
        topoService.updateTopo(id, topo);
    }

    /*@RequestMapping(value = "/entities/{id}", method = RequestMethod.DELETE)
    public void deleteTopo(@PathVariable String id){
        topoService.deleteTopo(id);
    }*/

    @RequestMapping("/topos")
    public String displayTopos(Model model){

        List<Topo> topoList = topoService.getTopos();
        model.addAttribute("list", topoList);

        List<Region> regionList = regionService.getRegion();
        model.addAttribute("regions", regionList);

        return "topos";
    }

}
