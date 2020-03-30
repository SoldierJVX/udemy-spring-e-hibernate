package com.study.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="review")
@Data
public class Review {

    // define fields

    // define constructors

    // defie getters/setters

    // define toString

    // annotate field

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "comment")
    private  String comment;

    public Review(){

    }

    public Review(String comment){
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                '}';
    }
}
