package com.example.backend.repository;

import com.example.backend.model.SchoolMentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolMentorRepository extends JpaRepository<SchoolMentor, Long> {
    // Дополнительные методы доступа к данным, если необходимо
}
