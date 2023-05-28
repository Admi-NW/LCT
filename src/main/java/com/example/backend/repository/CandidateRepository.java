// CandidateRepository.java (Репозиторий Candidate)
package com.example.backend.repository;

import com.example.backend.model.Candidate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    // Методы репозитория для работы с кандидатами
    // ...

    // Пример метода для получения списка подходящих кандидатов
    List<Candidate> findByCountryAndCompletedCoursesGreaterThanEqualAndHasRelevantExperience(
        String country, int completedCourses, boolean hasRelevantExperience);
}
