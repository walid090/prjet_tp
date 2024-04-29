package com.example.ds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Club {
    @Id
    @GeneratedValue
    private int id;
    private String nom;

    @OneToMany(mappedBy = "club")
    private List<Evenement> evenements;
}
