package com.chris.historygalaxy.domain.service;

import com.chris.historygalaxy.domain.entity.node.PersonEntity;
import com.chris.historygalaxy.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Mono<PersonEntity> createNewPerson(PersonEntity personEntity) {
        return personRepository.save(personEntity);
    }
}
