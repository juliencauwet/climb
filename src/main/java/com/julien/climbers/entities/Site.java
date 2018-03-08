package com.julien.climbers.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Site {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "site")
    private Set<Area> areas = new HashSet<>();

    @ManyToOne
    private Region region;

    public Site(String name) {
        this.name = name;
    }

    private Site() {
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
