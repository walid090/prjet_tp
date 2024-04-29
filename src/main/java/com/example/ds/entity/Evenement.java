package com.example.ds.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Getter
@Setter
public class Evenement {
    @Id
    @GeneratedValue
    private int id;
    private String description;
    private Date datedebut;
    private Date datefin;
    private float cout;

    @ManyToMany(mappedBy = "evenements")
    private List<Participant> participants;


    @OneToMany(mappedBy = "evenement")
    private List<Logistique> logistiques;


    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;
}
