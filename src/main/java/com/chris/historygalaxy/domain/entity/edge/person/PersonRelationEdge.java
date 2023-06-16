package com.chris.historygalaxy.domain.entity.edge.person;

import com.chris.historygalaxy.domain.entity.node.PersonEntity;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "PersonRelationEdge")
@Data
public class PersonRelationEdge {
    @Id
    @GeneratedValue
    private Long id;

    // 关系名
    private String name;

    @StartNode
    private PersonEntity from;

    @EndNode
    private PersonEntity to;

    public PersonRelationEdge(PersonEntity from, PersonEntity to, String name) {
        this.from = from;
        this.to = to;
        this.name = name;
    }
}
