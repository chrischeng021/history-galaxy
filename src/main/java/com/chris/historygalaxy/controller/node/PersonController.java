package com.chris.historygalaxy.controller.node;

import com.chris.historygalaxy.domain.entity.node.PersonEntity;
import com.chris.historygalaxy.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/v1/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/createNewPerson")
    Mono<PersonEntity> createNewPerson(@RequestBody PersonEntity personEntity) {
        return personService.createNewPerson(personEntity);
    }

    @GetMapping("/findByFullName")
    Mono<List<PersonEntity>> findPersonByName(@RequestParam String fullName) {
        return personService.findPersonByFullName(fullName);
    }
}
