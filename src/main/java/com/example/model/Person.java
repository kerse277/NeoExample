package com.example.model;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by oguz on 19.06.2016.
 */
@NodeEntity
public class Person {

    @GraphId
    @Getter
    @Setter
    private String tc;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String surname;

    @Getter
    @Setter
    private String gender;

    @Setter
    @Getter
    private String hoby;

    @Setter
    @Getter
    private String photo;

    @Relationship(type = "ACTOR")
    private String relationShipType;




}
