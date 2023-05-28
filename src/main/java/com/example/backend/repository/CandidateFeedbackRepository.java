package com.example.backend.repository;

import com.example.backend.model.CandidateFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateFeedbackRepository extends JpaRepository<CandidateFeedback, Long> {
    // Дополнительные методы репозитория, если необходимо
}
