package com.fscrud.backend.repository;

import com.fscrud.backend.domain.Pilot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface PilotRepository extends CrudRepository<Pilot, Long> {

    Optional<Pilot> findById(@NonNull Long id);

    List<Pilot> findAll();
}
