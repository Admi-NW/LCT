package com.example.backend.service;

import com.example.backend.model.Test;
import com.example.backend.repository.TestRepository;

public class TestService {
    private TestRepository testRepository;
    
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
    
    public void saveTest(Test test) {
        testRepository.saveTest(test);
    }
    
    public Test getTestById(Long id) {
        return testRepository.getTestById(id);
    }
}
