package co.edu.umanizales.battleship.model;

import lombok.Data;

@Data
public class NodeDE {
    private ShipDistribution data;
    private NodeDE next;
    private NodeDE previous;

    public NodeDE(ShipDistribution data) {
        this.data = data;
    }
}