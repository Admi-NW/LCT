package com.example.backend.controller;

import com.example.backend.model.MapLocation;
import com.example.backend.repository.MapLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class MapLocationController {
    private final MapLocationRepository locationRepository;

    @Autowired
    public MapLocationController(MapLocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping
    public List<MapLocation> getAllLocations() {
        return locationRepository.findAll();
    }

    // Дополнительные методы обработки запросов, если необходимо
}
