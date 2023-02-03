package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.IParkingSpotRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {
    final IParkingSpotRepository _repository;

    public ParkingSpotService(IParkingSpotRepository repository){
        this._repository = repository;
    }
    
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return _repository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return _repository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return  _repository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return _repository.existsByApartmentAndBlock(apartment , block);
    }

    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return _repository.findAll(pageable);
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return _repository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        _repository.delete(parkingSpotModel);
    }
}
