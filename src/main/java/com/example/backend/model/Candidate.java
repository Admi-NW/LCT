package com.example.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String citizenship;
    private int completedCourses;
    private boolean hasRelevantExperience;

    // Конструкторы, геттеры, сеттеры и другие методы

    // Конструктор по умолчанию (необходим для JPA)
    public Candidate() {
    }

    public Candidate(String name, String citizenship, int completedCourses, boolean hasRelevantExperience) {
        this.name = name;
        this.citizenship = citizenship;
        this.completedCourses = completedCourses;
        this.hasRelevantExperience = hasRelevantExperience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public int getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(int completedCourses) {
        this.completedCourses = completedCourses;
    }

    public boolean isHasRelevantExperience() {
        return hasRelevantExperience;
    }

    public void setHasRelevantExperience(boolean hasRelevantExperience) {
        this.hasRelevantExperience = hasRelevantExperience;
    }
}
