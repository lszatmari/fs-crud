package com.fscrud.backend.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "pilot")
public class Pilot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "team")
    private Team team;

    @Column(name = "number_of_championship_titles")
    private int numberOfChampionshipTitle;

    private boolean active;

    public Pilot() {
    }

    public Pilot(String name, LocalDate dateOfBirth, Team team, int numberOfChampionshipTitle, boolean active) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.team = team;
        this.numberOfChampionshipTitle = numberOfChampionshipTitle;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getNumberOfChampionshipTitle() {
        return numberOfChampionshipTitle;
    }

    public void setNumberOfChampionshipTitle(int numberOfChampionshipTitle) {
        this.numberOfChampionshipTitle = numberOfChampionshipTitle;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", team=" + team +
                ", numberOfChampionshipTitle=" + numberOfChampionshipTitle +
                ", active=" + active +
                '}';
    }
}
