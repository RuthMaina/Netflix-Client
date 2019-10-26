package com.example.netflix.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Users {
    private Long id;
    private String name;
    private String email;
    private boolean admin;
}
