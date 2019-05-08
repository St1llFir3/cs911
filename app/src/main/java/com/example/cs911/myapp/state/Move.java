package com.example.cs911.myapp.state;

public class Move {

    private PlayerType player;
    private int moveDetail;

    public Move(PlayerType Player){
        this.player = player;
    }

    public  PlayerType getPlayer(){ return player; }

    public int getMove() { return moveDetail; }
}
