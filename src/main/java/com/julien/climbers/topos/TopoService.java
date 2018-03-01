package com.julien.climbers.topos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopoService {

    @Autowired
    private TopoRepository topoRepository;

    /* private List<Topo> topos = new ArrayList<>(Arrays.asList(
               new Topo( "1","Verlaine","Le grand froid du Nord","nord"),
               new Topo( "2","Rimbaud","La côte Atlantique","ouest"),
               new Topo( "3","Hugo","Le Massif Central","centre"),
               new Topo( "4","Zola","la chaleur du sud","sud"),
               new Topo( "5","Maupassant","Les montagnes de l'est","est")
                       ));
    */

    public List<Topo> getTopos(){
          System.out.println("entrée dans gettopo1");
          List<Topo> topos = new ArrayList<>();
          topoRepository.findAll().forEach(topos::add);
          System.out.println("entrée dans gettopo2");
        return topos;
    }

    public Topo getTopo(String id){

        return topoRepository.findOne(id);
    }

    public void addTopo(Topo topo) {
        topoRepository.save(topo);
    }

    public void updateTopo(String id, Topo topo) {
        topoRepository.save(topo);
    }

}
