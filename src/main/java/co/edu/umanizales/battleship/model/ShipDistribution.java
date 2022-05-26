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
        this.coordinates = new Coordenate[ship.getNumberPlaces()];
        this.state = "FREE";
    }

    //no se recorre cuando orientacion este en cero
    public boolean validateCoordinateExist(Coordenate coordenate)
    {
        if(this.orientation ==0)
            return false;
        for(Coordenate coord: this.coordinates)
        {
            if(coord.getX()==coordenate.getX() && coord.getY()==coordenate.getY() )
            {
                return true;
            }
        }
        return false;
    }
}