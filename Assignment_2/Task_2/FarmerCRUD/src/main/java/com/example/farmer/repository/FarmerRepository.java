package com.example.farmer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.farmer.entity.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
}
