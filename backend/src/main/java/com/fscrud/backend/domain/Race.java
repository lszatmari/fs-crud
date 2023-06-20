package com.fscrud.backend.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "race")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "race_winner")
    private Pilot raceWinner;
    @ManyToOne
    @JoinColumn(name = "destination")
    private Destination destination;
    @Column(name = "date_of_race")
    private LocalDate dateOfRace;
    @Column(name = "number_of_dnfs")
    private int numberOfDNFs;

    public Race() {
    }

    public Race(Pilot raceWinner, Destination destination, LocalDate dateOfRace, int numberOfDNFs) {
        this.raceWinner = raceWinner;
        this.destination = destination;
        this.dateOfRace = dateOfRace;
        this.numberOfDNFs = numberOfDNFs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pilot getRaceWinner() {
        return raceWinner;
    }

    public void setRaceWinner(Pilot raceWinner) {
        this.raceWinner = raceWinner;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
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
        return "Race{" +
                "id=" + id +
                ", raceWinner=" + raceWinner +
                ", destination=" + destination +
                ", dateOfRace=" + dateOfRace +
                ", numberOfDNFs=" + numberOfDNFs +
                '}';
    }
}
