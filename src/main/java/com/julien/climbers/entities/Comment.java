package com.julien.climbers.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    private Usor usor;
    @ManyToOne
    private Route route;
    private String text;
    private Date postDate;

    public Comment(Usor usor, Route route, String text, Date postDate) {
        this.usor = usor;
        this.route = route;
        this.text = text;
        this.postDate = postDate;
    }

    private Comment() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usor getUsor() {
        return usor;
    }

    public void setUsor(Usor usor) {
        this.usor = usor;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
}
