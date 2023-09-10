package com.fscrud.backend.domain;

import java.util.List;

public class RaceInfoDto {
    private List<Destination> destinations;
    private List<Pilot> pilots;

    public RaceInfoDto(List<Destination> destinations, List<Pilot> pilots) {
        this.destinations = destinations;
        this.pilots = pilots;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }
}
