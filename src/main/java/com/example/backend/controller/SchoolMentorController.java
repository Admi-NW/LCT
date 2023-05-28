package com.example.backend.controller;

import com.example.backend.model.SchoolMentor;
import com.example.backend.repository.SchoolMentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/school-mentors")
public class SchoolMentorController {
    private final SchoolMentorRepository schoolMentorRepository;

    @Autowired
    public SchoolMentorController(SchoolMentorRepository schoolMentorRepository) {
        this.schoolMentorRepository = schoolMentorRepository;
    }

    @GetMapping
    public List<SchoolMentor> getAllSchoolMentors() {
        return schoolMentorRepository.findAll();
    }

    // Дополнительные методы обработки запросов, если необходимо
}
