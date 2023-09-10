package com.fscrud.backend.controller;

import com.fscrud.backend.domain.Pilot;
import com.fscrud.backend.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PilotController {

    private PilotService pilotService;

    @Autowired
    public void setPilotService(PilotService pilotService) {
        this.pilotService = pilotService;
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/get-all-pilots")
    public List<Pilot> getAllPilots() {
        return pilotService.findAll();
    }
}
