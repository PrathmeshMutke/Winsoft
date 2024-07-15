package com.example.farmer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.farmer.entity.Farmer;
@Service
public interface FarmerService {

    List<Farmer> getAllFarmers();

    Optional<Farmer> getFarmerById(Long id);

    Farmer saveFarmer(Farmer farmer);

    void deleteFarmer(Long id);
}