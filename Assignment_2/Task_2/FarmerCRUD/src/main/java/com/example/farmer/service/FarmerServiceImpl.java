package com.example.farmer.service;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farmer.entity.Farmer;
import com.example.farmer.repository.FarmerRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FarmerServiceImpl implements FarmerService {

    private final FarmerRepository farmerRepository;

    @Autowired
    public FarmerServiceImpl(FarmerRepository farmerRepository) {
        this.farmerRepository = farmerRepository;
    }


    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }


    public Optional<Farmer> getFarmerById(Long id) {
        return farmerRepository.findById(id);
    }


    public Farmer saveFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }


    public void deleteFarmer(Long id) {
        farmerRepository.deleteById(id);
    }
}
