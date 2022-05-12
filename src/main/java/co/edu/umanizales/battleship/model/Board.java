package co.edu.umanizales.battleship.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Board
{
    private int id;
    private int cols;
    private int rows;
    private User player;
    private ListDE shipList;
    private boolean boardState;
    private List<Coordenate> recievedShoots;

    public Board(int rows,int cols,User player,ListDE shipList)
    {
        this.cols = cols;
        this.rows = rows;
        this.player = player;
        this.shipList = shipList;
        this.recievedShoots = new ArrayList<>();
    }


}
