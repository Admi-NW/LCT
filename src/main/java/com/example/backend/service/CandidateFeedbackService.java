package com.example.backend.service;

import com.example.backend.exception.NotFoundException;
import com.example.backend.model.CandidateFeedback;
import com.example.backend.repository.CandidateFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateFeedbackService {
    private final CandidateFeedbackRepository candidateFeedbackRepository;

    @Autowired
    public CandidateFeedbackService(CandidateFeedbackRepository candidateFeedbackRepository) {
        this.candidateFeedbackRepository = candidateFeedbackRepository;
    }

    public List<CandidateFeedback> getAllCandidateFeedbacks() {
        return candidateFeedbackRepository.findAll();
    }

    public CandidateFeedback getCandidateFeedbackById(Long id) {
        return candidateFeedbackRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Candidate feedback not found with id: " + id));
    }

    public CandidateFeedback createCandidateFeedback(CandidateFeedback candidateFeedback) {
        // Дополнительная логика сохранения обратной связи о стажере
        return candidateFeedbackRepository.save(candidateFeedback);
    }

    public void deleteCandidateFeedback(Long id) {
        // Дополнительная логика удаления обратной связи о стажере
        candidateFeedbackRepository.deleteById(id);
    }
}
