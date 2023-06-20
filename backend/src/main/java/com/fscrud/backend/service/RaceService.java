package com.fscrud.backend.service;

import com.fscrud.backend.domain.Race;
import com.fscrud.backend.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class RaceService {

    private RaceRepository raceRepository;

    @Autowired
    public void setRaceRepository(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public List<Race> getRaces() {
        List<Race> races = raceRepository.findAll();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (var item : races) {
            LocalDate newDate = LocalDate.parse(item.getDateOfRace().toString(), dateTimeFormatter);
            item.setDateOfRace(newDate);
        }
        return races;
    }
}
