package com.fscrud.backend.service;

import com.fscrud.backend.domain.Destination;
import com.fscrud.backend.domain.Pilot;
import com.fscrud.backend.domain.Race;
import com.fscrud.backend.domain.RaceDto;
import com.fscrud.backend.repository.DestinationRepository;
import com.fscrud.backend.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class RaceService {

    private RaceRepository raceRepository;
    private DestinationService destinationService;
    private PilotService pilotService;

    @Autowired
    public RaceService(RaceRepository raceRepository, DestinationService destinationService, PilotService pilotService) {
        this.raceRepository = raceRepository;
        this.destinationService = destinationService;
        this.pilotService = pilotService;
    }

    public List<Race> findAll() {
        List<Race> races = raceRepository.findAll();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (var item : races) {
            LocalDate newDate = LocalDate.parse(item.getDateOfRace().toString(), dateTimeFormatter);
            item.setDateOfRace(newDate);
        }
        return races;
    }

    public Race save(RaceDto newRaceDto) {
        return raceRepository.save(raceDtoMapper(newRaceDto));
    }

    private Race raceDtoMapper(RaceDto raceDto) {
        Destination newDestination = destinationService.findById(raceDto.getDestination());
        Pilot newPilot = pilotService.findById(raceDto.getRaceWinner());
        LocalDate date = raceDto.getDateOfRace();
        int dnfs = raceDto.getNumberOfDNFs();

        return new Race(newPilot, newDestination, date, dnfs);
    }

    public void delete(Long id) {
        raceRepository.deleteById(id);
    }
}
