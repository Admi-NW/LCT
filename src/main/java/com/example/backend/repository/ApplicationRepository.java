package com.example.backend.repository;

import com.example.backend.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    // Дополнительные методы доступа к данным, если необходимо
}
