package com.kaiburr.assessment.repository;

import com.kaiburr.assessment.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface Repository extends MongoRepository<Server,Long> {
    List<Server> findByName(String name);
    Optional<Server> findByid(Long id);
}
