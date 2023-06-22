package com.fscrud.backend.service;

import com.fscrud.backend.domain.Destination;
import com.fscrud.backend.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationService {

    private DestinationRepository destinationRepository;

    @Autowired
    public void setDestinationRepository(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    public Destination findById(Long id) {
        return destinationRepository.findById(id).orElseThrow();
    }
}
