package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend.model.InternshipDemand;
import com.example.backend.repository.InternshipDemandRepository;

import java.util.List;

@RestController
@RequestMapping("/internship-demands")
public class InternshipDemandController {
    private final InternshipDemandRepository internshipDemandRepository;

    @Autowired
    public InternshipDemandController(InternshipDemandRepository internshipDemandRepository) {
        this.internshipDemandRepository = internshipDemandRepository;
    }

    @GetMapping
    public List<InternshipDemand> getAllInternshipDemands() {
        return internshipDemandRepository.findAll();
    }

    @GetMapping("/{id}")
    public InternshipDemand getInternshipDemandById(@PathVariable Long id) {
        return internshipDemandRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Internship Demand ID: " + id));
    }

    @PostMapping
    public InternshipDemand createInternshipDemand(@RequestBody InternshipDemand internshipDemand) {
        return internshipDemandRepository.save(internshipDemand);
    }

    @PutMapping("/{id}")
    public InternshipDemand updateInternshipDemand(@PathVariable Long id, @RequestBody InternshipDemand updatedInternshipDemand) {
        return internshipDemandRepository.findById(id)
                .map(internshipDemand -> {
                    // Обновите данные о заявке на стажировку
                    // internshipDemand.setXXX(updatedInternshipDemand.getXXX());
                    return internshipDemandRepository.save(internshipDemand);
                })
                .orElseThrow(() -> new IllegalArgumentException("Invalid Internship Demand ID: " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteInternshipDemand(@PathVariable Long id) {
        internshipDemandRepository.deleteById(id);
    }
}
