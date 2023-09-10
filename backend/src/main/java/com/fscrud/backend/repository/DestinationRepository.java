package com.fscrud.backend.repository;

import com.fscrud.backend.domain.Destination;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface DestinationRepository extends CrudRepository<Destination, Long> {

    Optional<Destination> findById(@NonNull Long id);

    List<Destination> findAll();
}
