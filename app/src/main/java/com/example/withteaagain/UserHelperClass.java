package com.example.withteaagain;

public class UserHelperClass {

    String movie, flower;

    public UserHelperClass(String movie, String flower) {
        this.movie = movie;
        this.flower = flower;
    }

    public String getMovie(){
        return movie;
    }

    public void setMovie(String movie){
        this.movie = movie;
    }
    public String getFlower(){
        return flower;
    }
    public void setFlower(String flower){
        this.flower = flower;
    }

}
