package com.swap.model;

public class MovieRating {
    String movieName;
    int rating;

    public MovieRating() {
    }

    public MovieRating(String movieName, int rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
