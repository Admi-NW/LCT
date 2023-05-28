package com.example.backend.service;

import com.example.backend.exception.NotFoundException;
import com.example.backend.model.Request;
import com.example.backend.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    @Autowired
    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public Request getRequestById(Long id) {
        return requestRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Request not found with id: " + id));
    }

    public Request createRequest(Request request) {
        // Дополнительная логика сохранения заявки
        return requestRepository.save(request);
    }

    public void deleteRequest(Long id) {
        // Дополнительная логика удаления заявки
        requestRepository.deleteById(id);
    }
}
