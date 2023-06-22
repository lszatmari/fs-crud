package com.fscrud.backend.controller;

import com.fscrud.backend.domain.Race;
import com.fscrud.backend.domain.RaceDto;
import com.fscrud.backend.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RaceController {

    private RaceService raceService;

    @Autowired
    public RaceController(RaceService raceService) {
        this.raceService = raceService;
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
}
