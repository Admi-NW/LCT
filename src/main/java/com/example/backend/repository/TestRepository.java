package com.example.backend.repository;

import com.example.backend.model.Test;

public interface TestRepository {
    void saveTest(Test test);
    Test getTestById(Long id);
    // Другие методы, если необходимо
}
