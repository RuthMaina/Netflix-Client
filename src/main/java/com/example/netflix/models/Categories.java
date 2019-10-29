package com.example.netflix.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@RequiredArgsConstructor
public class Categories {
    private String id;
    private String category;

    public Categories(String category) {
        this.category = category;
    }

    public Categories(String id, String category) {
        this.id = id;
        this.category = category;
    }

    public Categories() {
    }
}
