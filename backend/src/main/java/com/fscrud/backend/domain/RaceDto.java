package com.fscrud.backend.domain;

import java.time.LocalDate;

public class RaceDto {
    private Long raceWinner;
    private Long destination;
    private LocalDate dateOfRace;
    private int numberOfDNFs;

    public RaceDto(Long raceWinner, Long destination, LocalDate dateOfRace, int numberOfDNFs) {
        this.raceWinner = raceWinner;
        this.destination = destination;
        this.dateOfRace = dateOfRace;
        this.numberOfDNFs = numberOfDNFs;
    }

    public Long getRaceWinner() {
        return raceWinner;
    }

    public void setRaceWinner(Long raceWinner) {
        this.raceWinner = raceWinner;
    }

    public Long getDestination() {
        return destination;
    }

    public void setDestination(Long destination) {
        this.destination = destination;
    }

    public LocalDate getDateOfRace() {
        return dateOfRace;
    }

    public void setDateOfRace(LocalDate dateOfRace) {
        this.dateOfRace = dateOfRace;
    }

    public int getNumberOfDNFs() {
        return numberOfDNFs;
    }

    public void setNumberOfDNFs(int numberOfDNFs) {
        this.numberOfDNFs = numberOfDNFs;
    }

    @Override
    public String toString() {
        return "RaceDto{" +
                "raceWinner=" + raceWinner +
                ", destination=" + destination +
                ", dateOfRace=" + dateOfRace +
                ", numberOfDNFs=" + numberOfDNFs +
                '}';
    }
}
