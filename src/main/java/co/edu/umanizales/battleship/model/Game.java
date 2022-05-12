package co.edu.umanizales.battleship.model;

import lombok.Data;

@Data
public class Game
{
    private int id;
    private Board boardPlayer1;
    private Board boardPlayer2;
    private byte numberOfShips;
    private byte turn;
    private int stikesPlayer1;
    private int stikesPlayer2;
}
