package com.julien.climbers.controllers;

import com.julien.climbers.topos.Topo;
import com.julien.climbers.topos.TopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.julien.climbers.ClimbersApplication.var;

@Controller
public class ToposController {

    @Autowired
    private TopoService topoService;

    @RequestMapping("/topos/{id}")
    public Topo getTopo(@PathVariable String id){
        return topoService.getTopo(id);
    }

    @RequestMapping(value = "/topos", method = RequestMethod.POST)
    public void addTopo(@RequestParam String author, @RequestParam String title,@RequestParam String region, Model model){
        Topo topo = new Topo();
        topo.setAutor(author);
        topo.setTitle(title);
        topo.setRegion(region);
        topoService.addTopo(topo);
        displayTopos(model);
    }

    @RequestMapping(value = "/topos/{id}", method = RequestMethod.PUT)
    public void updateTopo(@PathVariable String id, @RequestBody Topo topo){
        topoService.updateTopo(id, topo);
    }

    /*@RequestMapping(value = "/topos/{id}", method = RequestMethod.DELETE)
    public void deleteTopo(@PathVariable String id){
        topoService.deleteTopo(id);
    }*/

    @RequestMapping("/topos")
    public String displayTopos(Model model){
        var++;
        System.out.println("var:" + var);
        List<Topo> topoList = topoService.getTopos();
        model.addAttribute("list", topoList);
        return "topos";
    }

}
