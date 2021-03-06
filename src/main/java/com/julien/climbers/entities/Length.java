package com.julien.climbers.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Length {

    @Id
    @GeneratedValue
    private Integer id;
    private  String name;
    private int DRating;
    private char CRating;

    @ManyToOne
    private Route route;

    public Length(String name, int DRating, char CRating, Route route) {
        this.name = name;
        this.DRating = DRating;
        this.CRating = CRating;
        this.route = route;
    }

    private Length() {

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

    public int getDRating() {
        return DRating;
    }

    public void setDRating(int DRating) {
        this.DRating = DRating;
    }

    public char getCRating() {
        return CRating;
    }

    public void setCRating(char CRating) {
        this.CRating = CRating;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
