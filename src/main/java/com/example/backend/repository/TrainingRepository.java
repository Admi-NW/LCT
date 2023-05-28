package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.Training;

public interface TrainingRepository extends JpaRepository<Training, Long> {
    // Дополнительные методы репозитория, если необходимо
}