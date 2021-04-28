package com.example.Projekt;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class GameItem {

    private Long Id;

    private String title;

    private Type type;

    private String production;

    private String description;
}
