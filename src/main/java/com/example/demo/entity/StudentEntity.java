package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.;
import jakarta.persistence.Entity;


@Entity
public class StudentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;
}