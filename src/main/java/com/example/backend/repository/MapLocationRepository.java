package com.example.backend.repository;

import com.example.backend.model.MapLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapLocationRepository extends JpaRepository<MapLocation, Long> {
    // Дополнительные методы доступа к данным, если необходимо
}
