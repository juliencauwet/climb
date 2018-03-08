package com.julien.climbers.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Route {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @ManyToOne
    private Area area;

    @OneToMany(mappedBy = "route")
    private Set<Length> lengths =new HashSet<>();

    public Route(String name, Area area, Set<Length> lengths) {
        this.name = name;
        this.area = area;
        this.lengths = lengths;
    }

    private Route(){

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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Set<Length> getLengths() {
        return lengths;
    }

    public void setLengths(Set<Length> lengths) {
        this.lengths = lengths;
    }
}
