package com.example.Crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity

@Table(name = "tbl_estudiante")



public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estudianteId;
    private String firstName;
    private String lastName;
    @Column(name = "rut", unique = true, nullable = false)
    private String rut;
    private int edad;
    @Column(name = "email",unique = true,nullable = false)
    private String email;

}
