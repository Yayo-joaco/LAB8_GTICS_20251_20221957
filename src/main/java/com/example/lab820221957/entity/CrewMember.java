package com.example.lab820221957.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "crew_members")
@Getter
@Setter
public class CrewMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private BigInteger crewID;
    @Column(name = "nombre_completo", nullable = false)
    private String nombreCompleto;
    @Column(name = "especialidad", nullable = false)
    private String especialidad;
    @Column(name = "rango")
    private String rango;
    @Column(name = "fecha_contratacion", nullable = false)
    private LocalDate fechaContratacion;



}
