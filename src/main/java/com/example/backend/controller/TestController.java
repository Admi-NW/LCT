package com.example.backend.controller;

import com.example.backend.model.Test;
import com.example.backend.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tests")
public class TestController {
    private TestService testService;
    
    public TestController(TestService testService) {
        this.testService = testService;
    }
    
    @PostMapping
    public ResponseEntity<Void> createTest(@RequestBody Test test) {
        testService.saveTest(test);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Test> getTest(@PathVariable Long id) {
        Test test = testService.getTestById(id);
        if (test != null) {
            return ResponseEntity.ok(test);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    // Другие методы, если необходимо
}
