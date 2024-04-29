package com.example.ds.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Logistique {
    @Id
    @GeneratedValue
    private int id;
    private boolean reserve;
    private float prixUnit;
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;
}
