package com.chris.historygalaxy.domain.repository;

import com.chris.historygalaxy.domain.entity.node.PersonEntity;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

public interface PersonRepository extends ReactiveNeo4jRepository<PersonEntity, Long> {
}
