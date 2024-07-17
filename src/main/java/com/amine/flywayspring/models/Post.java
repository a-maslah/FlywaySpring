package com.amine.flywayspring.models;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String title;

    @Column(columnDefinition = "TEXT")
    String body;

    Timestamp createdOn;

}
