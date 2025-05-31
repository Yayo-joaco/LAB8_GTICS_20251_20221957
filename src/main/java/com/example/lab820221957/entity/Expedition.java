package com.example.lab820221957.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "expeditions")
@Getter
@Setter
public class Expedition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private BigInteger id;
    @Column(name = "nombre_mision", nullable = false)
    private String nombreMision;
    @ManyToOne
    @JoinColumn(name = "id")
    private Planet planet;
    @Column(name = "fecha_lanzamiento", nullable = false)
    private LocalDate fechaLanzamiento;
    @Column(name = "estado", nullable = false)
    private String estado;
    @JoinTable(
            name = "expedition_crew",
            joinColumns = @JoinColumn(name = "expedition_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name="crew_member_id", nullable = false)
    )
    @ManyToMany
    private List<CrewMember> crewMember;
    @Column(name = "objetivos")
    private String objetivos;
    @Column(name = "resultados")
    private String resultados;

}
