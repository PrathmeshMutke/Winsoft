package com.example.demo.controller;

//ScheduleController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Series;
import com.example.demo.service.ScheduleService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {
	
 @Autowired
 private ScheduleService scheduleService;

 @PostMapping
 public ResponseEntity<Series> createSeries(@RequestBody Series series) {
     return ResponseEntity.ok(scheduleService.createSeries(series));
 }

 /*@PutMapping("/{id}")
 public ResponseEntity<Series> updateSeries(@PathVariable Long id, @RequestBody Series series) {
     Optional<Series> updatedSeries = scheduleService.updateSeries(id, series);
     return updatedSeries.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
 }*/
 
 @PutMapping("/{id}")
 public ResponseEntity<Series> updateSeries(@PathVariable Long id, @RequestBody Series series) {
     return scheduleService.updateSeries(id, series)
         .map(updatedSeries -> ResponseEntity.ok(updatedSeries))
         .orElseGet(() -> ResponseEntity.notFound().build());
 }


 @DeleteMapping("/{id}")
 public ResponseEntity<Void> deleteSeries(@PathVariable Long id) {
     scheduleService.deleteSeries(id);
     return ResponseEntity.ok().build();
 }

 @GetMapping
 public List<Series> getAllSeries() {
     return scheduleService.getAllSeries();
 }

 @GetMapping("/{id}")
 public ResponseEntity<Series> getSeries(@PathVariable Long id) {
     Optional<Series> series = scheduleService.getSeries(id);
     return series.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
 }
}

