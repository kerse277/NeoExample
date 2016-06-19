package com.example.model;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by oguz on 19.06.2016.
 */
@NodeEntity
public class Places {

    @GraphId
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String title;
}
