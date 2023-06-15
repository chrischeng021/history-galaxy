package com.chris.historygalaxy.domain.entity.node;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

@NodeEntity("Person")
@Data
@Builder
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;

    // 全名，sample: 刘备
    private String fullName;

    // 姓氏，sample: 刘
    private String surName;

    // 名，sample: 备
    private String firstName;

    // 表字，sample: 玄德
    private String secondaryName;
}
