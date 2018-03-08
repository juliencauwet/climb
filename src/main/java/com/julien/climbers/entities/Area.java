package com.julien.climbers.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Area {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @ManyToOne
    private Site site;

    @OneToMany(mappedBy = "area")
    private Set<Route> routes = new HashSet<>();

    public Area(String name, Site site) {
        this.name = name;
        this.site = site;
    }

    private Area(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }
}
