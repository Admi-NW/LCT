package com.example.backend.model;

//import java.util.List;

public class Test {
    private Long id;
    private String name;
    //private List<Question> questions; не имплементировано
    
    // Конструкторы, геттеры и сеттеры

    public Test() {
    }

    public Test(Long id, String name) {
        this.id = id;
        this.name = name;
        //this.questions = questions;
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

   /* public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }*/
    
    // Другие методы, если необходимо
}
