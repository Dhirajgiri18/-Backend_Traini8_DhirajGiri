package com.traini8.backend.service;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Service;

import com.traini8.backend.model.TrainingCenter;
import com.traini8.backend.repository.TrainingCenterRepository;

@Service
public class TrainingCenterService {

    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(Instant.now()); // Server timestamp
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
