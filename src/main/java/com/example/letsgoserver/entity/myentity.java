package com.example.letsgoserver.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class myentity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int year;

}
