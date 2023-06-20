package com.fscrud.backend.controller;

import com.fscrud.backend.domain.Destination;
import com.fscrud.backend.domain.Pilot;
import com.fscrud.backend.domain.Race;
import com.fscrud.backend.domain.Team;
import com.fscrud.backend.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
        return raceService.getRaces();
    }
}
