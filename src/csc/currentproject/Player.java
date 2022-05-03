package csc.currentproject;

public class Player
{
    ////////////////////////////////////////////////////////////////////////////////////////
    // PLAYER STORAGE
    ////////////////////////////////////////////////////////////////////////////////////////
    // SET
    private String userName;
    private int score;
    void setUserName(String userName){
        this.userName = userName;
    }

    // GET
    String getUserName(){
        return userName;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    // PLAYER SCORE STORAGE
    ////////////////////////////////////////////////////////////////////////////////////////
    // SET
    int p1Score, p2Score;
    void resetP1(){p1Score = 0;}
    void resetP2(){p2Score = 0;}
    void setP1Score(int total){p1Score += total;}
    void setP2Score(int total){p2Score += total;}
    // GET
    int getP1Score(){return p1Score;}
    int getP2Score(){return p2Score;}
}
