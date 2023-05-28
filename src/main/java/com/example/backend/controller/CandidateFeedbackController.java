package com.example.backend.controller;

import com.example.backend.model.CandidateFeedback;
import com.example.backend.service.CandidateFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate-feedbacks")
public class CandidateFeedbackController {
    private final CandidateFeedbackService candidateFeedbackService;

    @Autowired
    public CandidateFeedbackController(CandidateFeedbackService candidateFeedbackService) {
        this.candidateFeedbackService = candidateFeedbackService;
    }

    @GetMapping
    public ResponseEntity<List<CandidateFeedback>> getAllCandidateFeedbacks() {
        List<CandidateFeedback> candidateFeedbacks = candidateFeedbackService.getAllCandidateFeedbacks();
        return new ResponseEntity<>(candidateFeedbacks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidateFeedback> getCandidateFeedbackById(@PathVariable Long id) {
        CandidateFeedback candidateFeedback = candidateFeedbackService.getCandidateFeedbackById(id);
        return new ResponseEntity<>(candidateFeedback, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CandidateFeedback> createCandidateFeedback(@RequestBody CandidateFeedback candidateFeedback) {
        CandidateFeedback createdFeedback = candidateFeedbackService.createCandidateFeedback(candidateFeedback);
        return new ResponseEntity<>(createdFeedback, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCandidateFeedback(@PathVariable Long id) {
        candidateFeedbackService.deleteCandidateFeedback(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
