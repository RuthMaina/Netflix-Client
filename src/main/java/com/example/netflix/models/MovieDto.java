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
public class MovieDto {
    private String movieName;
    private Year releaseYear;
    private Set<Categories> category;

    public MovieDto(String movieName, Year releaseYear, Set<Categories> category) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.category = category;
    }


}
