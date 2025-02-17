package co.smartbeam.csvparser;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    private Long id;
    private String name;
    private int age;
    private String email;
    // Getters and Setters

}