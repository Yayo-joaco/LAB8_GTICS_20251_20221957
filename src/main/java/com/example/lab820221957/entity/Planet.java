package com.example.lab820221957.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Table(name = "planets")
@Getter
@Setter
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private BigInteger id;
    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;
    @Column(name = "tipo_planeta", nullable = false)
    private String tipoPlaneta;
    @Column(name = "habitable", nullable = false)
    private boolean habitable;
    @Column(name = "gravedad_relativa", nullable = false)
    private Double gravedadRelativa;
    @Column(name = "descripcion")
    private String descripcion;

}
