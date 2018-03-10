package com.julien.climbers.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Usor {

    @Id
    @GeneratedValue
    private Integer id;
    private String pseudo;
    private String email;
    private String password;

    @OneToMany(mappedBy = "usor")
    private Set<Comment> comments = new HashSet<>();

    @OneToMany(mappedBy = "usor")
    private Set<Topo> topos = new HashSet<>();

    public Usor(Integer id, String pseudo, String email, String password, Set<Comment> comments, Set<Topo> topos) {
        this.id = id;
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.comments = comments;
        this.topos = topos;
    }

    private Usor(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Topo> getTopos() {
        return topos;
    }

    public void setTopos(Set<Topo> topos) {
        this.topos = topos;
    }
}