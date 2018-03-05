package com.julien.climbers.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Topo {

    @Id
    @GeneratedValue
    private Integer id;
    private String author;
    private String title;

    @ManyToOne
    private Region region;

    public Topo(Integer id, String author, String title, Region region) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.region = region;
    }

    public Topo() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutor() {
        return author;
    }

    public void setAutor(String autor) {
        this.author = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }


}
