package com.salajim.musab.ilaqosol.models;

public class Categories {
    private String joke;
    private String description;

    public Categories(String joke, String description) {
        this.joke = joke;
        this.description = description;
    }

    public String getJoke() {
        return joke;
    }

    public String getDescription() {
        return description;
    }
}
