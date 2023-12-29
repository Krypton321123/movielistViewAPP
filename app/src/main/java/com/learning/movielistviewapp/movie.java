package com.learning.movielistviewapp;

public class movie {
    private String title;
    private String genre;
    private int releaseYear;

    public String gettitle(){
        return title;
    }
    public String getgenre(){
        return genre;
    }
    public int getreleaseYear(){
        return releaseYear;
    }
    public movie(String title, String genre, int releaseYear){
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
}
