package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.InternshipDemand;

public interface InternshipDemandRepository extends JpaRepository<InternshipDemand, Long> {
    // Добавьте необходимые методы для работы с данными о заявках на стажировку
}