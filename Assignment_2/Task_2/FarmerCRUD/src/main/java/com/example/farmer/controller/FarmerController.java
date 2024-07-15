package com.example.farmer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.farmer.entity.Farmer;
import com.example.farmer.service.FarmerService;

import java.util.List;

@RestController
@RequestMapping("/api/farmers")
public class FarmerController {

    public FarmerService farmerService;

    @Autowired
    public FarmerController(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    // Endpoint to get all farmers
    @GetMapping
    public List<Farmer> getAllFarmers() {
        return farmerService.getAllFarmers();
    }

    // Endpoint to get a farmer by id
    @GetMapping("/{id}")
    public ResponseEntity<Farmer> getFarmerById(@PathVariable Long id) {
        return farmerService.getFarmerById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Endpoint to create a new farmer
    @PostMapping
    public ResponseEntity<Farmer> createFarmer(@RequestBody Farmer farmer) {
        Farmer savedFarmer = farmerService.saveFarmer(farmer);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedFarmer);
    }

    // Endpoint to update an existing farmer
    @PutMapping("/{id}")
    public ResponseEntity<Farmer> updateFarmer(@PathVariable Long id, @RequestBody Farmer farmerDetails) {
        return farmerService.getFarmerById(id).map(farmer -> {
            farmer.setName(farmerDetails.getName());
            farmer.setAge(farmerDetails.getAge());
            farmer.setLocation(farmerDetails.getLocation());
            Farmer updatedFarmer = farmerService.saveFarmer(farmer);
            return ResponseEntity.ok(updatedFarmer);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Endpoint to delete a farmer
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFarmer(@PathVariable Long id) {
        farmerService.deleteFarmer(id);
        return ResponseEntity.noContent().build();
    }
}
