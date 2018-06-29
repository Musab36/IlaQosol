package com.salajim.musab.ilaqosol.models;

public class Categories {
    private String joke;
    private String description;

    public Categories() {}

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

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
