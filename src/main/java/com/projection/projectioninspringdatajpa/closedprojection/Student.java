package com.projection.projectioninspringdatajpa.closedprojection;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer rollNo;
    private String standard;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Address address;



}
