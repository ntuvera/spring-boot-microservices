package com.example.songsapi.model;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String artist;

    @Column
    private Long length;

}
