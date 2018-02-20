package com.julien.climbers.topos;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topo {

    @Id
    private String id;
    private String author;
    private String title;
    private String region;

    public Topo(String id, String author, String title, String region) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.region = region;
    }

    public Topo() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


}