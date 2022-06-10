package com.tsi.kelan.SakilaSpringProject.entities;

import javax.persistence.*;
import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name="actor")
public class Actor {

    //attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int actor_id;
    private String first_name;
    private String last_name;


    //constructors


    public Actor(int actor_id, String first_name, String last_name) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Actor(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public Actor(){}

    //methods

    @Override
    public String toString() {
        return "Actor{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
