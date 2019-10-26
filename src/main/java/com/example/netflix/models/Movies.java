package com.example.netflix.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Year;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Movies {
    private Long id;
    private String movieName;
    private Year releaseYear;
    private String movieId;
    private String type;
    Set<Categories> category;
    private Users user;
}
