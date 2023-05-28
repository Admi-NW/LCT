package com.example.backend.repository;

import com.example.backend.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    // Дополнительные методы доступа к данным, если необходимо
}
