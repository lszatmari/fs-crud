package com.fscrud.backend.service;

import com.fscrud.backend.domain.Pilot;
import com.fscrud.backend.repository.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotService {

    PilotRepository pilotRepository;

    @Autowired
    public void setPilotRepository(PilotRepository pilotRepository) {
        this.pilotRepository = pilotRepository;
    }

    public Pilot findById(Long id) {
        return pilotRepository.findById(id).orElseThrow();
    }

    public List<Pilot> findAll() {
        return pilotRepository.findAll();
    }
}
