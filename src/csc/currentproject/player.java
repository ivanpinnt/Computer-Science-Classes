package csc.currentproject;

import java.util.Random;

public class player
{
    // LIBRARY
    private String userName;
    private int score;

    // SET
    void setUserName(String userName){
        this.userName = userName;
    }

    void setScore(int grabScore){
        score += grabScore;
    }

    // GET
    String getUserName(){
        return userName;
    }

    int getScore(){
        return score;
    }
}
