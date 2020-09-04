package com.uvs.customlistviewvolley.model;

import java.util.List;

/**
 * Cette classe est une représentation des données récupéré de https://api.androidhive.info/json/movies.json
 */
public class Movie {
    private String title;
    private String thumbnailUrl;
    private int year;
    private double rating;
    private List<String> genre;

    public Movie() {
    }

    public Movie(String name, String thumbnailUrl, int year, double rating,
                 List<String> genre) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }
}
