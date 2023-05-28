package com.example.backend.model;

import javax.persistence.*;

@Entity
public class SchoolMentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Mentor mentor;

    // Дополнительные поля и связи с другими моделями

    // Конструкторы, геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    // ...

    // Другие методы
    // ...
}
