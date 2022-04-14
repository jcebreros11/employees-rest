package com.jcebz.employees.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Employee {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;
        @NotEmpty(message="First Name cannot be blank!")
        private String firstName;
        @NotEmpty(message="Last Name cannot be blank!")
        private String lastName;
        private String title;
        private String department;
        @DateTimeFormat(pattern="yyyy-MM-dd")
        private Date startDate;
        private String status;
        @Min(value = 10000, message = "The minimum salary is $10,000")
        private double salary ;
}
