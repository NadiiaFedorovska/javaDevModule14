package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "planets")
@Data
public class Planet {
    @Id
    @Column(name = "planet_id")
    private String planetId;
    @Column(name = "planet_name")
    private String planetName;

    @OneToMany(mappedBy="fromPlanet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ticket> ticketsFromPlanet;

    @OneToMany(mappedBy="toPlanet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ticket> ticketsToPlanet;
}
