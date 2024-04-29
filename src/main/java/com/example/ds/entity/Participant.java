package com.example.ds.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Participant {
    @Id
    @GeneratedValue
    private int idpart;
    private String nom;
    private String prenom;

    @ManyToMany
    @JoinTable(
            name = "participant_evenement",
            joinColumns = @JoinColumn(name = "participant_id"),
            inverseJoinColumns = @JoinColumn(name = "evenement_id")
    )
    private List<Evenement> evenements;

}
