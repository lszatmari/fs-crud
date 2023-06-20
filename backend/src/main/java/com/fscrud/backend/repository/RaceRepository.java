package com.fscrud.backend.repository;

import com.fscrud.backend.domain.Race;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RaceRepository extends CrudRepository<Race, Long> {

    List<Race> findAll();
}
