package co.edu.umanizales.battleship.model;

import lombok.Data;

@Data
public class Ship {
    private int id; //Se va a hacer autonumerico
    private String name;
    private byte numberPlaces;

    public Ship(String name, byte numberPlaces) {
        this.name = name;
        this.numberPlaces = numberPlaces;
    }
}