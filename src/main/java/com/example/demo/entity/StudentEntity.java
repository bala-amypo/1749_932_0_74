package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;


@Entity
public class StudentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Please fill all the fields")
    private String name;
    @NotBlank(message="Please fill all the fields")
    @Email(message="Invalid Format")
    private String email;
    @Min(value=7,message="Low CGPA")
    private double cgpa;

    public StudentEntity(Long id, @NotBlank(message="Please fill the fields")
 String name, @NotBlank(message="Please fill the fields")
    @Email(message="Invalid Format") String email,float cgpa){
        this.id=id;
        this.name=name;
        this.email=email;
        this.cgpa=cgpa;
    }

    public StudentEntity(){
        
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public double getCgpa(){
        return this.cgpa;
    }
}



//@NotBlank(message="Please fill all the fields")
//@Email(message="Invalid Format")
//@Size(min=18 , max=40 , message="Out of range")