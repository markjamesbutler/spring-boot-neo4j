package com.mb.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class User {

    @GraphId
    private Long id;

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

}
