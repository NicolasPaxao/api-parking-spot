package com.api.parkingcontrol.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingSpotModelRepository extends JpaRepository<ParkingSpotModel, UUID> {
}