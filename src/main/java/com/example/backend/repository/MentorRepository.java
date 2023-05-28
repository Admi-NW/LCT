package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, Long> {
    // Дополнительные методы репозитория, если необходимо
}