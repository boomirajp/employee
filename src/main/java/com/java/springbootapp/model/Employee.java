package com.java.springbootapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;


@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String department;
    private String note;
    private String experience;
    private ZonedDateTime createdDate;
    private ZonedDateTime modifiedDate;
}
