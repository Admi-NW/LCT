package com.example.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InternshipDemand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String position;
    private String description;
    private String desiredSkills;
    
    // Геттеры и сеттеры для полей
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesiredSkills() {
        return desiredSkills;
    }

    public void setDesiredSkills(String desiredSkills) {
        this.desiredSkills = desiredSkills;
    }

    // Дополнительные конструкторы и методы
    // ...

    // Конструктор по умолчанию (необходим для JPA)
    public InternshipDemand() {
    }

    public InternshipDemand(String position, String description, String desiredSkills) {
        this.position = position;
        this.description = description;
        this.desiredSkills = desiredSkills;
    }
}
