package com.julien.climbers.service;

import com.julien.climbers.entities.Route;
import com.julien.climbers.entities.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public List<Route> getAllRoutes(){
        List <Route> routes = new ArrayList<>();
        routeRepository.findAll().forEach(routes::add);

        return routes;
    }

}
