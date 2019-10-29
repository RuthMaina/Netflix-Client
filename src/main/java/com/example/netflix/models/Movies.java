package com.example.netflix.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Year;
import java.util.List;
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
    private List<Categories> category;
    private Users user;

    public Movies(String movieName, Year releaseYear, List<Categories> category) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.category = category;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Categories> getCategory() {
        return category;
    }

    public void setCategory(List<Categories> category) {
        this.category = category;
    }
}
