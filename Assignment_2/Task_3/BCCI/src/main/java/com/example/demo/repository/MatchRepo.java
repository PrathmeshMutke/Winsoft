package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Match;


public interface MatchRepo extends JpaRepository<Match,Long> {

}
