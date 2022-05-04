package co.edu.umanizales.battleship.model;

import lombok.Data;

@Data
public class ShipDistribution {
    private Ship ship;
    private String state;
    private Coordenate[] coordinates;
    private byte orientation;

    public ShipDistribution(Ship ship) {
        this.ship = ship;
        this.coordinates = new Coordenate[ship.getNumPlaces()];
        this.state="FREE";
    }
}