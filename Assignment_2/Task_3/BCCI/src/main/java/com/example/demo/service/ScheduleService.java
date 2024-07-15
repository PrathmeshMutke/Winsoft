package com.example.demo.service;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Match;
import com.example.demo.model.Series;
import com.example.demo.repository.SeriesRepository;
@Service
public class ScheduleService {

    @Autowired
    private SeriesRepository seriesRepository;

    public Series createSeries(Series series) {
        for (Match match : series.getMatches()) {
            match.setSeries(series);
        }
        return seriesRepository.save(series);
    }

    public Optional<Series> updateSeries(Long id, Series series) {
        return seriesRepository.findById(id).map(existingSeries -> {
            existingSeries.setName(series.getName());
            existingSeries.setStartDate(series.getStartDate());
            existingSeries.setEndDate(series.getEndDate());

            existingSeries.getMatches().clear();
            for (Match match : series.getMatches()) {
                match.setSeries(existingSeries);
                existingSeries.getMatches().add(match);
            }

            return seriesRepository.save(existingSeries);
        });
    }

    public void deleteSeries(Long id) {
        seriesRepository.deleteById(id);
    }

    public List<Series> getAllSeries() {
        return seriesRepository.findAll();
    }

    public Optional<Series> getSeries(Long id) {
        return seriesRepository.findById(id);
    }
}
