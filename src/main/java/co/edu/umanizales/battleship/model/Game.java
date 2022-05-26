package co.edu.umanizales.battleship.model;

import lombok.Data;

@Data
public class Game {
    private int id;
    private Board boardPlayer1;
    private Board boardPlayer2;
    private byte numberShips;
    private byte turn;
    private byte hitsPlayer1;
    private byte hitsPlayer2;

    public Game(User player1, User player2, ListDE shipList)
    {
        createBoards(player1,player2,shipList);
        this.numberShips= (byte)shipList.getSize();

    }

    private void createBoards(User player1, User player2, ListDE shipList)
    {
        if(shipList.getSize() <=9)
        {
            this.boardPlayer1= new Board((byte)10,(byte)10,player1,shipList);
            this.boardPlayer2= new Board((byte)10,(byte)10,player2,shipList.cloneList());
        }
        else if(shipList.getSize()>=10 && shipList.getSize()<=20)
        {
            this.boardPlayer1= new Board((byte)20,(byte)20,player1,shipList);
            this.boardPlayer2= new Board((byte)20,(byte)20,player2,shipList.cloneList());
        }
        else
        {
            this.boardPlayer1= new Board((byte)30,(byte)30,player1,shipList);
            this.boardPlayer2= new Board((byte)30,(byte)30,player2,shipList.cloneList());
        }
    }


    private User validateWinner()
    {
        return null;
    }

    public String validateShoot(int x, int y, User player)
    {
        return null;
    }
}