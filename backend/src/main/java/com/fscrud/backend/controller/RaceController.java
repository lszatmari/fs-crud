package com.fscrud.backend.controller;

import com.fscrud.backend.domain.*;
import com.fscrud.backend.service.DestinationService;
import com.fscrud.backend.service.PilotService;
import com.fscrud.backend.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RaceController {

    private RaceService raceService;
    private PilotService pilotService;
    private DestinationService destinationService;

    @Autowired
    public RaceController(RaceService raceService, PilotService pilotService, DestinationService destinationService) {
        this.raceService = raceService;
        this.pilotService = pilotService;
        this.destinationService = destinationService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/")
    public List<Race> racesList() {
        return raceService.findAll();
    }

    @PostMapping("/races/add")
    public Race createNewRace(@RequestBody RaceDto newRace) {
        System.out.println(newRace);
        return raceService.save(newRace);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/races/get-all-info")
    public RaceInfoDto getAllRaceInfo() {
        List<Destination> destinations = destinationService.findAll();
        List<Pilot> pilots = pilotService.findAll();

        return new RaceInfoDto(destinations, pilots);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/races/{id}")
    public void deleteRace(@PathVariable Long id) {
        raceService.delete(id);
    }
}
