package com.java.springbootapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.ZonedDateTime;


@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_id_seq")
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DEPARTMENT")
    private String department;
    @Column(name = "NOTE")
    private String note;
    @Column(name = "EXPERIENCE")
    private String experience;
    @Column(name = "CREATED_DATE")
    private ZonedDateTime createdDate = ZonedDateTime.now();
    @Column(name = "MODIFIED_DATE")
    private ZonedDateTime modifiedData = ZonedDateTime.now();
}
