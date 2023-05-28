package com.example.backend.repository;

import com.example.backend.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
    // Дополнительные методы репозитория, если необходимо
}
