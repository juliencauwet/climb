package com.julien.climbers.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "region")
    private Set<Topo> topo = new HashSet<>();

    @OneToMany(mappedBy = "region")
    private Set<Site> sites = new HashSet<>();


    public Region(String name) {
        this.name = name;
        this.getClass().getMethods();

    }

    private Region(){

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
}
