package co.edu.umanizales.battleship.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Board {
    private int id;
    private byte cols;
    private byte rows;
    private User player;
    private ListDE shipList;
    private boolean boardState;
    private List<Coordenate> receivedShoots;

    public Board(byte cols, byte rows, User player, ListDE shipList) {
        this.cols = cols;
        this.rows = rows;
        this.player = player;
        this.shipList = shipList;
        this.receivedShoots = new ArrayList<>();
    }

    public String validateShoot(int x, int y)
    {
        return null;
    }
}
