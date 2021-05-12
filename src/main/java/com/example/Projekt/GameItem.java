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


    public GameItem(String title, Type type, String production, String description) {
        this.title = title;
        this.type = type;
        this.production = production;
        this.description = description;
    }


    //private Long Id;

    private String title;

    private Type type;

    private String production;

    private String description;
}
